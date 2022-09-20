package com.jyami.springskeleton.controller

data class Response<T>(
    val responseCode: ResponseCode = ResponseCode.OK,
    val body: T? = null,
)
