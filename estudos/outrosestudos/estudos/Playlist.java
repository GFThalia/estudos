package estudos;

/*  Me empolguei com o projeto Playlist de arrays.and.arraylists em codecademy! :D
 * 
 */

import java.util.ArrayList;

class Playlist {

  public static void main(String[] args) {
  ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
  desertIslandPlaylist.add("Island by Asunojokei");
  desertIslandPlaylist.add("White Light From the Mounth of Infinity by Swans");
  desertIslandPlaylist.add("My Father Will Guide Me Up a Rope to the Sky by Swans");
  desertIslandPlaylist.add("Doolittle by Pixies");
  desertIslandPlaylist.add("Deceit by This Heat");
  desertIslandPlaylist.add("Lateralus by Tool");
  desertIslandPlaylist.add("Akuma no Uta by Boris");
  desertIslandPlaylist.add("The Seer by Swans");
  desertIslandPlaylist.add("Unknown Rooms by Chelsea Wolfe");

  System.out.println("You has add the following albums: " + desertIslandPlaylist);
  //System.out.println("Your playlist has " + desertIslandPlaylist.size() + " albums.");


 if (desertIslandPlaylist.size() > 5){
      int removeSize = desertIslandPlaylist.size() - 5;
      System.out.println(" Your playlist has " + desertIslandPlaylist.size() + " albums. You can choose just 5, please remove " +removeSize+ " albums. Utilize remove function.");

  }else if(desertIslandPlaylist.size() < 5){
      int addSize = 5 - desertIslandPlaylist.size();
      System.out.println("Your playlist has " + desertIslandPlaylist.size() + " albums. You can choose just 5, please add more " +addSize+ " albums. Utilize add function.");

  }else{ System.out.println("Your playlist has " + desertIslandPlaylist.size() + " albums: " + desertIslandPlaylist);}

 desertIslandPlaylist.remove("The Seer by Swans");
 desertIslandPlaylist.remove("My Father Will Guide Me Up a Rope to the Sky by Swans");
 desertIslandPlaylist.remove("Lateralus by Tool");
 desertIslandPlaylist.remove("Unknown Rooms by Chelsea Wolfe");

  System.out.println("Your currently playlist: " + desertIslandPlaylist);



  }

}