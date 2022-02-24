public class Arifm {
    public static int otvet;
    public static int result (char c, int a, int b) {
        switch (c){
            case ('+'):
                otvet = a + b;
                break;
            case ('-'):
                otvet = a - b;
                break;
            case ('*'):
                otvet = a * b;
                break;
            case ('/'):
                otvet = a / b;
                break;
        }
        return otvet;
    }

}
