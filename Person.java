public class Person {
    private double height;

    public Person(double height) {
        this.height = height;
    }
// parameter of type person
    public boolean equals(Person other){
        return other.height == this.height;
    }
}