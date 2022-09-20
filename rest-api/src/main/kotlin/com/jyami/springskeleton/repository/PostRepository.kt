package com.jyami.springskeleton.repository

import com.jyami.springskeleton.domain.Post
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository


@Repository
interface PostRepository : CrudRepository<Post, Long> {
    fun findAllById(id: Long): List<Post>
}
