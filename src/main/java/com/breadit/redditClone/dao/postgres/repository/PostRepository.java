package com.breadit.redditClone.dao.postgres.repository;

import com.breadit.redditClone.dao.postgres.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
