package com.company;

public class Song {


    public Song(int id, String songName, String singerName, String releaseDate, double cdPrice) {
        this.id = id;
        this.songName = songName;
        this.singerName = singerName;
        this.releaseDate = releaseDate;
        this.cdPrice = cdPrice;
    }

    int id;
    String songName;
    String singerName;
    String releaseDate;
    double cdPrice;
}
