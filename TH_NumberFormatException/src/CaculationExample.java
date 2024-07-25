import java.util.Scanner;

public class CaculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập x: ");
        int x = scanner.nextInt();
        System.out.println("Hãy nhập y: ");
        int y = scanner.nextInt();
        CaculationExample calc = new CaculationExample();
        calc.calculate(x,y);
    }
    private void calculate(int x, int y){
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("tong x + y = " + a);
            System.out.println("hieu x - y = " + b);
            System.out.println("tich x * y = " + c);
            System.out.println("thuong x / y = " + d);
        } catch (Exception e){
            System.err.println("Xay ra ngoai le: " + e.getMessage());
        }
    }
}
