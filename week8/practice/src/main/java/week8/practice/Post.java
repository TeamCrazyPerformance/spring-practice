package week8.practice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import week8.practice.dto.PostRequest;

@Getter
@AllArgsConstructor
public class Post {
    private Long id;
    private String title;
    private String content;
    private boolean publicAccess;

    public void update(PostRequest postRequest) {
        this.title = postRequest.getTitle();
        this.content = postRequest.getContent();
        this.publicAccess = postRequest.isPublicAccess();
    }
}
