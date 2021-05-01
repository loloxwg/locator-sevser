package com.nit.guhun.mapper;

import com.nit.guhun.entity.JobUserEntity;
import com.nit.guhun.entity.TaskInfoEntity;

import java.util.List;

public interface TaskInfoMapper {
    List<JobUserEntity> showAllJobList();

    int addJob(TaskInfoEntity entity);

    int addTask(TaskInfoEntity entity);

    int update(TaskInfoEntity entity);
}
