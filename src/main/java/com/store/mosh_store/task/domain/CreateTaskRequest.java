package com.store.mosh_store.task.domain;


public record CreateTaskRequest(
     String id,
     String title,
     String description
) {}
