package algo;

public class MultiplicationAllOddsAndAddAllEvenNumbers {
    public static void main(String[] args) {
        int even =0, odd =1;
        for (int i=1;i<=20;i+=2) {
            odd = odd*i;
        }
        for(int i=2;i<=100; i+=2){
            even= even+i;
        }
        System.out.println("Even: " + even + "   Odd: " + odd);
    }
}
