package com.jyami.springskeleton.service

import com.jyami.springskeleton.domain.Post
import com.jyami.springskeleton.repository.PostRepository
import org.springframework.stereotype.Service

@Service
class PostService(val postRepository: PostRepository) {

    fun getAllPost(): List<Post> {
        return postRepository.getAll()
    }
}
