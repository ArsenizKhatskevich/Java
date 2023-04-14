import java.util.Scanner;

public class homeworkone {
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);
        System.out.println(" Привет,как тебя зовут? ");
        String name = string.nextLine();
        System.out.println(" какая у тебя Фамилия? ");
        String  secondName = string.nextLine();
        String fullName = ( name  + " " +  secondName);

        System.out.println ( fullName);

    }
}
