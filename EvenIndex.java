public class EvenIndex {

    public static boolean isEvenIndex(String s, char item){
        if(s == null || s.isEmpty()){
            return false;
        }
        for(int i = 0; i < s.length() / 2 + 1; i=i+2){
            if(s.charAt(i) == item){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "HeLLo";
        System.out.println(isEvenIndex(s, 'L'));
        System.out.println(isEvenIndex(s, 'T'));
        System.out.println(isEvenIndex(s, 'H'));
        System.out.println(isEvenIndex("", 'H'));

    }
}
