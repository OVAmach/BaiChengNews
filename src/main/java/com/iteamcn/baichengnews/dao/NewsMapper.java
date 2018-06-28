package com.iteamcn.baichengnews.dao;

import com.iteamcn.baichengnews.entity.News;
import com.iteamcn.baichengnews.entity.NewsExample;
import com.iteamcn.baichengnews.util.PageInfo;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author hasee
 *
 */
@Mapper
public interface NewsMapper {
    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    long countByExample(NewsExample example);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    int deleteByExample(NewsExample example);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    int deleteByPrimaryKey(Integer n_id);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    int insert(News record);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    int insertSelective(News record);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    List<News> selectByExampleWithBLOBs(NewsExample example);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    List<News> selectByExample(NewsExample example);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    News selectByPrimaryKey(Integer n_id);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    int updateByExampleSelective(@Param("record") News record, @Param("example") NewsExample example);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") News record, @Param("example") NewsExample example);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    int updateByExample(@Param("record") News record, @Param("example") NewsExample example);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    int updateByPrimaryKeySelective(News record);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(News record);

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    int updateByPrimaryKey(News record);
    
    /**
     * @param page 分页信息
     * @return 返回对应页数的新闻，包括关联的对象信息
     */
    List<News> selectAllListPage(@Param("page")PageInfo page);
    /**
     * @param page 分页信息
     * @return 返回对应页数的新闻，没有关联对象
     */
    List<News> selectBaseAllListPage(@Param("page")PageInfo page);
    
    List<News> selectAllWithLimit(int limit);
    List<News> selectBaseAllWithLimit(int limit);
    
    List<News> selectAllWithImgLimit(int limit);
    List<News> selectBaseAllWithImgLimit(int limit);
    /**
     * @param n_channel 频道号
     * @param limit 限制数量
     * @return 返回对应频道的新闻，有关联对象
     */
    List<News> selectByChannelWithLimit(@Param("n_channel")int n_channel,@Param("limit")int limit);
    /**
     * @param n_channel 频道号
     * @param limit 限制数量
     * @return 返回对应频道的新闻，无关联对象
     */
    List<News> selectBaseByChannelWithLimit(@Param("n_channel")int n_channel,@Param("limit")int limit);
    
    /**
     * @param n_channel 频道号
     * @param limit 限制数量
     * @return 返回对应频道的有图新闻，有关联对象
     */
    List<News> selectByChannelWithImgLimit(@Param("n_channel")int n_channel,@Param("limit")int limit);
    /**
     * @param n_channel 频道号
     * @param limit 限制数量
     * @return 返回对应频道的有图新闻，无关联对象
     */
    List<News> selectBaseByChannelWithImgLimit(@Param("n_channel")int n_channel,@Param("limit")int limit);
    
    /**
     * @param page 分页信息
     * @param n_channel 频道号
     * @return 
     */
    List<News> selectAllByChannelListPage(@Param("page")PageInfo page,@Param("n_channel")int n_channel);
    /**
     * @param page 分页信息
     * @param n_channel 频道号
     * @return
     */
    List<News> selectBaseAllByChannelListPage(@Param("page")PageInfo page,@Param("n_channel")int n_channel);
}