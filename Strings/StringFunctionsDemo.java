public class StringFunctionsDemo {
    public static void main(String[] args) {

        String str1 = "Dipanshu";
        String str2 = new String("Dipanshu");

        if (str1.equals(str2))
            System.out.println("Equal");

        System.out.println(str1.substring(0, 3));
    }
}
