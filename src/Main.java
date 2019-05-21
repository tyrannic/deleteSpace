import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str="";
        str+=input.nextLine();
        while (input.hasNext()){
            String s=input.nextLine();
            if(s.equals(";"))
                break;
            str+=s;

        }

        System.out.println(str);
    }
}
