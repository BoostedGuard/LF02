import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

public class CSVRead {
    public static void main(String[] args) throws IOException {
        String datei = "C://Users//Lucas//OneDrive//ProgrammierenCSV/Kaufvertrag.csv";
        BufferedReader br = new BufferedReader(new FileReader(datei));

        String zeile;
        Vertragspartner kaeufer = null;
        Vertragspartner verkaeufer = null;
        while ((zeile = br.readLine()) != null){
            String str = zeile;
            String[]array = str.split(";");
            String[]name = array[1].split(" ");
            String[]adresse = array[3].split(" ");
            String strasse = "";
            for (int i = 0 ; i < adresse.length -1 ;i++ ){
                strasse +=adresse[i] + " ";
            }
            strasse = strasse.trim();
            String[]ort = array[4].split(" ");
            String ort2 = "";
            for (int y = 1 ; y < ort.length ; y++){
                ort2 += ort[y] + " ";
            }
            ort2 = ort2.trim();
            System.out.println(Arrays.toString(array));
            if (Objects.equals(array[0],"Verkaeufer")){
                verkaeufer = new Vertragspartner(name[0],name[1]);
                verkaeufer.setAusweisNr(array[2]);
                verkaeufer.setAdresse(new Adresse(strasse.toString() , adresse[adresse.length -1],ort[0],ort2.toString()));

            }
            if (Objects.equals(array[0],"Kaeufer")){
                kaeufer = new Vertragspartner(name[0],name[1]);
                kaeufer.setAusweisNr(array[2]);
                kaeufer.setAdresse(new Adresse(strasse.toString() , adresse[adresse.length -1],ort[0],ort2.toString()));

            }
        }
        System.out.println(verkaeufer);
        System.out.println(kaeufer);


    }
}
