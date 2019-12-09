public class DualZahl {
    int i = 123;
    static int getggt(int i) { // GGT berechnen
        {
            int r;
            int erg;
            do{
                r=i%2; // Rest der Division der beiden Zahlern ermitteln (Teilrest Modulooperation)
                erg = r+i;
            } while (i!=0);
            return i;
        }

    }
    public static void main(String[] args) {
        System.out.println("Der größte gemeinsame Teiler von "  + (getggt(i)));
    }
}
