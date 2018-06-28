/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50713
Source Host           : localhost:3306
Source Database       : bcnews

Target Server Type    : MYSQL
Target Server Version : 50713
File Encoding         : 65001

Date: 2018-06-28 11:38:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `channel`
-- ----------------------------
DROP TABLE IF EXISTS `channel`;
CREATE TABLE `channel` (
  `ch_id` int(11) NOT NULL,
  `ch_code` varchar(255) NOT NULL,
  `ch_name` varchar(255) NOT NULL,
  `ch_priority` int(11) NOT NULL,
  PRIMARY KEY (`ch_id`),
  UNIQUE KEY `ch_code` (`ch_code`) USING HASH
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of channel
-- ----------------------------
INSERT INTO `channel` VALUES ('1', 'china', '国内', '100');
INSERT INTO `channel` VALUES ('2', 'int', '国际', '99');
INSERT INTO `channel` VALUES ('3', 'eco', '经济', '98');
INSERT INTO `channel` VALUES ('4', 'tech', '科技', '97');
INSERT INTO `channel` VALUES ('5', 'sport', '体育', '96');
INSERT INTO `channel` VALUES ('6', 'ent', '娱乐', '95');

-- ----------------------------
-- Table structure for `comment`
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `c_id` int(11) NOT NULL AUTO_INCREMENT,
  `c_user` int(11) NOT NULL,
  `c_news` int(11) NOT NULL,
  `c_check` tinyint(1) NOT NULL DEFAULT '0',
  `c_date` datetime NOT NULL,
  `c_enable` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`c_id`),
  KEY `c_user` (`c_user`),
  KEY `c_news` (`c_news`),
  CONSTRAINT `comment_ibfk_1` FOREIGN KEY (`c_user`) REFERENCES `user` (`u_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `comment_ibfk_2` FOREIGN KEY (`c_news`) REFERENCES `news` (`n_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comment
-- ----------------------------

-- ----------------------------
-- Table structure for `group`
-- ----------------------------
DROP TABLE IF EXISTS `group`;
CREATE TABLE `group` (
  `g_code` varchar(255) NOT NULL,
  `g_name` varchar(255) NOT NULL,
  PRIMARY KEY (`g_code`),
  UNIQUE KEY `g_code` (`g_code`) USING HASH
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of group
-- ----------------------------
INSERT INTO `group` VALUES ('admin', '管理员');
INSERT INTO `group` VALUES ('guest', '游客');
INSERT INTO `group` VALUES ('mute', '禁止发言');
INSERT INTO `group` VALUES ('user', '普通用户');

-- ----------------------------
-- Table structure for `group_privilege`
-- ----------------------------
DROP TABLE IF EXISTS `group_privilege`;
CREATE TABLE `group_privilege` (
  `gp_group` varchar(255) NOT NULL,
  `gp_privilege` varchar(255) NOT NULL,
  PRIMARY KEY (`gp_group`,`gp_privilege`),
  UNIQUE KEY `gp_group` (`gp_group`,`gp_privilege`) USING BTREE,
  KEY `gp_privilege` (`gp_privilege`),
  CONSTRAINT `group_privilege_ibfk_1` FOREIGN KEY (`gp_group`) REFERENCES `group` (`g_code`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `group_privilege_ibfk_2` FOREIGN KEY (`gp_privilege`) REFERENCES `privilege` (`p_code`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of group_privilege
-- ----------------------------
INSERT INTO `group_privilege` VALUES ('admin', 'comment_add');
INSERT INTO `group_privilege` VALUES ('user', 'comment_add');
INSERT INTO `group_privilege` VALUES ('admin', 'comment_check');
INSERT INTO `group_privilege` VALUES ('admin', 'comment_delete');
INSERT INTO `group_privilege` VALUES ('admin', 'comment_delete_self');
INSERT INTO `group_privilege` VALUES ('user', 'comment_delete_self');
INSERT INTO `group_privilege` VALUES ('admin', 'comment_dislike');
INSERT INTO `group_privilege` VALUES ('user', 'comment_dislike');
INSERT INTO `group_privilege` VALUES ('admin', 'comment_enable');
INSERT INTO `group_privilege` VALUES ('admin', 'comment_like');
INSERT INTO `group_privilege` VALUES ('user', 'comment_like');
INSERT INTO `group_privilege` VALUES ('admin', 'comment_list_all');
INSERT INTO `group_privilege` VALUES ('mute', 'comment_list_all');
INSERT INTO `group_privilege` VALUES ('user', 'comment_list_all');
INSERT INTO `group_privilege` VALUES ('admin', 'news_add');
INSERT INTO `group_privilege` VALUES ('admin', 'news_delete');
INSERT INTO `group_privilege` VALUES ('admin', 'news_edit');
INSERT INTO `group_privilege` VALUES ('admin', 'news_edit_other');
INSERT INTO `group_privilege` VALUES ('admin', 'news_list_adv');
INSERT INTO `group_privilege` VALUES ('admin', 'user_add');
INSERT INTO `group_privilege` VALUES ('admin', 'user_ban');
INSERT INTO `group_privilege` VALUES ('admin', 'user_change_group');
INSERT INTO `group_privilege` VALUES ('admin', 'user_change_nick');
INSERT INTO `group_privilege` VALUES ('admin', 'user_change_password');
INSERT INTO `group_privilege` VALUES ('mute', 'user_change_password');
INSERT INTO `group_privilege` VALUES ('user', 'user_change_password');
INSERT INTO `group_privilege` VALUES ('admin', 'user_change_password_other');
INSERT INTO `group_privilege` VALUES ('admin', 'user_delete');
INSERT INTO `group_privilege` VALUES ('admin', 'user_list_all');
INSERT INTO `group_privilege` VALUES ('admin', 'user_view_other');
INSERT INTO `group_privilege` VALUES ('admin', 'user_view_self');
INSERT INTO `group_privilege` VALUES ('mute', 'user_view_self');
INSERT INTO `group_privilege` VALUES ('user', 'user_view_self');

-- ----------------------------
-- Table structure for `like`
-- ----------------------------
DROP TABLE IF EXISTS `like`;
CREATE TABLE `like` (
  `l_user` int(11) NOT NULL,
  `l_comment` int(11) NOT NULL,
  PRIMARY KEY (`l_user`,`l_comment`),
  UNIQUE KEY `i_user` (`l_user`,`l_comment`) USING BTREE,
  KEY `i_comment` (`l_comment`),
  CONSTRAINT `like_ibfk_1` FOREIGN KEY (`l_user`) REFERENCES `user` (`u_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `like_ibfk_2` FOREIGN KEY (`l_comment`) REFERENCES `comment` (`c_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of like
-- ----------------------------

-- ----------------------------
-- Table structure for `news`
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news` (
  `n_id` int(11) NOT NULL AUTO_INCREMENT,
  `n_channel` int(11) NOT NULL,
  `n_title` varchar(255) NOT NULL,
  `n_pic` varchar(255) DEFAULT NULL,
  `n_content` longtext NOT NULL,
  `n_date` datetime NOT NULL,
  `n_priority` int(11) NOT NULL,
  `n_author` int(11) NOT NULL DEFAULT '0',
  `n_can_comment` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`n_id`),
  KEY `n_author` (`n_author`),
  KEY `n_channel` (`n_channel`),
  CONSTRAINT `news_ibfk_1` FOREIGN KEY (`n_author`) REFERENCES `user` (`u_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `news_ibfk_2` FOREIGN KEY (`n_channel`) REFERENCES `channel` (`ch_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for `privilege`
-- ----------------------------
DROP TABLE IF EXISTS `privilege`;
CREATE TABLE `privilege` (
  `p_code` varchar(255) NOT NULL,
  `p_name` varchar(255) NOT NULL,
  PRIMARY KEY (`p_code`),
  UNIQUE KEY `p_code` (`p_code`) USING HASH
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of privilege
-- ----------------------------
INSERT INTO `privilege` VALUES ('comment_add', '添加评论');
INSERT INTO `privilege` VALUES ('comment_check', '审核评论');
INSERT INTO `privilege` VALUES ('comment_delete', '删除评论');
INSERT INTO `privilege` VALUES ('comment_delete_self', '删除自己的评论');
INSERT INTO `privilege` VALUES ('comment_dislike', '踩评论');
INSERT INTO `privilege` VALUES ('comment_enable', '关闭评论');
INSERT INTO `privilege` VALUES ('comment_like', '点赞评论');
INSERT INTO `privilege` VALUES ('comment_list_all', '查看所有评论');
INSERT INTO `privilege` VALUES ('news_add', '添加新闻');
INSERT INTO `privilege` VALUES ('news_delete', '删除新闻');
INSERT INTO `privilege` VALUES ('news_edit', '修改新闻');
INSERT INTO `privilege` VALUES ('news_edit_other', '修改别人的新闻');
INSERT INTO `privilege` VALUES ('news_list_adv', '获取高级新闻列表(对象附加)');
INSERT INTO `privilege` VALUES ('user_add', '添加用户');
INSERT INTO `privilege` VALUES ('user_ban', '封禁用户');
INSERT INTO `privilege` VALUES ('user_change_group', '修改用户组别');
INSERT INTO `privilege` VALUES ('user_change_nick', '修改昵称');
INSERT INTO `privilege` VALUES ('user_change_password', '修改用户密码');
INSERT INTO `privilege` VALUES ('user_change_password_other', '修改其他用户密码');
INSERT INTO `privilege` VALUES ('user_delete', '删除用户');
INSERT INTO `privilege` VALUES ('user_list_all', '获取用户列表');
INSERT INTO `privilege` VALUES ('user_view_other', '获取其他用户信息');
INSERT INTO `privilege` VALUES ('user_view_self', '获取自身用户信息');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `u_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_name` varchar(255) NOT NULL,
  `u_nick` varchar(255) NOT NULL,
  `u_group` varchar(255) NOT NULL DEFAULT 'user',
  `u_password` varchar(255) NOT NULL,
  `u_reg_date` datetime NOT NULL,
  `u_banned` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`u_id`),
  UNIQUE KEY `u_name` (`u_name`) USING HASH,
  KEY `u_group` (`u_group`),
  CONSTRAINT `user_ibfk_1` FOREIGN KEY (`u_group`) REFERENCES `group` (`g_code`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('0', '百城新闻网', '百城新闻网', 'admin', 'null', '2018-06-11 21:18:09', '0');
INSERT INTO `user` VALUES ('1', 'admin', 'admin', 'admin', '16104861E63F3E88831BE9A69A8D60C6', '2018-06-11 21:24:42', '0');
INSERT INTO `user` VALUES ('2', 'user1', 'user1', 'user', 'null', '2018-06-14 21:06:39', '0');
INSERT INTO `user` VALUES ('3', 'user2', 'user2', 'user', 'null', '2018-06-14 21:06:53', '0');
INSERT INTO `user` VALUES ('4', 'user3', 'user3', 'user', 'null', '2018-06-14 21:07:05', '0');
INSERT INTO `user` VALUES ('5', 'user4', 'user4', 'user', 'null', '2018-06-14 21:07:19', '0');
INSERT INTO `user` VALUES ('6', 'user5', 'user5', 'user', 'null', '2018-06-14 21:09:01', '0');
INSERT INTO `user` VALUES ('7', 'user6', 'user6', 'user', 'null', '2018-06-14 21:09:15', '0');
INSERT INTO `user` VALUES ('8', 'user7', 'user7', 'user', 'null', '2018-06-14 21:09:27', '0');
INSERT INTO `user` VALUES ('9', 'user8', 'user8', 'user', 'null', '2018-06-14 21:09:41', '0');
INSERT INTO `user` VALUES ('10', 'OVAmach', 'OVAmach', 'user', '7E9FE559D4A67A07CFD6D2D1123B4AED', '2018-06-15 08:42:55', '0');
