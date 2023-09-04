public class Dog {
    private int Age;

    private String Name;

    public Dog(String name) {

        Name = name;

        Age = 0;
    }

    public Dog(String name, int age) {

        Name = name;

        Age = age;
    }

    public Dog() {

        Name = "Rex";

        Age = 0;
    }

    public void SetAge(int age) {
        Age = age;
    }

    public void SetName(String name) {
        Name = name;
    }

    public int GetAge() {
        return Age;
    }

    public String GetName(){
        return Name;
    }

    public String toString(){
        return Name +", age " + Age;
    }

    public void IntoHumanAge(){

        String str = Name +
                "'s age in human years is " +
                Age * 7 +
                " Years";

        System.out.println(str);
    }
}
