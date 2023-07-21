import java.util.Scanner;

public class longestsubstr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int maxLength = longestSubstringLength(str);

        System.out.println(maxLength);
    }

    private static int longestSubstringLength(String str) {
        int maxLength = 0;
        int start = 0;
        int n = str.length();

        for (int i = 0; i < n; i++) {
            boolean[] visited = new boolean[256]; // Assuming ASCII characters

            int currentLength = 0;
            for (int j = i; j < n; j++) {
                char ch = str.charAt(j);
                if (visited[ch]) {
                    break;
                }
                visited[ch] = true;
                currentLength++;
            }

            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }
}
