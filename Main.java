
public class Main {
    public static void main(String[] args) {
    }

    public char findTheDifference(String s, String t) {

        int sumS = 0;
        int sumT = 0;

        for(int i = 0; i< s.length(); i++ ){
            sumS = sumS + s.charAt(i);
            sumT = sumT + t.charAt(i);
        }
        sumT = sumT + t.charAt(t.length()-1);


        return (char) (sumT-sumS) ;
    }

}

