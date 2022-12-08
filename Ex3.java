import java.util.ArrayList;
import java.util.Stack;

// Напишите постфиксный калькулятор. 
// Пользователь вводит данные и операции в обратной польской записи. 
// Калькулятор вычисляет результат и проверяет, что в стэке получилось единственное число.
// Например:
// 5 4 3 - + => 5 1 + => 6



public class Ex3 {
    private static boolean isDigit(String exp) throws NumberFormatException {
        try {
            Integer.parseInt(exp);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) {

        var exp = "5 4 3 - +".split(" "); // (1 + 2) * 3
        int res = 0;
        
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < exp.length; i++) {

            if (isDigit(exp[i])) {
                st.push(Integer.parseInt(exp[i]));
            } else {
                switch (exp[i]) {
                    case "+":
                        res = st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "-":
                        res = -st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "*":
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;
                    case "/":
                        res =  st.pop()/ st.pop();
                        st.push(res);
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.printf("Ответ: "+"%d\n", st.pop());
    }
}