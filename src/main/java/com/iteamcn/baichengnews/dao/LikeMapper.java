package com.iteamcn.baichengnews.dao;

import com.iteamcn.baichengnews.entity.LikeExample;
import com.iteamcn.baichengnews.entity.LikeKey;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LikeMapper {
    /**
     *
     * @mbg.generated Wed Jun 13 10:28:03 CST 2018
     */
    long countByExample(LikeExample example);

    /**
     *
     * @mbg.generated Wed Jun 13 10:28:03 CST 2018
     */
    int deleteByExample(LikeExample example);

    /**
     *
     * @mbg.generated Wed Jun 13 10:28:03 CST 2018
     */
    int deleteByPrimaryKey(LikeKey key);

    /**
     *
     * @mbg.generated Wed Jun 13 10:28:03 CST 2018
     */
    int insert(LikeKey record);

    /**
     *
     * @mbg.generated Wed Jun 13 10:28:03 CST 2018
     */
    int insertSelective(LikeKey record);

    /**
     *
     * @mbg.generated Wed Jun 13 10:28:03 CST 2018
     */
    List<LikeKey> selectByExample(LikeExample example);

    /**
     *
     * @mbg.generated Wed Jun 13 10:28:03 CST 2018
     */
    int updateByExampleSelective(@Param("record") LikeKey record, @Param("example") LikeExample example);

    /**
     *
     * @mbg.generated Wed Jun 13 10:28:03 CST 2018
     */
    int updateByExample(@Param("record") LikeKey record, @Param("example") LikeExample example);
}