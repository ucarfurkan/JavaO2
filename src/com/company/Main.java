package com.company;

public class Main {

    public static void main(String[] args) {
        Category category1 = new Category(1,"Rock");
        Category category2 = new Category(2, "Pop");
        Category category3 = new Category(3, "Rap");

        Song song1 = new Song(1,"Bohemian Rhapsody","Queen","1 Aug 2008",50);
        Song song2 = new Song(2,"Believer","Imagine Dragons","7 Mar 2017",100);
        Song song3 = new Song(3,"lovely","Billie Eilish","26 Apr 2018",20);


        Song[] songs = {song1,song2,song3};

        for (Song song: songs) {
            System.out.println("Song: " + song.songName + " / " + song.singerName);
            System.out.println("Price: "+ song.cdPrice + " Release Date: " + song.releaseDate);
            System.out.println("**************************");
        }

        SongManager songManager = new SongManager();

        songManager.addToPlaylist(song1);
        songManager.addToPlaylist(song2);
        songManager.addToPlaylist(song3);

        songManager.buyCd(song1);
        songManager.buyCd(song2);
        songManager.buyCd(song3);
    }
}
