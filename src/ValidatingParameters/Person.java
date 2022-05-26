package ValidatingParameters;

public class Person {
    public static void main(String[] args) {
        //Person human = new Person("", 121); //IllegalArgumentException
        Person human = new Person("being", 120);
        System.out.println(human.getName()); 
        System.out.println(human.getAge());
    }
    private String name;
    private int age;

    public Person(String name, int age) {
        if(name == null || name.isEmpty() || name.length() > 40){
            throw new IllegalArgumentException("Name must be not null, not empty and < 40 length");
        }
        this.name = name;
        if(age < 0 || age > 120){
            throw new IllegalArgumentException("Age must be greater than 0 and less than 120");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
