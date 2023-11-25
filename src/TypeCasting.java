public class TypeCasting {
    public static void main(String[] args) {
        int myInt = 9;
        float myFloat=myInt;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myFloat);
        System.out.println(myDouble);   // Outputs 9.0

        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble2; // Manual casting: double to int
        byte myByte2=(byte) myDouble2;
        System.out.println(myDouble2);   // Outputs 9.78
        System.out.println(myInt2);      // Outputs 9
        System.out.println(myByte2);

    }
}
