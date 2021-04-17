package com.nit.guhun.mapper;

import com.nit.guhun.entity.MapEntity;

import java.util.List;

public interface MapEntityMapper {
    int deleteByPrimaryKey(Integer mapId);

    int insert(MapEntity record);

    int insertSelective(MapEntity record);

    List<MapEntity> selectByEntity(MapEntity record);

    int updateByPrimaryKeySelective(MapEntity record);

    List<MapEntity> query();
}