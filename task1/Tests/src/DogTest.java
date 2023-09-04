public class DogTest {
    public DogTest(){

        Dog d1 = new Dog("Mike", 2);
        Dog d2 = new Dog("Helen", 7);
        Dog d3 = new Dog("Bob");

        d3.SetAge(1);

        System.out.println(d1);

        d1.IntoHumanAge();
        d2.IntoHumanAge();
        d3.IntoHumanAge();
    }
}
