package com.breadit.redditClone.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PostRequest {
    private Long postId;
    private String subredditName;
    @NotBlank(message = "Post Name can not be empty or Null")
    private String postName;
    private String description;
}
