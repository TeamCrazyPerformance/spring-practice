package week8.practice.dto;

//TODO
public class PostRequest {
    private String title;
    private String content;
    private boolean publicAccess;
    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setPublicAccess(boolean publicAccess) {
        this.publicAccess = publicAccess;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PostRequest(Long id, String title, String content, boolean publicAccess) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.publicAccess = publicAccess;
    }

    private Long id;

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
