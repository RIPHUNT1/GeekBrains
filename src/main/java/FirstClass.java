import com.sun.tools.corba.se.idl.constExpr.Negative;

import java.time.Year;

public class FirstClass {

    public static void main(String[] args) {
        short s = 320;
        long l = 520L;
        int i = 100;
        byte b = 20;
        float f = 125f;
        double d = 310;
        char c = '/';
        boolean bool = true;
        String str = "Моя строка";

    }

    public static float calculator(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static boolean task10and20(int a, int b) {
        return 10 <= a+b && a+b <= 20;

    }
    public static void isPositiveOrNegative (int x) {
        if (x>0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");

        }
    }
    public static boolean isNegative (int x) {
        if (x < 0) {
            return true;
        }
        else return false;
        }
    public static void greetingrs (String name) {
        System.out.println("Привет Иванов Иван!");


    }}