package com.nit.guhun.controller;

import com.github.pagehelper.PageInfo;
import com.nit.guhun.entity.MapEntity;
import com.nit.guhun.service.MapService;
import com.nit.guhun.utils.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/map")
public class MapController {
    @Autowired
    private MapService mapService;
    @GetMapping("query")
    public PageInfo<MapEntity> query(Entity entity){
        return mapService.query(entity);
    }
    @GetMapping("insert")
    public int insert(MapEntity mapEntity){return mapService.insert(mapEntity);}
    @GetMapping("update")
    public int update(MapEntity mapEntity){return mapService.update(mapEntity);}
    @GetMapping("delete")
    public int delete(Integer mapId){return mapService.delete(mapId);}
    @GetMapping("select")
    public PageInfo<MapEntity> select(Entity entity, MapEntity mapEntity){
        return mapService.select(entity,mapEntity);
    }
}
