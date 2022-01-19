package com.nit.guhun.controller;

import com.github.pagehelper.PageInfo;
import com.nit.guhun.entity.WiFiEntity;
import com.nit.guhun.service.WiFiService;
import com.nit.guhun.utils.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
@CrossOrigin(origins = "*")//解决跨域问题
@RestController
@RequestMapping("/wifi")
public class WiFiController {
    @Autowired
    private WiFiService wiFiService;
    @GetMapping("query")
    public PageInfo<WiFiEntity> query(Entity entity){
        return wiFiService.query(entity);
    }
    @GetMapping("insert")
    public int insert(WiFiEntity wifiEntity){return wiFiService.insert(wifiEntity);}
    @PostMapping("update")
    public Map<String, Object> update(WiFiEntity wifiEntity){return wiFiService.update(wifiEntity);}
    @GetMapping("delete")
    public int delete(Integer wifiId){return wiFiService.delete(wifiId);}
    @GetMapping("select")
    public PageInfo<WiFiEntity> select(Entity entity, WiFiEntity wifiEntity){
        return wiFiService.select(entity,wifiEntity);
    }
}
