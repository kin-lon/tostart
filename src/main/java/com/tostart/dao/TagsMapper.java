package com.tostart.dao;

import com.tostart.bean.Tags;
import com.tostart.bean.TagsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TagsMapper {
    long countByExample(TagsExample example);

    int deleteByExample(TagsExample example);

    int deleteByPrimaryKey(Integer itemId);

    int insert(Tags record);

    int insertSelective(Tags record);

    List<Tags> selectByExample(TagsExample example);

    Tags selectByPrimaryKey(Integer itemId);

    int updateByExampleSelective(@Param("record") Tags record, @Param("example") TagsExample example);

    int updateByExample(@Param("record") Tags record, @Param("example") TagsExample example);

    int updateByPrimaryKeySelective(Tags record);

    int updateByPrimaryKey(Tags record);
}