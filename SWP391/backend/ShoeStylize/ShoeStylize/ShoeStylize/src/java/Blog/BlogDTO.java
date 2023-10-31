package Blog;

public class BlogDTO {
    private int postID;
    private String title;
    private String author;
    private String date;
    private String content;

    public BlogDTO() {
    }

    public BlogDTO(int postID, String title, String author, String date, String content) {
        this.postID = postID;
        this.title = title;
        this.author = author;
        this.date = date;
        this.content = content;
    }
   
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPostID() {
        return postID;
    }

    public void setPostID(int postID) {
        this.postID = postID;
    }
    
    
}
