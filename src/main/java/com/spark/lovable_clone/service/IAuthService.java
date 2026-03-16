package com.spark.lovable_clone.service;

import com.spark.lovable_clone.dto.auth.SignupRequest;
import com.spark.lovable_clone.dto.auth.AuthResponse;
import com.spark.lovable_clone.dto.auth.LoginRequest;

public interface IAuthService {
     AuthResponse signup(SignupRequest request);

     AuthResponse login(LoginRequest request);
}
