
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
      System.out.println("Enter number of participants (8,10,12): ");
      int players = scan.nextInt();
      if (players == 8)
      {
          System.out.println("Team 1 name: ");
          String name = scan.nextLine();
          Player player1 = new Player(name);
          
          System.out.println("Team 2 name: ");
          name = scan.nextLine();
          Player player2 = new Player(name);
          
          System.out.println("Team 3 name: ");
          name = scan.nextLine();
          Player player3 = new Player(name);
          
          System.out.println("Team 4 name: ");
          name = scan.nextLine();
          Player player4 = new Player(name);
          
          System.out.println("Team 5 name: ");
          name = scan.nextLine();
          Player player5 = new Player(name);
          
          System.out.println("Team 6 name: ");
          name = scan.nextLine();
          Player player6 = new Player(name);
          
          System.out.println("Team 7 name: ");
          name = scan.nextLine();
          Player player7 = new Player(name);
          
          System.out.println("Team 8 name: ");
          name = scan.nextLine();
          Player player8 = new Player(name);
          
          while (player1.cap() || player2.cap() || player3.cap() || player4.cap() || player5.cap() || player6.cap() || player7.cap() || player8.cap())
          {
              player1.addPlayer();
              player2.addPlayer();
              player3.addPlayer();
              player4.addPlayer();
              player5.addPlayer();
              player6.addPlayer();
              player7.addPlayer();
              player8.addPlayer();
          }
          System.out.println(player1);
          System.out.println(player2);
          System.out.println(player3);
          System.out.println(player4);
          System.out.println(player5);
          System.out.println(player6);
          System.out.println(player7);
          System.out.println(player8);
          System.out.println("Thanks for drafting!");
      }
      else if (players == 10)
      {
          System.out.println("Team 1 name: ");
          String name = scan.nextLine();
          Player player1 = new Player(name);
          
          System.out.println("Team 2 name: ");
          name = scan.nextLine();
          Player player2 = new Player(name);
          
          System.out.println("Team 3 name: ");
          name = scan.nextLine();
          Player player3 = new Player(name);
          
          System.out.println("Team 4 name: ");
          name = scan.nextLine();
          Player player4 = new Player(name);
          
          System.out.println("Team 5 name: ");
          name = scan.nextLine();
          Player player5 = new Player(name);
          
          System.out.println("Team 6 name: ");
          name = scan.nextLine();
          Player player6 = new Player(name);
          
          System.out.println("Team 7 name: ");
          name = scan.nextLine();
          Player player7 = new Player(name);
          
          System.out.println("Team 8 name: ");
          name = scan.nextLine();
          Player player8 = new Player(name);
          
          System.out.println("Team 9 name: ");
          name = scan.nextLine();
          Player player9 = new Player(name);
          
          System.out.println("Team 10 name: ");
          name = scan.nextLine();
          Player player10 = new Player(name);
          
          while (player1.cap() || player2.cap() || player3.cap() || player4.cap() || player5.cap() || player6.cap() || player7.cap() || player8.cap() || player9.cap() || player10.cap())
          {
              player1.addPlayer();
              player2.addPlayer();
              player3.addPlayer();
              player4.addPlayer();
              player5.addPlayer();
              player6.addPlayer();
              player7.addPlayer();
              player8.addPlayer();
              player9.addPlayer();
              player10.addPlayer();
          }
          
          System.out.println(player1);
          System.out.println(player2);
          System.out.println(player3);
          System.out.println(player4);
          System.out.println(player5);
          System.out.println(player6);
          System.out.println(player7);
          System.out.println(player8);
          System.out.println(player9);
          System.out.println(player10);
          System.out.println("Thanks for drafting!");
        }
      else if (players == 12)
      {
          System.out.println("Team 1 name: ");
          String name = scan.nextLine();
          Player player1 = new Player(name);
          
          System.out.println("Team 2 name: ");
          name = scan.nextLine();
          Player player2 = new Player(name);
          
          System.out.println("Team 3 name: ");
          name = scan.nextLine();
          Player player3 = new Player(name);
          
          System.out.println("Team 4 name: ");
          name = scan.nextLine();
          Player player4 = new Player(name);
          
          System.out.println("Team 5 name: ");
          name = scan.nextLine();
          Player player5 = new Player(name);
          
          System.out.println("Team 6 name: ");
          name = scan.nextLine();
          Player player6 = new Player(name);
          
          System.out.println("Team 7 name: ");
          name = scan.nextLine();
          Player player7 = new Player(name);
          
          System.out.println("Team 8 name: ");
          name = scan.nextLine();
          Player player8 = new Player(name);
          
          System.out.println("Team 9 name: ");
          name = scan.nextLine();
          Player player9 = new Player(name);
          
          System.out.println("Team 10 name: ");
          name = scan.nextLine();
          Player player10 = new Player(name);
          
          System.out.println("Team 11 name: ");
          name = scan.nextLine();
          Player player11 = new Player(name);
          
          System.out.println("Team 12 name: ");
          name = scan.nextLine();
          Player player12 = new Player(name);
          
          while (player1.cap() || player2.cap() || player3.cap() || player4.cap() || player5.cap() || player6.cap() || player7.cap() || player8.cap() || player9.cap() || player10.cap() || player11.cap() || player12.cap())
          {
              player1.addPlayer();
              player2.addPlayer();
              player3.addPlayer();
              player4.addPlayer();
              player5.addPlayer();
              player6.addPlayer();
              player7.addPlayer();
              player8.addPlayer();
              player9.addPlayer();
              player10.addPlayer();
              player11.addPlayer();
              player12.addPlayer();
          }
          
          System.out.println(player1);
          System.out.println(player2);
          System.out.println(player3);
          System.out.println(player4);
          System.out.println(player5);
          System.out.println(player6);
          System.out.println(player7);
          System.out.println(player8);
          System.out.println(player9);
          System.out.println(player10);
          System.out.println(player11);
          System.out.println(player12);
          System.out.println("Thanks for drafting!");
        }
  }
}

