package com.jyami.springskeleton.controller.post

import com.jyami.springskeleton.service.PostService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("post")
class PostController(val postService: PostService) {

    @GetMapping("")
    fun getAllPost(){
        postService.getAllPost()
        return
    }
}
