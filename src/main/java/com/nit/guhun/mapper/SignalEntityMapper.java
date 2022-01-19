package com.nit.guhun.mapper;


import com.nit.guhun.entity.SignalEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository

public interface SignalEntityMapper {

    int insert(List<SignalEntity> signalEntities);

    int deleteByWifiId(Integer signalWifiId);

    List<Map<String,Object>> locate(List<SignalEntity> signalEntities);

    List<SignalEntity> getSignalByWifiId(String wifiId);
}
