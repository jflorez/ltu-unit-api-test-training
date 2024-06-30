package com.planit.simpleREST.controllers;

public record RESTResponse<T>(
    String message,
    T data
) {}
