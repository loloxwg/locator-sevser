package com.nit.guhun.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nit.guhun.entity.MapEntity;
import com.nit.guhun.mapper.MapEntityMapper;
import com.nit.guhun.utils.AcmeProperties;
import com.nit.guhun.utils.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MapService {
    @Autowired
    private AcmeProperties acmeProperties;
    @Autowired
    private MapEntityMapper mapEntityMapper;

    public int insert(MapEntity mapEntity) {
        return mapEntityMapper.insertSelective(mapEntity);
    }

    public int delete(Integer mapId) {
        return mapEntityMapper.deleteByPrimaryKey(mapId);
    }

    public int update(MapEntity mapEntity) {
        return mapEntityMapper.updateByPrimaryKeySelective(mapEntity);
    }

    public PageInfo<MapEntity> select(Entity entity,MapEntity mapEntity) {
        PageHelper.startPage(entity.getPage(), entity.getLimit());
        List<MapEntity> list = mapEntityMapper.selectByEntity(mapEntity);
        for (MapEntity map : list) {
            map.setMapUrl(acmeProperties.getMapUrl() + map.getMapUrl());
        }
        PageInfo<MapEntity> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    public PageInfo<MapEntity> query(Entity entity) {
        PageHelper.startPage(entity.getPage(), entity.getLimit());
        List<MapEntity> list = mapEntityMapper.query();
        for (MapEntity map : list) {
            map.setMapUrl(acmeProperties.getMapUrl() + map.getMapUrl());
        }
        PageInfo<MapEntity> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

}
