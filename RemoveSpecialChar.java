public class RemoveSpecialChar {
        public static void main(String[] args) {
            String a = "Learn @coding!";
            String b = a.replaceAll("[^a-zA-Z0-9]", "");
            System.out.println(b);
        }
    }