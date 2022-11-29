package week8.practice.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostRequest {
    private String title;
    private String content;
    private boolean publicAccess;
}
