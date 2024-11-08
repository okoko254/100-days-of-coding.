class FreshJuice {
    enum FreshJuiceSize {SMALL, MEDIUM, LARGE}
    FreshJuiceSize size;
}

public class FreshJuiceTest {
    public static void main(String args[]) {
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
        System.out.println("Size: " + juice.size);
    }

}

/*Enums were introduced in Java 5.0. Enums restrict a variable to have one of only a few predefined values. The values in this enumerated list are called enums. */