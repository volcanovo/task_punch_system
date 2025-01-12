package com.acm.api.service;

import com.acm.api.model.TaskItem;

import java.util.List;

public interface TaskItemService {
    //int deleteByPrimaryKey(String id);

    int insert(TaskItem record);

    int deleteByIdAndName(String id,String name);

    int editTaskItemById(String id,String name,String content,Double judgefinish);

    TaskItem viewTaskItemByIdAndName(String id,String name);

    List<TaskItem> viewTaskItemByName(String name);
}
