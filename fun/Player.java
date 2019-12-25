
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
    private int moneyLeft = 400;
    private int numqb = 0;
    private int numrb = 0;
    private int numwr = 0;
    private int numte = 0;
    private int numteamD = 0;
    private int numd = 0;
    private int numflex1 = 0;
    private int numflex2 = 0;
    private int numbench = 0;
    private List team = new ArrayList();
    public Player(String name)
    {
        String teamName = name;
    }
    public void addPlayer()
    {
       List rb = new ArrayList();
       rb.add("rb-Saquon Barkley");
       rb.add("rb-Alvin Kamara");
       rb.add("rb-Le'Veon Bell");
       rb.add("rb-Ezekiel Elliot");
       rb.add("rb-Christian McCaffrey");
       rb.add("rb-Todd Gurley");
       rb.add("rb-Melvin Gordon");
       rb.add("rb-Joe Mixon");
       rb.add("rb-Nick Chubb");
       rb.add("rb-Dalvin Cook");
       rb.add("rb-Sony Michel");
       rb.add("rb-Kerryon Johnson");
       rb.add("rb-Aaron Jones");
       rb.add("rb-James Conner");
       rb.add("rb-Derrick Henry");
       rb.add("rb-Leonard Fournette");
       rb.add("rb-Jordan Howard");
       rb.add("rb-Chris Carson");
       rb.add("rb-Adrian Peterson");
       rb.add("rb-Damien Williams");
       rb.add("rb-Josh Jacobs");
       rb.add("rb-Lesean McCoy");
       rb.add("rb-Philip Lindsay");
       rb.add("rb-Marlon Mack");
       rb.add("rb-David Johnson");
       rb.add("rb-Mark Ingram");
       rb.add("rb-David Montgomery");
       rb.add("rb-Tevin Coleman");
       rb.add("rb-Devonta Freeman");
       rb.add("rb-Lamar Miller");
       rb.add("rb-Kenyan Drake");
       rb.add("rb-Ronald Jones");
       rb.add("rb-Frank Gore");
       rb.add("rb-Darren Sproles");
       rb.add("rb-Danny Woodhead");
       rb.add("rb-Dion Lewis");
       rb.add("rb-Bilal Powell");
       rb.add("rb-Giovani Bernard");
       rb.add("rb-Chris Thompson");
       rb.add("rb-Latavius Murray");
       rb.add("rb-Miles Sanders");
       rb.add("rb-Rashaad Penny");
       rb.add("rb-Ameer Abdullah");
       rb.add("rb-Rex Burkhead");
       rb.add("rb-James White");
       rb.add("rb-Spencer Ware");
       rb.add("rb-CJ Anderson");
       rb.add("rb-Carlos Hyde");
       rb.add("rb-Jerick McKinnon");
       rb.add("rb-Duke Johnson");
       rb.add("rb-Kareem Hunt");
       rb.add("rb-Jay Ajayi");
       rb.add("rb-TJ Yeldon");
       rb.add("rb-Mike Davis");
       rb.add("rb-Ty Montgomery");
       rb.add("rb-CJ Prosise");
       rb.add("rb-Wendell Smallwood");
       rb.add("rb-Samaje Perine");
       rb.add("rb-Derrius Guice");
       rb.add("rb-Jamaal Williams");
       rb.add("rb-Wayne Gallman");
       rb.add("rb-Tarik Cohen");
       rb.add("rb-Jalen Richard");
       rb.add("rb-Matt Breida");
       
       List qb = new ArrayList();
       qb.add("qb-Aaron Rodgers");
       qb.add("qb-Patrick Mahomes");
       qb.add("qb-Russell Wilson");
       qb.add("qb-Deshaun Watson");
       qb.add("qb-Matt Ryan");
       qb.add("qb-Philip Rivers");
       qb.add("qb-Drew Brees");
       qb.add("qb-Tom Brady");
       qb.add("qb-Jacoby Brissett");
       qb.add("qb-Baker Mayfield");
       qb.add("qb-Jared Goff");
       qb.add("qb-Ben Roethlisberger");
       qb.add("qb-Carson Wentz");
       qb.add("qb-Mitchell Trubisky");
       qb.add("qb-Cam Newton");
       qb.add("qb-Dak Prescott");
       qb.add("qb-Sam Darnold");
       qb.add("qb-Derek Carr");
       qb.add("qb-Kirk Cousins");
       qb.add("qb-Nick Foles");
       qb.add("qb-Ryan Tannehill");
       qb.add("qb-Jameis Winston");
       qb.add("qb-Josh Allen");
       qb.add("qb-Lamar Jackson");
       qb.add("qb-Kyler Murray");
       qb.add("qb-Jimmy Garoppolo");
       qb.add("qb-Matthew Stafford");
       qb.add("qb-Ryan Fitzpatrick");
       qb.add("qb-Eli Manning");
       qb.add("qb-Joe Flacco");
       qb.add("qb-Andy Dalton");
       qb.add("qb-Case Keenum");
       
       List wr = new ArrayList();
       wr.add("wr-Michael Thomas");
       wr.add("wr-DeAndre Hopkins");
       wr.add("wr-Davante Adams");
       wr.add("wr-Odell Beckham Jr.");
       wr.add("wr-Tyreek Hill");
       wr.add("wr-JuJu Smith-Schuster");
       wr.add("wr-Amari Cooper");
       wr.add("wr-Mike Evans");
       wr.add("wr-Julio Jones");
       wr.add("wr-Chris Godwin");
       wr.add("wr-DJ Moore");
       wr.add("wr-Kenny Golloday");
       wr.add("wr-Courtland Sutton");
       wr.add("wr-Larry Fitzgerals");
       wr.add("wr-DeSean Jackson");
       wr.add("wr-Julian Edelman");
       wr.add("wr-Golden Tate");
       wr.add("wr-Demaryius Thomas");
       wr.add("wr-Emmanuel Sanders");
       wr.add("wr-AJ Green");
       wr.add("wr-Randall Cobb");
       wr.add("wr-Alshon Jeffery");
       wr.add("wr-Mohamed Sanu");
       wr.add("wr-TY Hilton");
       wr.add("wr-Josh Gordon");
       wr.add("wr-Cole Beasley");
       wr.add("wr-Tavon Austin");
       wr.add("wr-Cordarelle Patterson");
       wr.add("wr-Robert Woods");
       wr.add("wr-Keenan Allen");
       wr.add("wr-Marquise Goodwin");
       wr.add("wr-Kenny Stills");
       wr.add("wr-Marvin Jones");
       wr.add("wr-Jermaine Kearse");
       wr.add("wr-Chris Hogan");
       wr.add("wr-Sammy Watkins");
       wr.add("wr-Brandin Cooks");
       wr.add("wr-Marqise Lee");
       wr.add("wr-Paul Richardson");
       wr.add("wr-Cody Latimer");
       wr.add("wr-Allen Robinson");
       wr.add("wr-Jarvis Landry");
       wr.add("wr-John Brown");
       wr.add("wr-Willie Snead");
       wr.add("wr-Allen Hurns");
       wr.add("wr-DeVante Parker");
       wr.add("wr-Philip Dorsett");
       wr.add("wr-Breshad Perriman");
       wr.add("wr-Nelson Agholor");
       wr.add("wr-Devin Funchess");
       wr.add("wr-Tyler Lockett");
       wr.add("wr-Chris Conley");
       wr.add("wr-Stefon Diggs");
       wr.add("wr-Jamison Crowder");
       wr.add("wr-Will Fuller");
       wr.add("wr-Sterling Shepard");
       wr.add("wr-Tyler Boyd");
       wr.add("wr-Laquon Treadwell");
       wr.add("wr-Mecole Hardman");
       wr.add("wr-N'Keal Harry");
       wr.add("wr-DK Metcalf");
       wr.add("wr-Anthony Miller");
       wr.add("wr-Demarcus Robinson");
       wr.add("wr-Marquise Brown");
       
       List te = new ArrayList();
       te.add("te-Travis Kelce");
       te.add("te-George Kittle");
       te.add("te-Zach Ertz");
       te.add("te-Evan Engram");
       te.add("te-Jared Cook");
       te.add("te-OJ Howard");
       te.add("te-Eric Ebron");
       te.add("te-Hunter Henry");
       te.add("te-David Njoku");
       te.add("te-Jimmy Graham");
       te.add("te-Kyle Rudolph");
       te.add("te-Vance McDonals");
       te.add("te-Greg Olsen");
       te.add("te-Austin Hooper");
       te.add("te-TJ Hockenson");
       te.add("te-Noah Fant");
       te.add("te-Delanie Walker");
       te.add("te-Chris Herndon");
       te.add("te-Jordan Reed");
       te.add("te-Mark Andrews");
       te.add("te-Trey Burton");
       te.add("te-Dallas Goedert");
       te.add("te-Jack Doyle");
       te.add("te-Benjamin Watson");
       te.add("te-Darren Waller");
       te.add("te-Tyler Eifert");
       te.add("te-Mike Gesicki");
       te.add("te-Jason Witten");
       te.add("te-Ricky-Seals Jones");
       te.add("te-Adam Shaheen");
       te.add("te-Hayden Hurst");
       te.add("te-Nick Vannett");
       
       List teamD = new ArrayList();
       teamD.add("tD-Arizona Cardinals");
       teamD.add("tD-Atlanta Falcons");
       teamD.add("tD-Baltimore Ravens");
       teamD.add("tD-Buffalo Bills");
       teamD.add("tD-Carolina Panthers");
       teamD.add("tD-Chicago Bears");
       teamD.add("tD-Cincinnati Bengals");
       teamD.add("tD-Cleveland Browns");
       teamD.add("tD-Dallas Cowboys");
       teamD.add("tD-Denver Broncos");
       teamD.add("tD-Detroit Lions");
       teamD.add("tD-Green Bay Packers");
       teamD.add("tD-Houston Texans");
       teamD.add("tD-Indianapolis Colts");
       teamD.add("tD-Jacksonville Jaguars");
       teamD.add("tD-Kansas City Chiefs");
       teamD.add("tD-Los Angeles Chargers");
       teamD.add("tD-Los Angeles Rams");
       teamD.add("tD-Miami Dolphins");
       teamD.add("tD-Minnesota Vikings");
       teamD.add("tD-New England Patriots");
       teamD.add("tD-New Orleans Saints");
       teamD.add("tD-New York Giants");
       teamD.add("tD-New York Jets");
       teamD.add("tD-Oakland Raiders");
       teamD.add("tD-Philadelphia Eagles");
       teamD.add("tD-Pittsburgh Steelers");
       teamD.add("tD-San Francisco 49ers");
       teamD.add("tD-Seattle Seahawks");
       teamD.add("tD-Tampa Bay Buccaneers");
       teamD.add("tD-Tennessee Titans");
       teamD.add("tD-Washington Redskins");
       
       List D = new ArrayList();
       D.add("iD-Darius Leonard");
       D.add("iD-Bobby Wagner");
       D.add("iD-Luke Kuechly");
       D.add("iD-Deion Jones");
       D.add("iD-Blake Martinez");
       D.add("iD-Aaron Donald");
       D.add("iD-Leighton Vander Esch");
       D.add("iD-JJ Watt");
       D.add("iD-Roquan Smith");
       D.add("iD-Jamal Adams");
       D.add("iD-Myles Garrett");
       D.add("iD-Cory Littleton");
       D.add("iD-Tremaine Edmunds");
       D.add("iD-Lavonte David");
       D.add("iD-Landon Collins");
       D.add("iD-CJ Mosley");
       D.add("iD-Joe Schobert");
       D.add("iD-Joey Bosa");
       D.add("iD-Derwin James");
       D.add("iD-Jaylon Smith");
       D.add("iD-Danielle Hunter");
       D.add("iD-Keanu Neal");
       D.add("iD-Christian Kirksey");
       D.add("iD-Cameron Jordan");
       D.add("iD-Kwon Alexander");
       D.add("iD-Budda Baker");
       D.add("iD-Demarcus Lawrence");
       D.add("iD-DeForest Buckner");
       D.add("iD-Khalil Mack");
       D.add("iD-Melvin Ingram");
       D.add("iD-Frank Clark");
       D.add("iD-Alec Ogletree");
       
       List K = new ArrayList();
       K.add("KK-Adam Vinatieri");
       K.add("KK-Stephen Gostkowski");
       K.add("KK-Graham Gano");
       K.add("KK-Justin Tucker");
       K.add("KK-Aldrick Rosas");
       K.add("KK-Matt Bryant");
       K.add("KK-Matt Prater");
       K.add("KK-Greg Zuerlein");
       K.add("KK-Eddy Piniero");
       K.add("KK-Chandler Catanzaro");
       K.add("KK-Kai Forbath");
       K.add("KK-Ryan Succop");
       K.add("KK-Dan Bailey");
       K.add("KK-Steven Hauschka");
       K.add("KK-Younghoe Koo");
       K.add("KK-Sebastian Janikowski");
       K.add("KK-Mason Crosby");
       K.add("KK-Robbie Gould");
       K.add("KK-Cairo Santos");
       K.add("KK-Nick Folk");
       K.add("KK-Mike Nugent");
       K.add("KK-Jake Elliot");
       K.add("KK-Brett Maher");
       K.add("KK-Michael Badgley");
       K.add("KK-Daniel Carlson");
       K.add("KK-Chris Boswell");
       K.add("KK-Harrison Butker");
       K.add("KK-Ka'imi Fairbairn");
       K.add("KK-Matt Gay");
       K.add("KK-Josh Lambo");
       K.add("KK-Will Lutz");
       K.add("KK-Joey Slye");
       
        System.out.println("Type the name of the player you want to pick(format: <position>-<name>): ");
        System.out.println("Positions: Quarterback - qb, Running Back - rb, Wide Receiver - wr, Tight End - te, Team Defense - tD, Individual Defensive Player - iD, Kicker - KK");
        String choice = scan.nextLine();
        if (choice.substring(0,2)=="qb")
        {
            while (qb.contains(choice) == false)
            {
                System.out.println("invalid entry");
                System.out.println("Type the name of the player you want to pick(format: <position>-<name>)");
                System.out.println("Positions: Quarterback - qb");
                choice = scan.nextLine();
            }
            if (numqb >= 1)
            {
                numbench += 1;
                team.add(choice);
            }
            else
            {
                numqb += 1;
                team.add(choice);
            }
        }
        
    }
}
