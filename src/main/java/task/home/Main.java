package task.home;

public class Main {
    public static void main(String[] args) {
        for (int r : new Randoms(20, 300)) {
            System.out.println("Случайное число: " + r);
            if (r == 30) {
                System.out.println("Выпало заданное число, давайте на этом закончим");
                break;
            }
        }
    }
}