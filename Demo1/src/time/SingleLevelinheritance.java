package time;

class Colors{
    void red()
    {
        System.out.println("is a color");
    }
    void blue()
    {
        System.out.println("is a color");
    }
    class Rainbow extends Colors{
        void violet()
        {
            System.out.println("is a color");

        }

    }
public class SingleLevelinheritance {
    public void main(String[] args) {

        Colors colors = new Colors();
        colors.red();
        colors.blue();
        System.out.println("--------------");
        Rainbow rainbow = new Rainbow();
        rainbow.red();
        rainbow.blue();
        rainbow.violet();


    }
}
}
