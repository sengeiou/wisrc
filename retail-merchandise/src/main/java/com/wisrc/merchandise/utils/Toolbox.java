package com.wisrc.merchandise.utils;

import java.util.UUID;

public class Toolbox {
    public static final String randomUUID() {
        return UUID.randomUUID().toString().replace("-", "").toLowerCase();
    }
}
