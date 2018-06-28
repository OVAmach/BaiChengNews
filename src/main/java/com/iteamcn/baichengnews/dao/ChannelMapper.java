package com.iteamcn.baichengnews.dao;

import com.iteamcn.baichengnews.entity.Channel;
import com.iteamcn.baichengnews.entity.ChannelExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ChannelMapper {
    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    long countByExample(ChannelExample example);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    int deleteByExample(ChannelExample example);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    int deleteByPrimaryKey(Integer ch_id);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    int insert(Channel record);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    int insertSelective(Channel record);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    List<Channel> selectByExample(ChannelExample example);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    Channel selectByPrimaryKey(Integer ch_id);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    int updateByExampleSelective(@Param("record") Channel record, @Param("example") ChannelExample example);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    int updateByExample(@Param("record") Channel record, @Param("example") ChannelExample example);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    int updateByPrimaryKeySelective(Channel record);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    int updateByPrimaryKey(Channel record);
    
    List<Channel> selectAllChannel();
    
    Channel selectChannelByCode(String code);
}