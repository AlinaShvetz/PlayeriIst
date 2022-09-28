//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.Iterator;

public class Album {
    private String Tile;
    private String artist;

    public Album(String Title, String artist) {
        this.Tile = Title;
        this.artist = artist;
    }

    public static Album creatalbum(String title, String artist) {
        return new Album(title, artist);
    }

    public String getAlbumTitle() {
        return this.Tile;
    }

    public class SongList {
        private ArrayList<Song> ListofSongs = new ArrayList();

        public SongList() {
        }

        public boolean addingSong(String title, double duration) {
            Song newS = Song.createsong(title, duration);
            if (this.validation(title)) {
                this.ListofSongs.add(newS);
                System.out.println("The song has been added.");
                return true;
            } else {
                return false;
            }
        }

        public boolean validation(String title) {
            Iterator var2 = this.ListofSongs.iterator();

            Song check;
            do {
                if (!var2.hasNext()) {
                    return true;
                }

                check = (Song)var2.next();
            } while(!check.getTitle().equals(title));

            System.out.println("Such song is already in the list");
            return false;
        }

        private Song findSong(String title) {
            Iterator var2 = this.ListofSongs.iterator();

            Song checkedSong;
            do {
                if (!var2.hasNext()) {
                    return null;
                }

                checkedSong = (Song)var2.next();
            } while(!checkedSong.getTitle().equals(title));

            System.out.println("Such song is already in the list");
            return checkedSong;
        }

        public void viewlist() {
            for(int i = 0; i < this.ListofSongs.size(); ++i) {
                System.out.println(i + 1 + ". " + ((Song)this.ListofSongs.get(i)).getTitle() + "  " + ((Song)this.ListofSongs.get(i)).getDuration());
            }

        }
    }
}
