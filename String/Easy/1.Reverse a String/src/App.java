public class App {

    static void reverce(char s[]){
        int i=0,j=s.length-1;

        while(i < j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }

    }

    static void display(char s[]){
        for(int i=0;i<s.length;i++)
        System.out.print(s[i]+" ");
    }
    public static void main(String[] args) throws Exception {
        
        char S[] = {'h','e','l','l','o'};

        reverce(S);
        display(S);
    }
}
