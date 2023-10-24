package com.breadit.redditClone.Service;

import com.breadit.redditClone.dto.PostRequest;
import com.breadit.redditClone.dao.postgres.model.Post;
import com.breadit.redditClone.dao.postgres.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository ;
    public Post savePost(PostRequest postRequest){
        Post post = new Post().builder()
                .postName(postRequest.getPostName())
                .description(postRequest.getDescription())
                .build();
        return postRepository.save(post);
    }
    public List<Post>  getAllPosts(){
        List<Post> posts=  postRepository.findAll();
        return posts;
    }
}
