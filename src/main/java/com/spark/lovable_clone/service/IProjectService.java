package com.spark.lovable_clone.service;

import com.spark.lovable_clone.dto.project.ProjectRequest;
import com.spark.lovable_clone.dto.project.ProjectResponse;
import com.spark.lovable_clone.dto.project.ProjectSummaryResponse;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface IProjectService {
     List<ProjectSummaryResponse> getUserProjects(Long userId);

    ProjectResponse getUserProjectById(Long id, Long userId);

    ProjectResponse createProject(Long userId, ProjectRequest request);

    ProjectResponse updateProject(Long id, ProjectRequest request, Long userId);

    void softDelete(Long id, Long userId);
}
