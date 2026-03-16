package com.spark.lovable_clone.service;

import com.spark.lovable_clone.dto.auth.UserProfileResponse;
import org.jspecify.annotations.Nullable;

public interface IUserService {
     UserProfileResponse getProfile(Long userId);
}
