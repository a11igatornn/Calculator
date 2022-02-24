public class ArabToRim {
    public static String arabToRim (int a){
        //System.out.println(a);
        int sotni = a / 100;
        int sotniOst = a % 100;
        //System.out.println("Количество сотен: " + sotni);
        //System.out.println(sotniOst);
        int polsotni = sotniOst / 50;
        //int polsotniO = sotniOst%50;
        //System.out.println("Количество 50: " + polsotni);
        //System.out.println(polsotniO);
        int desiatki = sotniOst / 10;
        int edinicy = sotniOst % 10;
        //System.out.println("Количество 10: " + desiatki);
        //System.out.println("Количество единиц: " + edinicy);



        StringBuffer sb = new StringBuffer();
        if (sotni != 0) {
            int i = 0;
            while (i < sotni) {
                sb.append("C");
                i++;
            }
        }
        if (desiatki == 9) {
            sb.append("XC");
        } else if (polsotni == 1) {
            sb.append("L");
            int i = 0;
            while (i < desiatki - 5) {
                sb.append("X");
                i++;
            }
        }
        if (desiatki == 4) {
            sb.append("XL");
        } else if (polsotni == 0) {
            int i = 0;
            while (i < desiatki) {
                sb.append("X");
                i++;
            }
        }
        if (edinicy == 9) {
            sb.append("IX");
        }
        if (edinicy == 8) {
            sb.append("VIII");
        }
        if (edinicy == 7) {
            sb.append("VII");
        }
        if (edinicy == 6) {
            sb.append("VI");
        }
        if (edinicy == 5) {
            sb.append("V");
        }
        if (edinicy == 4) {
            sb.append("IV");
        }
        if (edinicy == 3) {
            sb.append("III");
        }
        if (edinicy == 2) {
            sb.append("II");
        }
        if (edinicy == 1) {
            sb.append("I");
        }

        //System.out.println(sb.toString());

        return sb.toString();


    }

}
