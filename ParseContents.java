public class ParseContents {

    public static void parseContents(String s){
        for (char c : s.toCharArray()){
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        String s = "hello";
        parseContents(s);
    }
}
