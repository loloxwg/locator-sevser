package com.nit.guhun.mapper;


import com.nit.guhun.entity.SignalEntity;

import java.util.List;

public interface SignalEntityMapper {
    int insert(List<SignalEntity> signalEntities);
    int deleteByWifiId(Integer signalWifiId);
}
