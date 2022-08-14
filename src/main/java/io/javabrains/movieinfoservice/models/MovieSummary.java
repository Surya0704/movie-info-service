package io.javabrains.movieinfoservice.models;

public class MovieSummary {

    private String id, overview, title;

    /*public MovieSummary(String id, String overview, String title) {
        this.id = id;
        this.overview = overview;
        this.title = title;
    }*/

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

