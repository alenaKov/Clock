//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     Clock clock1 = new Clock();
     clock1.setHours(22);
     clock1.setMins(10);
     clock1.setSec(11);




clock1.tick();
        System.out.println(clock1.readTime());

        clock1.tick();
        System.out.println(clock1.readTime());

    }
}