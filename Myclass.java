public class Myclass{
    public static boolean isprime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int x=3;
        int y=100;
        for (int i = x; i <=y; i++) {
            if (isprime(i)) {
                System.out.println(i);
            }
        } 

        
    }
}