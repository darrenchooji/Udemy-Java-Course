package Section08CodingExercises.Playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name, artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String songTitle, double durationOfSong) {
        Song song = findSong(songTitle);
        if (song == null) {
            song = new Song(songTitle, durationOfSong);
            this.songs.add(song);
            return true;
        } else {
            return false;
        }
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        trackNumber -= -1;
        if (trackNumber >= 0 && trackNumber <= this.songs.size()) {
            playList.add(this.songs.get(trackNumber));
            return true;
        } else {
            return false;
        }
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playList) {
        Song song = findSong(songTitle);
        if (song != null) {
            playList.add(song);
            return true;
        } else {
            return false;
        }
    }

    private Song findSong(String songTitle) {
        Song song = null;
        for (Song songInfo : this.songs) {
            if (songInfo.getTitle().equalsIgnoreCase(songTitle)) {
                song = songInfo;
            }
        }
        return song;
    }
}
