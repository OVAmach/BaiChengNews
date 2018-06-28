package com.iteamcn.baichengnews.dao;

import com.iteamcn.baichengnews.entity.Comment;
import com.iteamcn.baichengnews.entity.CommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CommentMapper {
    /**
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    long countByExample(CommentExample example);

    /**
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    int deleteByExample(CommentExample example);

    /**
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    int deleteByPrimaryKey(Integer c_id);

    /**
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    int insert(Comment record);

    /**
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    int insertSelective(Comment record);

    /**
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    List<Comment> selectByExample(CommentExample example);

    /**
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    Comment selectByPrimaryKey(Integer c_id);

    /**
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    int updateByExampleSelective(@Param("record") Comment record, @Param("example") CommentExample example);

    /**
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    int updateByExample(@Param("record") Comment record, @Param("example") CommentExample example);

    /**
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    int updateByPrimaryKeySelective(Comment record);

    /**
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    int updateByPrimaryKey(Comment record);
}