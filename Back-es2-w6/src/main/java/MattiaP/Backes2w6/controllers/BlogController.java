package MattiaP.Backes2w6.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import MattiaP.Backes2w6.entities.Blog;
import MattiaP.Backes2w6.services.BlogService;

import java.util.List;

@RestController
@RequestMapping("/blogs")
public class BlogController {

    @Autowired
    private BlogService blogService;


    @GetMapping
    public List<Blog> getBlogs() {
        return blogService.getBlogs();
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Blog saveBlog(@RequestBody Blog body) {
        return blogService.saveBlog(body);
    }


    @GetMapping("/{id}")
    public Blog findBlogById(@PathVariable Long id) {
        return blogService.findBlogById(id);
    }


    @PutMapping("/{id}")
    public Blog updateBlogById(@PathVariable Long id, @RequestBody Blog body) {
        return blogService.updateBlogById(id, body);
    }


    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBlogById(@PathVariable Long id) {
        blogService.deleteBlogById(id);
    }
}