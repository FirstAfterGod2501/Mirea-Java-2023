package Task7.src;

public class Team {
    private String Name;

    private int Score;

    public Team(String name){
        Name = name;
    }

    public void IncreaseScore(){
        Score++;
    }

    public int GetScore(){
        return Score;
    }

    public String GetName(){
        return Name;
    }
}
