package com.breadit.redditClone.Controller;

import com.breadit.redditClone.Service.SubredditService;
import com.breadit.redditClone.dao.postgres.model.Subreddit;
import com.breadit.redditClone.dto.Subreddit.SubredditRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/subreddit")
@AllArgsConstructor
@Slf4j
public class SubredditController {
    private final SubredditService subredditService;

    @PostMapping
    public ResponseEntity<Subreddit> createSubreddit(@RequestBody SubredditRequest request) {
        Subreddit subreddit = subredditService.saveSubreddit(request);
        return ResponseEntity.ok().body(subreddit);
    }
}
