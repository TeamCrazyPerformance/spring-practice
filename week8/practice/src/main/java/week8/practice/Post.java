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
    public void update(long _id, String _title, String _content, boolean _publicAccess) {
        id = _id;
        title = _title;
        content = _content;
        publicAccess = _publicAccess;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public boolean isPublicAccess() {
        return publicAccess;
    }
}
