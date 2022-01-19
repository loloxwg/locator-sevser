package com.nit.guhun.mapper;

import com.nit.guhun.entity.JobUserEntity;
import com.nit.guhun.entity.TaskInfoEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository//说明Spring框架没有识别到你的xxxMapper中的类，也及是说，xxxMapper的类没有被Spring框架给管理，如果你所需要的类需要给Spring给管理，那么你得在他上面加上@Repository注解，这样你在service层自动注入时他才不会报错。如果的你得类不需要管理或者继承或实现一些规则，并且程序没有产生一些错误，那么这些都是可以被允许的。

public interface TaskInfoMapper {
    List<JobUserEntity> showAllJobList();

    int addJob(TaskInfoEntity entity);

    int addTask(TaskInfoEntity entity);

    int update(TaskInfoEntity entity);

    int delete(Integer jobId);

    int deleteByTaskId(Integer taskId);
}
