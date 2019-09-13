import java.util.Scanner;

public class timmaxmang {
    public static void main(String[] args) {
        int X;
        int index;
        int[] array, array2;
        Scanner scanner = new Scanner(System.in);
        array = new int[10];
        array2=new int[10];;
        for (int i = 0; i < array.length; i++) {
                System.out.print("Enter a number [" + i + "]: ");
                array[i] = scanner.nextInt();
            }
        System.out.print("Nhap gia tri can chen : ");
        X=scanner.nextInt();
        System.out.print("Nhap vao vi tri can chen");
        index=scanner.nextInt();
        if((index>array.length-1)||(index<=1)){
            System.out.print("Khong the chen duoc phan tu vao mang ");
        }else {
            for (int i=0;i<index;i++){
                array2[i]=array[i];
            }
            array2[index]=X;
            for (int i=index+1;i<array2.length;i++){
                array2[i]=array[i-1];
            }
        }
        for (int i=0;i<10;i++){
            System.out.print("  "+array2[i]);
        }
    }
}
