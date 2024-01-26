package ComparisonOperators;

public class Person {
    public Person(String juan, int i) {
    }

    public static void main(String[] args) {
        Person p1 = new Person("Juan", 25);
        Person p2 = new Person("Juan", 25);
        Person p3 = new Person("Ana", 30);
        System.out.println(p1 == p2);
        System.out.println(p1 != p2);
        System.out.println(p1 == p3);
        System.out.println(p1 != p3);
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
    }
}
