package com.breadit.redditClone.Controller;

import com.breadit.redditClone.Service.PostService;
import com.breadit.redditClone.dto.PostRequest;
import com.breadit.redditClone.dao.postgres.model.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @PostMapping("/v1/post")
    public ResponseEntity<Post> createPost(@RequestBody PostRequest postRequest) {
        Post post = postService.savePost(postRequest);
        return ResponseEntity.ok().body(post);
    }


    @GetMapping("/v1/post")
    public ResponseEntity<List<Post>> getAllPosts() {
        List<Post> posts = postService.getAllPosts();
        return ResponseEntity.ok().body(posts);
    }
}
