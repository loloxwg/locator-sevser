package com.nit.guhun.mapper;

import com.nit.guhun.entity.WiFiEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface WiFiEntityMapper {
    int deleteByPrimaryKey(Integer wifiId);

    int insert(WiFiEntity record);

    int insertSelective(WiFiEntity record);

    List<WiFiEntity> selectByEntity(WiFiEntity record);

    int updateByPrimaryKeySelective(WiFiEntity record);

    List<WiFiEntity> query();
}