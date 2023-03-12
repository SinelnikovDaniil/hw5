public class TrueFalse {
    public static void main(String[] args) {

        //Задание 3.1
        boolean a = true;
        boolean b = false;
        boolean c = false;

        boolean result1 = a || b;
        boolean result2 = a && b;
        boolean result3 = b || c;

        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("a || b = " + result1 + "\na && b = " + result2 + "\nb || c = " + result3);
    }
}
