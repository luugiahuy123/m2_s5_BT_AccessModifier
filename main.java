package ss5.BT_AccessModifier;

public class main {
    public static void main(String[] args) {
        AccessModifier am = new AccessModifier();
        System.out.println("Bán kính ban đầu: " + am.getRadius());
        System.out.println("Diện tích ban đầu: " + am.getArea());

        am = new AccessModifier(2.5);
        System.out.println("Bán kính mới: " + am.getRadius());
        System.out.println("Diện tích mới: " + am.getArea());
    }
    }

