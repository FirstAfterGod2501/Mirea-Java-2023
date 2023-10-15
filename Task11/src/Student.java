package Task11.src;

import java.util.concurrent.ThreadLocalRandom;

public class Student {
    private int Id;

    private String Name;

    private int Score;

    public Student(String name) {

        Name = name;

        Id = 0;

        Score = ThreadLocalRandom.current().nextInt(0, 100);
    }

    public Student(String name, int age) {

        Name = name;

        Id = age;

        Score = ThreadLocalRandom.current().nextInt(0, 100);

    }

    public Student() {

        Name = "Rex";

        Id = 0;

        Score = ThreadLocalRandom.current().nextInt(0, 100);

    }

    public void SetID(int age) {
        Id = age;
    }

    public void SetName(String name) {
        Name = name;
    }

    public int GetID() {
        return Id;
    }

    public String GetName(){
        return Name;
    }


    public int getGPA(){
        return Score;
    }


    public void setGPA(int score){
        Score = score;
    }

    public String toString(){
        return Name +", age " + Id +"\n";
    }

}
