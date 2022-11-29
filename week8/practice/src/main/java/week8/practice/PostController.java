package week8.practice;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import week8.practice.dto.CreateResponse;
import week8.practice.dto.PostRequest;
import week8.practice.dto.PostResponse;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("/api/post")
@RestController
public class PostController {

    private final List<Post> posts = new ArrayList<>();
    private Long id = 0L;

    @GetMapping("")
    public List<PostResponse> findAll() {
        List<PostResponse> postResponseList = new ArrayList<>();
        for (Post post : posts) {
            PostResponse postResponse = PostResponse.from(post);
            postResponseList.add(postResponse);
        }
        return postResponseList;
    }

    @GetMapping("/{postId}")
    public PostResponse findById(@PathVariable Long postId) {
        for (Post post : posts) {
            if (post.getId().equals(postId)) {
                return PostResponse.from(post);
            }
        }
        return null;
    }

    @PostMapping("")
    public CreateResponse create(@RequestBody PostRequest postRequest) {
        Long newPostId = id;
        Post post = new Post(newPostId, postRequest.getTitle(), postRequest.getContent(), postRequest.isPublicAccess());
        posts.add(post);
        id++;
        return new CreateResponse(newPostId);
    }

    @DeleteMapping("")
    public void deleteAll() {
        posts.clear();
    }

    @DeleteMapping("/{postId}")
    public void deleteById(@PathVariable Long postId) {
        Post deletePost = null;
        for (Post post : posts) {
            if (post.getId().equals(postId)) {
                deletePost = post;
            }
        }
        posts.remove(deletePost);
    }

    @PutMapping("/{postId}")
    public void updateById(@PathVariable Long postId, @RequestBody PostRequest postRequest) {
        for (Post post : posts) {
            if (post.getId().equals(postId)) {
                post.update(postRequest);
            }
        }
    }

    /**
     * initial data
     * */
    @PostConstruct
    private void initData() {
        posts.add(new Post(id++, "title1", "content1", false));
        posts.add(new Post(id++, "title2", "content2", true));
    }
}
