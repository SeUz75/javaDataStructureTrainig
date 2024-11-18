

// 3. LinkedList
// Task: Create a Playlist manager. Each song is a node, and you can:
// Add a song to the beginning, end, or a specific position.
// Remove a song by name.
// Traverse the list to display songs in order.
// Extra: Add functionality to move to the next or previous song like a music player.

import java.util.LinkedList;


class main{
    public static void main(String[] args){
        System.out.println("Hello world");
        
        LinkedList<String> playlist = new LinkedList<>();

        playlist.add("FE!N");
        playlist.add("MY EYES");
        playlist.add("I KNOW");
        System.out.println(playlist);

        playlist.add(0, "TORE UP !"); // Adding a node in a specific position
        System.out.println(playlist.size());
        playlist.add(playlist.size()-1,"LOOK AT ME");
        System.out.println(playlist);

        // remove a song by name ;
        String song= "TORE UP !";
        playlist.remove(song);
        System.out.println(playlist);


        // Display songs in order list.
        for( String songs : playlist){
            System.out.println(songs);
        }

        
        
    }
}