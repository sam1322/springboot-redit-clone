package com.breadit.redditClone.dto.Subreddit;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SubredditRequest {
    private Integer id;
    private String name;
    private String description;
    private Integer numberOfPosts;
    private Instant createdTime;
    private Instant updatedTime;
}
