
/**
 * Write a description of class fantasy_football_client here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class fantasy_football_client
{
  public static void main(String []args)
  {
      Scanner scan = new Scanner(System.in);
      System.out.println("Team 1 name: ");
      String name1 = scan.nextLine();
      System.out.println("Team 2 name: ");
      String name2 = scan.nextLine();
      System.out.println("Team 3 name: ");
      String name3 = scan.nextLine();
      System.out.println("Team 4 name: ");
      String name4 = scan.nextLine();
      System.out.println("Team 5 name: ");
      String name5 = scan.nextLine();
      System.out.println("Team 6 name: ");
      String name6 = scan.nextLine();
      System.out.println("Team 7 name: ");
      String name7 = scan.nextLine();
      System.out.println("Team 8 name: ");
      String name8 = scan.nextLine();
      System.out.println("Team 9 name: ");
      String name9 = scan.nextLine();
      System.out.println("Team 10 name: ");
      String name10 = scan.nextLine();
      System.out.println("Team 11 name: ");
      String name11 = scan.nextLine();
      System.out.println("Team 12 name: ");
      String name12 = scan.nextLine();
      Player team1 = new Player(name1);
      Player team2 = new Player(name2);
      Player team3 = new Player(name3);
      Player team4 = new Player(name4);
      Player team5 = new Player(name5);
      Player team6 = new Player(name6);
      Player team7 = new Player(name7);
      Player team8 = new Player(name8);
      Player team9 = new Player(name9);
      Player team10 = new Player(name10);
      Player team11 = new Player(name11);
      Player team12 = new Player(name12);
      while (team1.getLen()<15 || team1.getLen()<15 || team2.getLen()<15 || team3.getLen()<15 || team4.getLen()<15||team5.getLen()<15||team6.getLen()<15||team7.getLen()<15||team8.getLen()<15||team9.getLen()<15||team10.getLen()<15||team11.getLen()<15||team12.getLen()<15)
      {
          System.out.println("Team 1's turn");
          team1.addPlayer();
          System.out.println("Team 2's turn");
          team2.addPlayer();
          System.out.println("Team 3's turn");
          team3.addPlayer();
          System.out.println("Team 4's turn");
          team4.addPlayer();
          System.out.println("Team 5's turn");
          team5.addPlayer();
          System.out.println("Team 6's turn");
          team6.addPlayer();
          System.out.println("Team 7's turn");
          team7.addPlayer();
          System.out.println("Team 8's turn");
          team8.addPlayer();
          System.out.println("Team 9's turn");
          team9.addPlayer();
          System.out.println("Team 10's turn");
          team10.addPlayer();
          System.out.println("Team 11's turn");
          team11.addPlayer();
          System.out.println("Team 12's turn");
          team12.addPlayer();
      }
      System.out.println("Team 1: "+team1);
      System.out.println("Team 2: "+team2);
      System.out.println("Team 3: "+team3);
      System.out.println("Team 4: "+team4);
      System.out.println("Team 5: "+team5);
      System.out.println("Team 6: "+team6);
      System.out.println("Team 7: "+team7);
      System.out.println("Team 8: "+team8);
      System.out.println("Team 9: "+team9);
      System.out.println("Team 10: "+team10);
      System.out.println("Team 11: "+team11);
      System.out.println("Team 12: "+team12);
      System.out.println("Thanks for drafting!");
  }
}

