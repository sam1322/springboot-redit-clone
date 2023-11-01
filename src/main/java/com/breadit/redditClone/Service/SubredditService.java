package com.breadit.redditClone.Service;

import com.breadit.redditClone.dao.postgres.model.Subreddit;
import com.breadit.redditClone.dao.postgres.repository.SubredditRepository;
import com.breadit.redditClone.dto.Subreddit.SubredditRequest;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
@RequiredArgsConstructor
@Slf4j
public class SubredditService {
    private final SubredditRepository subredditRepository;

    public Subreddit saveSubreddit(SubredditRequest subredditRequest) {
        Instant createdTime = Instant.now();
        Subreddit subreddit = new Subreddit().builder()
                .name(subredditRequest.getName())
                .description(subredditRequest.getDescription())
                .createdTime(createdTime)
                .updatedTime(createdTime)
                .build();
        return subredditRepository.save(subreddit);
    }

}
