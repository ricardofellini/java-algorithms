public class NormalizeString {

    // TRIM REMOVE OS ESPAÇOS
    // REPLACE ALTERA A VIRGULA PARA VAZIO, NESTE EXEMPLO.
    public static String normalizeString(String s){
        return s.toLowerCase().trim().replace(",", "");
    }

    public static void main(String[] args) {
        System.out.println(normalizeString(",,234AAki"));
    }
}
