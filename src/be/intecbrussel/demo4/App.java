package be.intecbrussel.demo4;

public class App {

    public static void main(String[] args) {

        System.out.println(average(4, 7, 9));
        System.out.println(average(4, 8));
        System.out.println(average(5, 45, 8, 8));
    }

    public static int average(int ... values) {
        System.out.println("Inside method variable params");
        int total = 0;
        for (int el: values) {
            total += el;
        }
        int average = 0;
        if(values.length != 0) {
            average = total/values.length;
        }
        return average;
    }

    public static int average(int number1, int number2) {
        System.out.println("Inside method 2 params");
        return (number1 + number2) / 2;
    }

}
