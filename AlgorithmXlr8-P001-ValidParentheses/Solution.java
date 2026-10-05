import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        boolean isvalid = true;
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()){
                    isvalid=false;
                    break;
                } 
                    char top = stack.pop();

                    if ((c == ')' && top != '(') ||
                        (c == ']' && top != '[') ||
                        (c == '}' && top != '{')) {
                        isvalid = false;
                        break;
                    }
                
            }

        }
        if(!stack.isEmpty()) {System.out.println("false");}else{
        System.out.println(isvalid);

        }
    }
}