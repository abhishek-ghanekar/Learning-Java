public class variables {
    public static void main(String[] args) {
        int a = 3;
        double weight = 6.9;
        char myChar = 'j';
        String name = "Abhishek";
        int len = name.length();
        System.out.println(len);
        System.out.println(a * weight);
        System.out.println(myChar);
        String temp = burp(name);
        System.out.println(temp);
    }
    private static String burp(String name) {
        if(name.equals("abhishek")) {
           return "you are so cool";
        }
        System.out.println("burp");
        System.out.println("my name is " + name);
        return "burp";
    }
}
