package com.iteamcn.baichengnews.dao;

import com.iteamcn.baichengnews.entity.Privilege;
import com.iteamcn.baichengnews.entity.PrivilegeExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PrivilegeMapper {
    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    long countByExample(PrivilegeExample example);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    int deleteByExample(PrivilegeExample example);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    int deleteByPrimaryKey(String p_code);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    int insert(Privilege record);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    int insertSelective(Privilege record);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    List<Privilege> selectByExample(PrivilegeExample example);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    Privilege selectByPrimaryKey(String p_code);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    int updateByExampleSelective(@Param("record") Privilege record, @Param("example") PrivilegeExample example);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    int updateByExample(@Param("record") Privilege record, @Param("example") PrivilegeExample example);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    int updateByPrimaryKeySelective(Privilege record);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    int updateByPrimaryKey(Privilege record);
}