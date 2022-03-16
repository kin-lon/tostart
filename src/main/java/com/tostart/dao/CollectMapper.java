package com.tostart.dao;

import com.tostart.bean.Collect;
import com.tostart.bean.CollectExample;
import com.tostart.bean.CollectKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CollectMapper {
    long countByExample(CollectExample example);

    int deleteByExample(CollectExample example);

    int deleteByPrimaryKey(CollectKey key);

    int insert(Collect record);

    int insertSelective(Collect record);

    List<Collect> selectByExample(CollectExample example);

    Collect selectByPrimaryKey(CollectKey key);

    int updateByExampleSelective(@Param("record") Collect record, @Param("example") CollectExample example);

    int updateByExample(@Param("record") Collect record, @Param("example") CollectExample example);

    int updateByPrimaryKeySelective(Collect record);

    int updateByPrimaryKey(Collect record);
}