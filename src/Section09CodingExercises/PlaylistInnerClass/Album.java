package Section09CodingExercises.PlaylistInnerClass;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name, artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String songTitle, double durationOfSong) {
        return (songs.add(new Song(songTitle, durationOfSong)));
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        Song song = this.songs.findSong(trackNumber);
        if (song == null) {
            return false;
        } else {
            playlist.add(song);
            return true;
        }
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playList) {
        Song song = this.songs.findSong(songTitle);
        if (song == null) {
            return false;
        } else {
            playList.add(song);
            return true;
        }
    }

    public static class SongList {
        private ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<Song>();
        }

        private boolean add(Song songToAdd) {
            Song song = findSong(songToAdd.getTitle());
            if (song == null) {
                this.songs.add(songToAdd);
                return true;
            } else {
                return false;
            }
        }

        private Song findSong(String songTitle) {
            Song song = null;
            for (Song x : this.songs) {
                if (x.getTitle().equalsIgnoreCase(songTitle)) {
                    song = x;
                }
            }
            return song;
        }

        private Song findSong(int trackNumber) {
            Song song = (((trackNumber-1)>=0) && ((trackNumber-1)<this.songs.size())) ? this.songs.get(trackNumber-1) : null;
            return song;
        }
    }
}