public class App {
    static boolean areRoatation(String s1,String s2){
        if(s1.length() == s2.length()){
            String temp= s1 + s1;
            if(temp.contains(s2)){
                return true;
            }
        }else{
            return false;
        }
        return false;
    }

     static boolean areRotation(String str1, String str2) {
        int l1 = str1.length();
        int l2 = str2.length();
        if (l1 != l2)
            return false;

        else {
            String s = str1 + str1;
            for (int i = 0; i < s.length() - l2; i++) {
                //.compareTo function return ASCII difference 
                if (s.substring(i, i + l2).compareTo(str2) == 0) {
                    return true;
                }
            }
            return false;
        }

    }
    public static void main(String[] args) throws Exception {
        String str1 = "AACD";
        String str2 = "ACDA";

        if(areRoatation(str1, str2)){
            System.out.println("yes Present");
        }
        else{
            System.out.println("Not Present");

        }

    }
}
