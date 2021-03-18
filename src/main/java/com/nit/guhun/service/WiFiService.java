package com.nit.guhun.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nit.guhun.entity.WiFiEntity;
import com.nit.guhun.mapper.WiFiEntityMapper;
import com.nit.guhun.utils.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class WiFiService {
    @Autowired
    private WiFiEntityMapper wiFiEntityMapper;
    public int insert(WiFiEntity wiFiEntity){
        return wiFiEntityMapper.insertSelective(wiFiEntity);
    }
    public int delete(Integer wiFiId){
        return wiFiEntityMapper.deleteByPrimaryKey(wiFiId);
    }
    public Map<String, Object> update(WiFiEntity wiFiEntity){
        List<WiFiEntity> list = wiFiEntityMapper.selectByEntity(wiFiEntity);
        Map<String, Object> res = new HashMap<>();
        if(list.size()>0){
            res.put("isUpdata",true);
            res.put("wifiId",list.get(0).getWifiId());
            wiFiEntity.setWifiId(list.get(0).getWifiId());
            wiFiEntityMapper.updateByPrimaryKeySelective(wiFiEntity);

        }else {
            res.put("isUpdata",false);
            wiFiEntityMapper.insert(wiFiEntity);
            list = wiFiEntityMapper.selectByEntity(wiFiEntity);
            res.put("wifiId",list.get(0).getWifiId());
        }
        res.put("success",true);
        return res;
    }
    public PageInfo<WiFiEntity> select(Entity entity,WiFiEntity wiFiEntity){
        PageHelper.startPage(entity.getPage(),entity.getLimit());
        List<WiFiEntity> list = wiFiEntityMapper.selectByEntity(wiFiEntity);
        PageInfo<WiFiEntity> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
    public PageInfo<WiFiEntity> query(Entity entity){
        PageHelper.startPage(entity.getPage(),entity.getLimit());
        List<WiFiEntity> list = wiFiEntityMapper.query();
        PageInfo<WiFiEntity> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
