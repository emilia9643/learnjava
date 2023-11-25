public class Variables2 {
    public static void main(String[] args) {
//        String - stores text, such as "Hello". String values are surrounded by double quotes
//        int - stores integers (whole numbers), without decimals, such as 123 or -123
//        float - stores floating point numbers, with decimals, such as 19.99 or -19.99
//        char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
//        boolean - stores values with two states: true or false
        String name = "Emilia";
        int age = 17;
        age = 18; //change is available
        final int height = 190;
        // height=191 -->> ERROR
        float account = 650.12f;
        char initial = 'E';
        boolean underage=true;

        System.out.println("Hello "+name);
        float aaa=1.000001f;
        System.out.println(aaa);

        char charA=65;
        System.out.println(charA);

    }
}
