package week8.practice;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
    public PostResponse findById(@PathVariable Integer postId) {
        //TODO
        return null;
    }

    @PostMapping("")
    public Long create(@RequestBody PostRequest postRequest) {
        //TODO
        return null;
    }

    @DeleteMapping("")
    public void deleteAll() {
        //TODO
    }

    //TODO
    public void deleteById() {

    }

    //TODO
    public void updateById() {

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
