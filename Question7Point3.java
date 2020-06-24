import java.util.Random;

public class Question7Point3 {
    public static void main(String[] args) {

    }
    class jukebox{
        song[] songs;

        public jukebox(song[]s){
            songs = s;
        }

        public song playrandom(jukebox juke){
            int random = (int)(Math.random()*(juke.songs.length));
            song playing = juke.songs[random];
            return playing;
        }
        public song playnumber(jukebox juke, int number){
            song playing = juke.songs[number];
            return playing;
        }
    }
    class song{
        String name;
        String artist;
        int number;
    }
}
