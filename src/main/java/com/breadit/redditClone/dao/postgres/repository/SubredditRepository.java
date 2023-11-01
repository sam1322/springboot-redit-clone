package com.breadit.redditClone.dao.postgres.repository;

import com.breadit.redditClone.dao.postgres.model.Subreddit;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubredditRepository extends JpaRepository<Subreddit,Integer> {
}
