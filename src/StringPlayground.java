public class StringPlayground {
    public static void main(String[] args) {
        System.out.println(cntParanthesis("(3+7))"));
        System.out.println(cntParanthesis("(((((3+7))"));
        System.out.println(cntParanthesis("((100+790909))"));
        System.out.println(cntParanthesis("(3+7))))))"));

    }

    public static int cntParanthesis(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
            }
        }
        return count;
    }
}