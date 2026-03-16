package com.spark.lovable_clone.dto.member;

import com.spark.lovable_clone.enums.ProjectRole;

public record InviteMemberRequest(
        String email,
        ProjectRole role
) {
}
