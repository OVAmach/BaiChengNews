package com.iteamcn.baichengnews.dao;

import com.iteamcn.baichengnews.entity.GroupPrivilegeExample;
import com.iteamcn.baichengnews.entity.GroupPrivilegeKey;
import com.iteamcn.baichengnews.entity.Privilege;

import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GroupPrivilegeMapper {
    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    long countByExample(GroupPrivilegeExample example);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    int deleteByExample(GroupPrivilegeExample example);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    int deleteByPrimaryKey(GroupPrivilegeKey key);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    int insert(GroupPrivilegeKey record);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    int insertSelective(GroupPrivilegeKey record);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    List<GroupPrivilegeKey> selectByExample(GroupPrivilegeExample example);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    int updateByExampleSelective(@Param("record") GroupPrivilegeKey record, @Param("example") GroupPrivilegeExample example);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    int updateByExample(@Param("record") GroupPrivilegeKey record, @Param("example") GroupPrivilegeExample example);
    
    Set<Privilege> selectGroupAllPrivilege(String groupName);
}