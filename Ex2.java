import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент 
// из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.


public class Ex2 {
    public static void main(String[] args) {
        Deque <String> deque = new ArrayDeque<>();
        
        while(true) {
            String comand = comands();
            if(comand.equals("0")){
                break;
            }
            else if (comand.equals("1")){
                System.out.println("Введите элемент для ввода в конец");
                deque.addLast(scannerText());
                System.out.println(deque);
            }
    
            else if (comand.equals("2")){
                deque.removeFirst();
                System.out.println(deque);
            }
    
            else if (comand.equals("3")){
                System.out.println(deque.getFirst());
            }
        }

    }

    public static String scannerText(){
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        return text;
    }
    public static String comands(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер команды:"+"\n"+"1-enqueue() - помещает элемент в конец очереди"+"\n"+"2-dequeue() - возвращает первый элемент из очереди и удаляет его"+"\n"+"3-first() - возвращает первый элемент из очереди, не удаляя"+"\n"+"0-выход");
        String text = in.nextLine();
        return text;
    }
}

