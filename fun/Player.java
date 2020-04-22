
/**
 * Write a description of class fantasy_football here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
public class Player
{
    Scanner scan = new Scanner(System.in);
    String name;
    ArrayList <String> team = new ArrayList <String>();
    public Player(String teamName)
    {
        name = teamName;
    }
    public void addPlayer()
    {
        System.out.println("what player would you like to pick? ");
        String pick = scan.nextLine();
        team.add(pick);
    }
    public boolean cap()
    {
        boolean q = false;
        if (team.size()<15)
            q = true;
        return q;
    }
    public String toString()
    {
        String print = "Team: "+team;
        return print;
    }
}
