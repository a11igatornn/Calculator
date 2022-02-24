
import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
    public static int dM; // длина массива
    public static int n = 0; // положение знака
    public static char[] c; // массив символов


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите пример: ");
        String s = in.nextLine();
        //System.out.printf("Вы ввели: " + s);
        in.close();
        //System.out.println();
        char[] c = s.toCharArray();
        //System.out.println("Получившийся массив: " + Arrays.toString(c));
        dM = c.length;
        //System.out.println("Длина массива: " + dM);

        //ищем знак и убеждаемся, что он один
        int f = 0;
        for (int i = 0; i < dM; i++) {
            if (c[i] == '+' | c[i] == '-' | c[i] == '*' | c[i] == '/') { // проверяем есть ли знак
                f = f+1;
                n=i;
            }
        }

        if (f==1) {
            //System.out.println("Знак коректный, позиция знака: " + n);
        }
        else {
            System.out.println("Знак некорректный");
            System.exit(0);
        }

        // проверяем арабские, римские или некорректные
        int v = SymbolsTest.testSymbols (c);
        //System.out.println("Код символов: " + v);

        // производим арифметические операции
        if (v==1) { // для арабских чисел
            int a = 0; // числа для итоговой операции
            int b = 0;
            for (int i = 0; i<n; i++){
                a = a*10 + Character.digit(c[i],10);
            }
            //System.out.println("Первое число: " + a); // находим первое число
            if (a>10) { // проверяем, что число не больше 10
                System.out.println("Первое число больше 10");
                System.exit(0);
            }

            for (int i = n+1; i<dM; i++){
                b = b*10 + Character.digit(c[i],10);
            }
            //System.out.println("Второе число: " + b); // находим второе число
            if (b>10) {
                System.out.println("Второе число больше 10");
                System.exit(0);
            }

            System.out.println("Ответ: " + Arifm.result (c[n], a, b));
        }

        char[] c1 = new char[n];
        char[] c2 = new char[dM-n-1];

        if (v==2){ //для римских чисел
            int a = 0;// числа для итоговой операции
            int b = 0;

            for (int i = 0; i<n;i++){
                c1[i] = c[i];
            }
            //System.out.print("Первая цифра: ");
            //System.out.println(c1);
            String s1 = new String(c1);
            if (s1.equals("I")){
                a = 1;
            }
            else if (s1.equals("II")){
                a = 2;
            }
            else if (s1.equals("III")){
                a = 3;
            }
            else if (s1.equals("IV")){
                a = 4;
            }
            else if (s1.equals("V")){
                a = 5;
            }
            else if (s1.equals("VI")){
                a = 6;
            }
            else if (s1.equals("VII")){
                a = 7;
            }
            else if (s1.equals("VIII")){
                a = 8;
            }
            else if (s1.equals("IX")){
                a = 9;
            }
            else if (s1.equals("X")){
                a = 10;
            }
            else {
                System.out.println("Введена некорректная первая цифра");
                System.exit(0);
            }

            for (int i = n+1, j = 0; i<dM;i++, j++){
                c2[j] = c[i];
            }
            //System.out.print("Вторая цифра: ");
            //System.out.println(c2);
            String s2 = new String (c2);
            if (s2.equals("I")){
                b = 1;
            }
            else if (s2.equals("II")){
                b = 2;
            }
            else if (s2.equals("III")){
                b = 3;
            }
            else if (s2.equals("IV")){
                b = 4;
            }
            else if (s2.equals("V")){
                b = 5;
            }
            else if (s2.equals("VI")){
                b = 6;
            }
            else if (s2.equals("VII")){
                b = 7;
            }
            else if (s2.equals("VIII")){
                b = 8;
            }
            else if (s2.equals("IX")){
                b = 9;
            }
            else if (s2.equals("X")){
                b = 10;
            }
            else {
                System.out.println("Введена некорректная вторая цифра");
                System.exit(0);
            }
            //System.out.println("Ответ: " + Arifm.result (c[n], a, b));

            if (Arifm.result (c[n], a, b) <1){
                System.out.println("Результат вычисления римских цифр меньше 1");
                System.exit(0);
            }
            else {
                System.out.println("Ответ: " + ArabToRim.arabToRim(Arifm.result (c[n], a, b)));
            }


        }







    }
}
