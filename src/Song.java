public class Song
{
    //Class or Instance variables
    private String title;
    private String artist;
    private boolean hasChorus;
    private int tempo;
    private double playTime;
    private static int numSongs;

    //2) Constructors
    public Song(String title, String artist, boolean hasChorus, int tempo, double playTime)
    {
        this.title = title;
        this.artist = artist;
        this.hasChorus = hasChorus;
        this.tempo = tempo;
        this.playTime = playTime;
        numSongs++;
    } //end full constructor
    //Overloaded constructor - must be different by type in the parameter list
    public Song(String myArtist, boolean myHasChorus, String myTitle, int myTempo, double time)
    {
        title = myTitle;
        artist = myArtist;
        hasChorus = myHasChorus;
        tempo = myTempo;
        playTime = time;
    } //end full constructor
    public Song()
    {
        //title = ""; //empty string, frequently used as a default value
        title = "title goes here";
        artist = "none"; //String types can be null or empty
        hasChorus = false; //typical default for a boolean type
        tempo = 0; //typical default for a number type
    }//end default constructor

    //4 Getter = allow the client to access instance variables
    public String getTitle()
    {
        return title;
    }//end title getter

    public String getArtist()
    {
        return artist;
    }//end artist getter

    //5) Setters (aka mutators) To change a value
    public int getTempo()
    {
        return tempo;
    }

    public static int getNumSongs()
    {
        return numSongs;
    }

    //6) Brain Methods
    //Convert the playTime into seconds
    public int playTimeSeconds()
    {
        //subtract minute part from playTime to get second part
        double something = playTime - (int)(playTime);
        int seconds = 60 * (int)(playTime);
                //gets the minute part into seconds
        return seconds;
    }

    //3) ToString
    public String toString()
    {
        String output = "Title: " + title +
                        "\nArtist: " + artist +
                        "\nHas a Chorus: " + hasChorus +
                        "\nTempo: " + tempo;
        return output;
    }
}//end Song class
