package loveProgramming;

public class StringWork {
    public static void main(String[] args) {


        String s = "";
        String s1 = "The ";
        String s2 = "String ";
        String s3 = "Concatenation ";
        String s4 = "works.";
        String s5 = "";
        for (int i = 20; i > 0; i--) {
            System.out.print(s + i);
        }
        System.out.println();

        System.out.println(s1 + s2 + s3 + s4);
        s5 = s5.concat(s1 + s2 + s3 + s4);
        System.out.println();
        System.out.println(s5);


        }



    }

