import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод,
//  который вернет “перевернутый” список.

public class Ex1{
    public static void main(String[] args) {
        LinkedList <String> linkedList = new LinkedList<>();
        while(true) {
            String str = scannerText();
            if(str.equals("quit")){
                break;
            }
            else{
                linkedList.add(str);
            }
        }
        System.out.println(linkedList);
        Collections.reverse(linkedList);
        System.out.println(linkedList);

    }
    public static String scannerText(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите элемет списка: ");
        String text = in.nextLine();
        return text;
    }
}