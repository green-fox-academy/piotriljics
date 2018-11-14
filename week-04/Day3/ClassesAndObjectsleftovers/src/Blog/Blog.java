package Blog;

import java.util.ArrayList;
import java.util.List;

public class Blog {
    List<BlogPost> blogPosts = new ArrayList<BlogPost>();

    public void delete(int i) {
        blogPosts.remove(i);
    }
    public void update(int i, BlogPost newPost) {
        blogPosts.add(i, newPost);
    }

    @Override
    public String toString() {
        return "Blog{" +
                "blogPosts=" + blogPosts +
                '}';
    }
}

   /* Create a Blog class which can
        store a list of BlogPosts
        add BlogPosts to the list
        delete(int) one item at given index
        update(int, BlogPost) one item at the given index and update it with another BlogPost*/