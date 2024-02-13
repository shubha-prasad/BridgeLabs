package set;

class Rose {
    public void flower() {
        System.out.println("Is a flower");
    }
}

class Grape extends Rose
{
    public void fruit()
    {
        System.out.println("Is a fruit");
    }
}

public class MethodOverRiding {
    public static void main(String[] args) {

        Rose obj = new Grape();
        obj.flower();
        Grape obj1 = new Grape();
        obj1.fruit();


    }
}
