public class ComplexPassword {

    public static boolean isComplexPassword(String s){
        return s.chars().anyMatch(Character::isUpperCase) &&
                s.chars().anyMatch(Character::isDigit) &&
                s.chars().anyMatch(Character::isLowerCase);
    }

    public static void main(String[] args) {
        System.out.println(isComplexPassword("Aa1"));
    }
}
