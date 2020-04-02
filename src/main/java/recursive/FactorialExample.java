package recursive;

public class FactorialExample {
    public static void main(String[] args) {
    int res = Factorial(4);
        System.out.println(res);

    }

    static int Factorial(int n){
        if (n==0) {
            return 1;
        }
        else return n*Factorial(n-1);
    }
}
