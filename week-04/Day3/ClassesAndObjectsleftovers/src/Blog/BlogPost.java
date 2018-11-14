package Blog;

import java.util.Date;

public class BlogPost {
    String authorName;
    String title;
    String text;
    String publicationDate;

    @Override
    public String toString() {
        return "BlogPost{" +
                "authorName='" + authorName + '\'' +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", publicationDate='" + publicationDate + '\'' +
                '}';
    }
}