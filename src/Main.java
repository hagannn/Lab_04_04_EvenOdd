import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int getInt() throws IOException {
        InputStreamReader sr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(sr);

        try {
            System.out.print("Enter number: ");
            return Integer.parseInt(br.readLine());
        } catch (Exception e) {
            return getInt();
        }
    }

    static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) throws IOException {
        int userNum = getInt();
        boolean even = isEven(userNum);

        if (even) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}
