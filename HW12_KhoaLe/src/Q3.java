import java.util.ArrayList;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> stack = new ArrayList<>();
        while (true) {
            String request = scanner.nextLine();
            String[] requestArr = request.split(" ");
            String command = requestArr[0];
            int x = 0;
            if (requestArr.length > 1) {
                x = Integer.parseInt(requestArr[1]);
            }

            switch (command) {
                case "init":
                    stack = new ArrayList<>();
                    break;
                case "push":
                    stack.add(x);
                    break;
                case "pop":
                    if (!stack.isEmpty()) {
                        stack.remove(stack.size() - 1);
                    }
                    break;
                case "top":
                    if (!stack.isEmpty()) {
                        System.out.println(stack.get(stack.size() - 1));
                    }
                    else
                        System.out.println(-1);
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    if (stack.isEmpty()) {
                        System.out.println(1);
                    }
                    else
                        System.out.println(0);
                    break;
                case "end":
                    return;
            }
        }

    }
}
