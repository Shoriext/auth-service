package com.shoriext.auth_service.model.enums;

public enum UserStatus {
    PENDING, // Ожидает подтверждения email
    ACTIVE, // Активный
    BLOCKED, // Заблокирован
    DELETED // Удален (soft delete)
}
