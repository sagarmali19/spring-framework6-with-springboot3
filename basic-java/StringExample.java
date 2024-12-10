public class StringExample {
    public static void main(String[] args) {
        String name = new String("Sagar");
        System.out.println(name);
        System.out.println(name.hashCode());
        System.out.println("Hello " + name);
        System.out.println(name.charAt(0));

        StringBuffer sb = new StringBuffer("Samruddhi");
        sb.append(" Mali");
        System.out.println(sb);

        // converting stringbuffer into string
        String str = sb.toString();
        System.out.println(str);
    }

}
