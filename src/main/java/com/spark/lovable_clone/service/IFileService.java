package com.spark.lovable_clone.service;

import com.spark.lovable_clone.dto.project.FileContentResponse;
import com.spark.lovable_clone.dto.project.FileNode;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface IFileService {
    List<FileNode> getFileTree(Long projectId, Long userId);

    FileContentResponse getFileContent(Long projectId, String path, Long userId);
}
