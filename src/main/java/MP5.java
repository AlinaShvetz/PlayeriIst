//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class MP5 {
    public LinkedList<Song> songs = new LinkedList();
    private ArrayList<Album> albums = new ArrayList();
    private String playlistname;

    public MP5(String playlistname) {
        this.playlistname = playlistname;
    }

    public boolean addingAlbum(String title, String artist) {
        Album newA = Album.creatalbum(title, artist);
        if (this.validation(title)) {
            this.albums.add(newA);
            System.out.println("The album has been added.");
            return true;
        } else {
            return false;
        }
    }

    public void printlist(LinkedList<Song> myPlaylist) {
        ListIterator<Song> it = myPlaylist.listIterator();

        while(it.hasNext()) {
            System.out.println("Now playing " + it.next());
        }

    }

    public void forward(LinkedList<Song> myPlaylist) {
        ListIterator<Song> it = myPlaylist.listIterator();
        if (it.hasNext()) {
            System.out.println(it.nextIndex());
        }

    }

    public void backward(LinkedList<Song> myPlaylist) {
        ListIterator<Song> it = myPlaylist.listIterator();
        if (it.hasPrevious()) {
            System.out.println(it.previous());
        }

    }

    public Album conversAlbum(String title) {
        for(int i = 0; i < this.albums.size(); ++i) {
            if (((Album)this.albums.get(i)).getAlbumTitle().equals(title)) {
                return (Album)this.albums.get(i);
            }
        }

        return null;
    }

    public void viewlist() {
        for(int i = 0; i < this.albums.size(); ++i) {
            System.out.println(i + 1 + ". " + ((Album)this.albums.get(i)).getAlbumTitle());
        }

    }

    public boolean validation(String title) {
        for(int i = 0; i < this.albums.size(); ++i) {
            if (((Album)this.albums.get(i)).getAlbumTitle().equals(title)) {
                System.out.println("Such album is already in the list");
                return false;
            }
        }

        return true;
    }
}

