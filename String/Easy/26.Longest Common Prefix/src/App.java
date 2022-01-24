import java.util.Scanner;

//Ref : https://www.youtube.com/watch?v=K1ps6d7YCy4
  /* and REf = https://www.youtube.com/watch?v=bl8ue-dTxgs */
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        String[] str = new String[size];
        for (int i = 0; i < size; i++) {
            str[i] = sc.nextLine();
        }
        String res = longestCommonPrefix(str);
        System.out.println("Longest prefix: " + res);
        sc.close();
    }

    public static String longestCommonPrefix(String[] str) {
        if (str.length == 0)
            return "";

        String prefix=str[0];
        for(int i=1;i<str.length;i++){
            while(str[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
}
