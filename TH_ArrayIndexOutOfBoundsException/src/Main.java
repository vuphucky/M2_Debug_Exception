import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       ArrayExamble arrayExamble = new ArrayExamble();
       Integer[] arr = arrayExamble.creatRamdom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n nhap chi so cua 1 phan tu bat ki");
        int x = scanner.nextInt();
        try{
            System.out.println("Gia tri cua phan tu co chi so " + x + " la " + arr[x]);
        } catch (IndexOutOfBoundsException e){
            System.err.println("Chỉ so vuot qua gioi han mang");
        }
    }
}