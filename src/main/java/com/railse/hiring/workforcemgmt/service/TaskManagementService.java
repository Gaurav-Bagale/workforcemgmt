package com.railse.hiring.workforcemgmt.service;
import com.railse.hiring.workforcemgmt.dto.*;
import com.railse.hiring.workforcemgmt.model.TaskManagement;
import com.railse.hiring.workforcemgmt.model.enums.Priority;

import java.util.List;


public interface TaskManagementService {

    List<TaskManagementDto> createTasks(TaskCreateRequest request);

    List<TaskManagementDto> updateTasks(UpdateTaskRequest request);

    String assignByReference(AssignByReferenceRequest request);

    List<TaskManagementDto> fetchTasksByDate(TaskFetchByDateRequest request);

    TaskManagementDto findTaskById(Long id);

    //for fetch all task
    List<TaskManagementDto> findAll();

    //for feature 2
    TaskManagementDto updateTaskPriority(UpdateTaskPriority request);

    List<TaskManagementDto> fetchByPriority(Priority priority);

    //for feature 3
   // TaskManagementDto addComment(AddCommentRequest request);


}
