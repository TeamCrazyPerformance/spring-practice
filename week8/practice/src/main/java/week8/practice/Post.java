package week8.practice;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Post {
    private Long id;
    private String title;
    private String content;
    private boolean publicAccess;

    //TODO
    public void update() {

    }
}
