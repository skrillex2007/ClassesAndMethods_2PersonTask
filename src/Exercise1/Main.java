package Exercise1;

public class Main {
    public static void main(String[] args) {
        Person person1=new Person("Anjelica", 25);
        Person person2=new Person("Anjelica", 25);

        System.out.println(person1.equals(person2));
    }
}