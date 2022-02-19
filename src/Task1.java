public class Task1 {

    public static void main(String[] args) {

        displayWordUsingDecimalFormat();
        displayWordUsingHexFormat();

    }

    private static void displayWordUsingDecimalFormat() {
        char s = 83;
        char d = 68;
        char a = 65;


    }

    public static void displayWordUsingHexFormat(){
        // 53 44 41

        char s = 0x53;
        char d = 0x44;
        char a = 0x41;

        System.out.print(s);
        System.out.print(d);
        System.out.print(a);
    }

    public static void displayWordUsingBinaryFormat (){
        // 0101 0011
        // 0100 0100
        // 0100 001

        char s = 0b0101011;
        char d = 0b01000100;
        char a = 0b0100001;

        System.out.print(s);
        System.out.print(d);
        System.out.print(a);

    }

}
