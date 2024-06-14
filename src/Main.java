import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(permission(30, 40));
        System.out.println(permission(20, -40));
        System.out.println( permission(46, 60));
        System.out.println( permission(10, 10));
        System.out.println(permission(33, -1));
        int randomage = generateRandomage();
        System.out.println("Сгенерированный возраст " + randomage);

    }

    public static String permission(int age, int temperatura) {
        if ((age >= 20 && age <= 45 && temperatura >= -20 && temperatura <= 30)
                || (age < 20 && temperatura >= 0 && temperatura <= 28)
                || (age > 45 || temperatura >= -10 && temperatura <= 25)) {
            return "можем идти гулять";
        } else return "оставайтесь дома";
    }

    public static int generateRandomage(){
        Random random = new Random();
        return random.nextInt(100);
    }
}