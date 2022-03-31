public class Ergebnis {
        int trefferHeim;
        int trefferGast;

        public int trefferHeim() {
            trefferHeim++;
            return trefferHeim;
        }

        public int trefferGast() {
            trefferGast++;
            return trefferGast;

        }

        @Override
        public String toString() {
            String text = "\nErgebnis Heim = " + trefferHeim;
            text += "\nErgebnis Gast = " + trefferGast;
            return text;
        }
    }


