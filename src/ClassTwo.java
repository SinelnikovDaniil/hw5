public class ClassTwo {
    public static void main(String[] args) {
        //Задание 3.11
        System.out.println();
        System.out.println("Задание 3.11");
        System.out.println("Задание А");
        int x1 = 1;
        int y1 = -1;
        boolean result1 = Math.pow(x1,2) + Math.pow(y1,2) <= 4;
        System.out.println(result1);

        System.out.println();
        System.out.println("Задание Б");
        int x2 = 1;
        int y2 = 2;
        boolean result2 = (x2 >= 0) || (Math.pow(y2,2) != 4);
        System.out.println(result2);

        System.out.println();
        System.out.println("Задание В");
        int x3 = 1;
        int y3 = 2;
        boolean result3 = (x3 >= 0) && (Math.pow(y3,2) != 4);
        System.out.println(result3);

        System.out.println();
        System.out.println("Задание Г");
        int x4 = 2;
        int y4 = 1;
        boolean result4 = (x4 * y4 != 0) && (y4 > x4);
        System.out.println(result4);

        System.out.println();
        System.out.println("Задание Д");
        int x5 = 2;
        int y5 = 1;
        boolean result5 = (x5 * y5 != 0) || (y5 < x5);
        System.out.println(result5);

        System.out.println();
        System.out.println("Задание Е");
        int x6 = 2;
        int y6 = 1;
        boolean result6 = (!(x6 * y6 < 0)) && (y6 > x6);
        System.out.println(result6);

        System.out.println();
        System.out.println("Задание Ж");
        int x7 = 1;
        int y7 = 2;
        boolean result7 = (!(x7 * y7 < 0)) || (y7 > x7);
        System.out.println(result7);

        //Задание 3.12
        System.out.println();
        System.out.println("Задание 3.12");
        System.out.println("Задание А");
        int x8 = 1;
        int y8 = -1;
        boolean result8 = Math.pow(x8,2) - Math.pow(y8,2) <= 0;
        System.out.println(result8);

        System.out.println();
        System.out.println("Задание Б");
        int x9 = 2;
        int y9 = -2;
        boolean result9 = (x9 >= 2) || (Math.pow(y9,2) != 4);
        System.out.println(result9);

        System.out.println();
        System.out.println("Задание В");
        int x10 = 2;
        int y10 = 2;
        boolean result10 = (x10 >= 0) && (Math.pow(y10,2) > 4);
        System.out.println(result10);

        System.out.println();
        System.out.println("Задание Г");
        int x11 = 1;
        int y11 = 2;
        boolean result11 = (x11 * y11 != 4) && (y11 > x11);
        System.out.println(result11);

        System.out.println();
        System.out.println("Задание Д");
        int x12 = 2;
        int y12 = 1;
        boolean result12 = (x12 * y12 != 0) || (y12 < x12);
        System.out.println(result12);

        System.out.println();
        System.out.println("Задание Е");
        int x13 = 1;
        int y13 = 2;
        boolean result13 = (!(x13 * y13 < 1)) && (y13 > x13);
        System.out.println(result13);

        System.out.println();
        System.out.println("Задание Ж");
        int x14 = 2;
        int y14 = 1;
        boolean result14 = (!(x14 * y14 < 0)) || (y14 > x14);
        System.out.println(result14);
    }
}
