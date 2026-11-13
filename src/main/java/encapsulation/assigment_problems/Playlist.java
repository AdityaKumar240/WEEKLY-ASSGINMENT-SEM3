package encapsulation.assigment_problems;
public class Playlist {
    private String[] songs;
    private int songCount;
    public Playlist(int capacity) { songs = new String[capacity]; }
    public void addSong(String song) {
        if (songCount < songs.length) songs[songCount++] = song;
        else System.out.println("Playlist is full");
    }
    public String[] getSongs() {
        String[] copy = new String[songCount];
        for (int i = 0; i < songCount; i++) copy[i] = songs[i];
        return copy;
    }
    public int getSongCount() { return songCount; }
    public static void main(String[] args) {
        Playlist p = new Playlist(10);
        p.addSong("Song A"); p.addSong("Song B");
        String[] copy = p.getSongs(); copy[0] = "Hacked";
        System.out.println(p.getSongs()[0]);
        System.out.println("Song count: " + p.getSongCount());
    }
}