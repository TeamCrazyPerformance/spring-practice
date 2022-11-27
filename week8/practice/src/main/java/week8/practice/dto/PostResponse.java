package week8.practice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import week8.practice.Post;

@Getter
@AllArgsConstructor
public class PostResponse {
    private Long id;
    private String title;
    private String content;
    private boolean publicAccess;

    public static PostResponse from(Post post) {
        return new PostResponse(post.getId(), post.getTitle(), post.getContent(), post.isPublicAccess());
    }
}
