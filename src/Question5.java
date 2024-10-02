import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an number: ");
        int number = sc.nextInt();

        if (number >= 18 ) {
            System.out.println(number +"성인 입니다.");
        } else {
            System.out.println(number +"미성년자 입니다.");
        }

    }
}
