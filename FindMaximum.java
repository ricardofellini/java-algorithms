public class FindMaximum {

    public static int findMaximum(int a, int b, int c) {
        int max = a;

        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(findMaximum(1,2,3));
        System.out.println(findMaximum(8,8,1));
        System.out.println(findMaximum(3,2,3));
        System.out.println(findMaximum(1,1,9));
        System.out.println(findMaximum(1,9,9));
    }
}
