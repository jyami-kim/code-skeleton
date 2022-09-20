package com.jyami.springskeleton.repository

import com.jyami.springskeleton.domain.Post

interface PostRepository {
    fun getAll(): List<Post>
}
