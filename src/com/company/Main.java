package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

	    // write your code here
        Album album = new Album("Asang", "Jimozaichangge");
        album.addSong("Jimo1", 4.01);
        album.addSong("Jimo2", 4.02);
        album.addSong("Jimo3", 4.03);
        album.addSong("Jimo4", 4.04);
        album.addSong("Jimo5", 4.05);
        album.addSong("Jimo6", 4.06);
        album.addSong("Jimo7", 4.07);
        albums.add(album);

        // write your code here
        album = new Album("Bsang", "Qianjinmaimagu");
        album.addSong("Jimo11", 4.011);
        album.addSong("Jimo22", 4.022);
        album.addSong("Jimo33", 4.033);
        album.addSong("Jimo44", 4.044);
        album.addSong("Jimo55", 4.055);
        album.addSong("Jimo66", 4.066);
        album.addSong("Jimo77", 4.077);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("I am right", playList);
        albums.get(0).addToPlayList("Jimo3", playList);
        albums.get(0).addToPlayList("Jimo33", playList);
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList("I am right", playList);
        albums.get(1).addToPlayList("Jimo3", playList);
        albums.get(1).addToPlayList("Jimo22", playList);
        albums.get(1).addToPlayList(9, playList);
        play(playList);
    }

    private static void play(LinkedList<Song> playList) {
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("No song in playlist");
            return;
        } else {
            System.out.println("Playing " + listIterator.next().toString());
        }
    }
}
