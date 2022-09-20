package com.jyami.springskeleton.repository

import com.jyami.springskeleton.domain.Post

class PostRepositoryImpl : PostRepository {

    private val memoryDB : List<Post> = mutableListOf()

    override fun getAll(): List<Post> {
        return memoryDB.toMutableList()
    }
}
