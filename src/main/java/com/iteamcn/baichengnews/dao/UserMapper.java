package com.iteamcn.baichengnews.dao;

import com.iteamcn.baichengnews.entity.User;
import com.iteamcn.baichengnews.entity.UserExample;
import com.iteamcn.baichengnews.util.PageInfo;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    long countByExample(UserExample example);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    int deleteByExample(UserExample example);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    int deleteByPrimaryKey(Integer u_id);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    int insert(User record);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    int insertSelective(User record);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    List<User> selectByExample(UserExample example);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    User selectByPrimaryKey(Integer u_id);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    int updateByPrimaryKeySelective(User record);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    int updateByPrimaryKey(User record);
    
    List<User> selectUserListPage(@Param("page") PageInfo page);
    
    /**
     * @param userName
     * @return 完整User 并且有关联对象
     */
    User selectBaseByName(String username);
    User selectAdvByName(String userName);
    
    User selectBaseByIdWithOutPass(int id);
    User selectAdvByIdWithOutPass(int id);
}