package MattiaP.Backes2w6.services;

import org.springframework.stereotype.Service;
import MattiaP.Backes2w6.entities.Blog;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

@Service
public class BlogService {

    private List<Blog> blogs = new ArrayList<>();

    public List<Blog> getBlogs() {
        return this.blogs;
    }

    public Blog saveBlog(Blog body) {
        Random rndm = new Random();
        body.setId(rndm.nextLong());
        this.blogs.add(body);
        return body;
    }

    public Blog findBlogById(Long id) {
        for (Blog blog : blogs) {
            if (blog.getId().equals(id)) {
                return blog;
            }
        }
        return null;
    }

    public void deleteBlogById(Long id) {
        Iterator<Blog> iterator = blogs.iterator();
        while (iterator.hasNext()) {
            Blog current = iterator.next();
            if (current.getId().equals(id)) {
                iterator.remove();
            }
        }
    }

    public Blog updateBlogById(Long id, Blog body) {
        for (Blog blog : blogs) {
            if (blog.getId().equals(id)) {
                blog.setCategoria(body.getCategoria());
                blog.setTitolo(body.getTitolo());
                blog.setCover(body.getCover());
                blog.setContenuto(body.getContenuto());
                blog.setTempoLettura(body.getTempoLettura());

                return blog;
            }
        }
        return null;
    }
}
