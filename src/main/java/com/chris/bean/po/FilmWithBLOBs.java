package com.chris.bean.po;

public class FilmWithBLOBs extends Film {
    private String filmActors;

    private String filmAwards;

    public String getFilmActors() {
        return filmActors;
    }

    public void setFilmActors(String filmActors) {
        this.filmActors = filmActors == null ? null : filmActors.trim();
    }

    public String getFilmAwards() {
        return filmAwards;
    }

    public void setFilmAwards(String filmAwards) {
        this.filmAwards = filmAwards == null ? null : filmAwards.trim();
    }
}