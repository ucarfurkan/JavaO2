package com.company;

public class SongManager {
    public void addToPlaylist(Song song){
        System.out.println(song.songName + " is added to your playlist!");
    }

    public void buyCd(Song song){
        System.out.println("You bought the " + song.songName+ " for " + song.cdPrice +"$");
    }
}
