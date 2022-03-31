import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.nio.file.FileAlreadyExistsException;

public class CSVWrite {
    public static void main(String[] args) throws FileNotFoundException {
        Vertragspartner kaeufer = new Vertragspartner("Klaus", "Brandt");
        kaeufer.setAusweisNr("0123456789");
        kaeufer.setAdresse(new Adresse("Zu Hause", "3a", "28199", "Bremen"));

        Vertragspartner verkaeufer = new Vertragspartner("Joachim", "Bredull");
        verkaeufer.setAusweisNr("9876543210");
        verkaeufer.setAdresse(new Adresse("Auch zu Hause", "7", "28195", "Bremen"));

        String datei = "C://Users//Lucas//OneDrive//ProgrammierenCSV/Kaufvertrag.csv";
        PrintWriter writer = new PrintWriter(datei);
        writer.println("Vertragspartner;Name;AusweisNr;Strasse;Ort");
        writer.print("Verkaeufer;");
        writer.print(verkaeufer.getVorname()+" "+verkaeufer.getNachname()+";");
        writer.print(verkaeufer.getAusweisNr()+";");
        writer.print(verkaeufer.getAdresse().getStrasse()+" "+verkaeufer.getAdresse().getHausNR()+";");
        writer.println(verkaeufer.getAdresse().getPostleitzahl()+" "+verkaeufer.getAdresse().getOrt()+";");
        writer.print("Kaeufer;");
        writer.print(kaeufer.getVorname()+" "+ kaeufer.getNachname()+";");
        writer.print(kaeufer.getAusweisNr()+";");
        writer.print(kaeufer.getAdresse().getStrasse()+" "+kaeufer.getAdresse().getHausNR()+";");
        writer.println(kaeufer.getAdresse().getPostleitzahl()+" "+kaeufer.getAdresse().getOrt()+";");
        writer.close();

    }
}
