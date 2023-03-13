public class TrueFalse {
    public static void main(String[] args) {

        //Задание 3.1
        System.out.println();
        System.out.println("Задание 3.1");
        boolean a1 = true;
        boolean b1 = false;
        boolean c1 = false;

        boolean result1 = a1 || b1;
        boolean result2 = a1 && b1;
        boolean result3 = b1 || c1;

        System.out.println("a = " + a1 + ", b = " + b1 + ", c = " + c1);
        System.out.println("a || b = " + result1 + "\na && b = " + result2 + "\nb || c = " + result3);

        //Задание 3.2
        System.out.println();
        System.out.println("Задание 3.2");
        boolean x1 = false;
        boolean y1 = true;
        boolean z1 = false;

        boolean result4 = x1 || z1;
        boolean result5 = x1 && y1;
        boolean result6 = x1 && z1;

        System.out.println("x = " + x1 + ", y = " + y1 + ", z = " + z1);
        System.out.println("x || z = " + result4 + "\nx && y = " + result5 + "\nx && z = " + result6);

        //Задание 3.3
        System.out.println();
        System.out.println("Задание 3.3");
        boolean a2 = true;
        boolean b2 = false;
        boolean c2 = false;

        boolean result7 = !a2 && b2;
        boolean result8 = a2 || !b2;
        boolean result9 = a2 && b2 || c2;

        System.out.println("a = " + a2 + ", b = " + b2 + ", c = " + c2);
        System.out.println("!a && b = " + result7 + "\na || !b = " + result8 + "\na && b || c = " + result9);

        //Задание 3.4
        System.out.println();
        System.out.println("Задание 3.4");
        boolean x2 = true;
        boolean y2 = true;
        boolean z2 = false;

        boolean result10 = !x2 && y2;
        boolean result11 = x2 || !y2;
        boolean result12 = x2 || y2 && z2;

        System.out.println("x = " + x2 + ", y = " + y2 + ", z = " + z2);
        System.out.println("!x && y = " + result10 + "\nx || !y = " + result11 + "\nx || y && z = " + result12);

        //Задание 3.5
        System.out.println();
        System.out.println("Задание 3.5");
        boolean a3 = true;
        boolean b3 = false;
        boolean c3 = false;

        boolean result13 = a3 || b3 && !c3;
        boolean result14 = !a3 && !b3;
        boolean result15 = !(a3 && c3) || b3;
        boolean result16 = a3 && !b3 || c3;
        boolean result17 = a3 && (!b3 || c3);
        boolean result18 = a3 || (!(b3 && c3));

        System.out.println("a = " + a3 + ", b = " + b3 + ", c = " + c3);
        System.out.println("a || b && !c = " + result13 + "\n!a && !b = " + result14);
        System.out.println("!(a && c) || b = " + result15 + "\na && !b || c = " + result16);
        System.out.println("a && (!b || c) = " + result17 + "\na || (!(b && c)) = " + result18);

        //Задание 3.6
        System.out.println();
        System.out.println("Задание 3.6");
        boolean x3 = false;
        boolean y3 = false;
        boolean z3 = true;

        boolean result19 = x3 || y3 && !z3;
        boolean result20 = !x3 && !y3;
        boolean result21 = !(x3 && z3) || y3;
        boolean result22 = x3 && !y3 || z3;
        boolean result23 = x3 && (!y3 || z3);
        boolean result24 = x3 || (!(y3 || z3));

        System.out.println("x = " + x3 + ", y = " + y3 + ", z = " + z3);
        System.out.println("x || y && !z = " + result19 + "\n!x && !y = " + result20);
        System.out.println("!(x && z) || y = " + result21 + "\nx && !y || z = " + result22);
        System.out.println("x && (!y || z) = " + result23 + "\nx || (!(y || z)) = " + result24);

        //Задание 3.7
        System.out.println();
        System.out.println("Задание 3.7");
        boolean a4 = true;
        boolean b4 = false;
        boolean c4 = false;

        boolean result25 = a4 || !(a4 && b4) || c4;
        boolean result26 = !a4 || a4 && (b4 || c4);
        boolean result27 = (a4 || b4 && !c4) && c4;

        System.out.println("a = " + a4 + ", b = " + b4 + ", c = " + c4);
        System.out.println("a || !(a && b) || c = " + result25);
        System.out.println("!a || a && (b || c) = " + result26);
        System.out.println("(a || b && !c) && c = " + result27);

        //Задание 3.8
        System.out.println();
        System.out.println("Задание 3.8");
        boolean x4 = false;
        boolean y4 = true;
        boolean z4 = false;

        boolean result28 = x4 && !(z4 || y4) || !z4;
        boolean result29 = !x4 || x4 && (y4 || z4);
        boolean result30 = (x4 || y4 && !z4) && z4;

        System.out.println("x = " + x4 + ", y = " + y4 + ", z = " + z4);
        System.out.println("x && !(z || y) || !z = " + result28);
        System.out.println("!x || x && (y || z) = " + result29);
        System.out.println("(x || y && !z) && z = " + result30);

        //Задание 3.9
        System.out.println();
        System.out.println("Задание 3.9");
        boolean x5 = true;
        boolean y5 = false;
        boolean z5 = false;

        boolean result31 = !x5 || !y5 || !z5;
        boolean result32 = (!x5 || !y5) && (x5 || y5);
        boolean result33 = x5 && y5 || x5 && z5 || !z5;

        System.out.println("x = " + x5 + ", y = " + y5 + ", z = " + z5);
        System.out.println("!x || !y || !z = " + result31);
        System.out.println("(!x || !y) && (x || y) = " + result32);
        System.out.println("x && y || x && z || !z = " + result33);

        //Задание 3.10
        System.out.println();
        System.out.println("Задание 3.10");
        boolean a5 = false;
        boolean b5 = false;
        boolean c5 = true;

        boolean result34 = (!a5 || !b5) && !c5;
        boolean result35 = (!a5 || !b5) && (a5 || b5);
        boolean result36 = a5 && b5 || a5 && c5 || !c5;

        System.out.println("a = " + a5 + ", b = " + b5 + ", c = " + c5);
        System.out.println("(!a || !b) && !c = " + result34);
        System.out.println("(!a || !b) && (a || b) = " + result35);
        System.out.println("a && b || a && c || !c = " + result36);
    }
}
