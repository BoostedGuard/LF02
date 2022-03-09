import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



    public static String readString() throws IOException {

        String eingabe1 = br.readLine();

        return eingabe1;

    }



    public static int readInteger() throws IOException {



        while (true) {

            try {

                String eingabe1 = readString();

                int zahl1 = Integer.parseInt(eingabe1);

                return zahl1;

            } catch (NumberFormatException e) {

                System.out.println("Bitte geben sie eine Ganzzahl ein!");

            }

        }



    }



    public static double readDouble() throws IOException {

        while (true) {

            try {

                String eingabe1 = readString();

                double zahl1 = Double.parseDouble(eingabe1.trim().replace(",", "."));

                return zahl1;

            } catch (NumberFormatException e) {

                System.out.println("Bitte geben sie Ganz/Kommazahlen ein!");

            }

        }

    }



    public static boolean readBoolean() throws IOException {

        while (true) {

            String eingabe = IO.readString();

            if (eingabe != null) {

                if ((eingabe.equalsIgnoreCase("ja")) || (eingabe.equalsIgnoreCase("j")) || (eingabe.equalsIgnoreCase("yes"))) {

                    return true;

                } else if (eingabe.equalsIgnoreCase("n") || (eingabe.equalsIgnoreCase("nein")) || (eingabe.equalsIgnoreCase("no"))) {

                    return false;

                }

            }

        }

    }



    public static int[] readIntegerArray1D() throws IOException {

        System.out.println("Wie oft soll wiederholt werden?");

        int wiederholung = IO.readInteger();

        int[] array = readIntegerArray1D(wiederholung);

        return array;

    }



    public static int[] readIntegerArray1D(int anzahlWerte) throws IOException {

        int[] array = new int[anzahlWerte];

        array = readIntegerArray1D(array);

        return array;

    }



    public static int[] readIntegerArray1D(int[] array) throws IOException {

        for (int i = 0; i < array.length; i++) {

            System.out.println("Wert eingeben für [" + (i + 1) + "]: ");

            array[i] = readInteger();

        }

        return array;

    }





    public static double[] readDoubleArray1D() throws IOException {

        System.out.println("Wie oft soll wiederholt werden?");

        int wiederholung = IO.readInteger();

        double[] array = readDoubleArray1D(wiederholung);

        return array;

    }



    public static double[] readDoubleArray1D(int anzahlWerte) throws IOException {

        double[] array = new double[anzahlWerte];

        array = readDoubleArray1D(array);

        return array;

    }



    public static double[] readDoubleArray1D(double[] array) throws IOException {

        for (int i = 0; i < array.length; i++) {

            System.out.println("Wert eingeben für [" + (i + 1) + "]: ");

            array[i] = readDouble();

        }

        return array;

    }



    public static String[] readStringArray1D() throws IOException {

        System.out.println("Wie lang soll das Array sein ?");

        int anzahl = IO.readInteger();

        String[] array = readStringArray1D(anzahl);

        return array;

    }



    public static String[] readStringArray1D(int n) throws IOException {

        String[] array = new String[n];

        array = readStringArray1D(array);

        return array;

    }



    public static String[] readStringArray1D(String[] array) throws IOException {

        for (int i = 0; i < array.length; i++) {

            System.out.println("Bezeichung für [" + (i+1) + "] : ");

            array[i] = readString();

        }

        return array;



    }









    public static String[][] readStringArray2D() throws IOException{

        System.out.println("Wie viele Zeilen?");

        int zeilen = readInteger();

        System.out.println("Wie viele Spalten?");

        int spalten = readInteger();

        String[][] array = readStringArray2D(zeilen, spalten);

        return array;

    }





    public static String[][] readStringArray2D(int anzahlZeilen, int anzalSpalten) throws IOException {

        String[][] array = new String[anzahlZeilen][anzalSpalten];

        return array;

    }



    public static String[][] readStringArray2D(String[][] array) throws IOException{

        for (int i = 0 ; i< array[i].length;i++) {

            for (int j = 0; j < array[i].length; j++) {

                System.out.println("Gib den wert ein der an der stelle [" + i + "][" + i + "] stehen soll");

                array[i][j] = IO.readString();

            }

        }

        return array;

    }

    public static String[][] systemOutPrintArray2D(String[][] array) throws IOException{

        for (int i = 0; i<array.length;i++){

            for (int j = 0; j < array[i].length; j++) {

                System.out.print(array[i][j] + "\t");

            }

            System.out.println();

        }

        return array;

    }

    public static int[][] readIntegerArray2D() throws IOException{

        System.out.println("Wie viel zeilen?");

        int zeilen = readInteger();

        System.out.println("Wie viele Spalten?");

        int spalten = readInteger();

        int[][] array = readIntegerArray2D(zeilen, spalten);

        return array;

    }

    public static int [][] readIntegerArray2D(int anzahlZeilen, int anzahlSpalten) throws IOException{

        int[][] array = new int[anzahlZeilen][anzahlSpalten];

        array=readIntegerArray2D(array);

        return array;

    }

    public static int[][] readIntegerArray2D(int[][] array) throws IOException{

        for (int i = 0;i<array[i].length;i++){

            for (int j = 0;j<array[i].length;j++){

                System.out.println("Gieb den wer ein der an ["+i+"] ["+j+"] stehen soll");

                array[i][j]=IO.readInteger();

            }

        }

        return array;

    }

    public static int[][] systemOutPrintArrayint2D(int[][] array) throws IOException {

        for (int i = 0; i < array.length; i++) {

            for (int y = 0; y < array[i].length; y++) {

                System.out.print(array[i][y] + "\t");

            }

            System.out.println();

        }

        return array;

    }
}
