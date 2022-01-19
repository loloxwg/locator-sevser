package com.nit.guhun.mapper;

import com.nit.guhun.entity.MapEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MapEntityMapper {
    int deleteByPrimaryKey(Integer mapId);

    int insert(MapEntity record);

    int insertSelective(MapEntity record);

    List<MapEntity> selectByEntity(MapEntity record);

    int updateByPrimaryKeySelective(MapEntity record);

    List<MapEntity> query();
}