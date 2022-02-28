public class LowerAndUpperCase {

    public static boolean isUpperCase(String s){
       return s.chars().allMatch(Character::isUpperCase);
    }

    public static boolean isLowerCase(String s){
        return s.chars().allMatch(Character::isLowerCase);
    }

    public static void main(String[] args) {
        System.out.println(isLowerCase("HELLO WORLD"));
        System.out.println(isLowerCase("helloworld"));
        System.out.println(isUpperCase("TesTE"));
        System.out.println(isUpperCase("HELLO"));
    }
}
