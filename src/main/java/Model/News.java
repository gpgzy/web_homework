package Model;

public class News {
    private String date;
    private String content;
    private String title;

    public News(String date, String content, String title) {
        this.date = date;
        this.content = content;
        this.title = title;
    }

    public News() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
