public class EncapsulationDemo {
    private String name;
    private int age;

    public EncapsulationDemo(String name1, int age1) {
        this.name = name1;
        this.age = age1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        EncapsulationDemo encapsulationDemo = new EncapsulationDemo("Shubha",20);
        System.out.println(encapsulationDemo.getName()+" "+encapsulationDemo.getAge());
        encapsulationDemo.setName("ABC");
        System.out.println(encapsulationDemo.getName());
    }
}
