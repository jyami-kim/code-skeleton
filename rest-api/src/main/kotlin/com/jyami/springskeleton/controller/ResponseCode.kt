package com.jyami.springskeleton.controller

enum class ResponseCode(val status: Int, val message: String = "") {
    OK(200, "success")
}
