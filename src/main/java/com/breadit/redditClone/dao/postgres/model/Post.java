package com.breadit.redditClone.dao.postgres.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;
    private String postName;
    private String url;
    @Lob
    private String description;
    private int voteCount;
    private Instant createdTime;
    private Instant updatedTime;
    //    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "userId", referencedColumnName = "userId")
//    private User user;'

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "id", referencedColumnName = "id")
//    private Subreddit subreddit;
}
