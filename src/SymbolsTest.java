public class SymbolsTest {
    public static int testSymbols (char[] c) {
        int arabic = 0;
        int rim = 0;
        int symbols = 0;
        for (int i = 0; i<c.length;i++){
            if (c[i]=='0' | c[i]=='1' | c[i]=='2' | c[i]=='3' | c[i]=='4' | c[i]=='5' | c[i]=='6' | c[i]=='7' | c[i]=='8' | c[i]=='9') {
                arabic = arabic + 1;
            }
            else if (c[i]=='I' | c[i]=='V' | c[i]=='X') {
                rim = rim + 1;
            }
        }
        if ((Calculator.dM==5 & arabic == 4) | (Calculator.dM==4 & arabic == 3) | (Calculator.dM==3 & arabic == 2)){
            symbols = 1;
            //System.out.println("Введены арабские цифры");
        }
        else if ((Calculator.dM==9 & rim == 8) |(Calculator.dM==8 & rim == 7) |(Calculator.dM==7 & rim == 6) | (Calculator.dM==6 & rim == 5) | (Calculator.dM==5 & rim == 4) | (Calculator.dM==4 & rim == 3) | (Calculator.dM==3 & rim == 2)) {
            symbols = 2;
            //System.out.println("Введены римские цифры");
        }
        else {
            symbols = 3;
            System.out.println("Введены некорректные символы");
        }
        return symbols;
    }




}
