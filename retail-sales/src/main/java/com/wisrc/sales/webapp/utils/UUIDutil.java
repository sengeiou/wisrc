package com.wisrc.sales.webapp.utils;

import java.util.UUID;

public class UUIDutil {
    public static final String randomUUID() {
        return UUID.randomUUID().toString().replace("-", "").toLowerCase();
    }
}