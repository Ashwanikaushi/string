public class Main{
    public static void stringBuilder(){
        // creation 
        StringBuilder sb = new StringBuilder("123");
        // print
        System.out.println("data :" +sb);
        sb.append("hello");
         System.out.println(sb);
         System.out.println(sb.toString());
         System.out.println(sb.length());
         System.out.println(sb.reverse);
         for(int i =0; i< sb.length; i++){
            System.out.println(sb.charAt(i));
         }

         sb.deleteCharAt(2);
        System.out.println(sb);
        sb.insert(0, "world");
         System.out.println(sb);

         sb.setCharAt(0, 'z');
          System.out.println(sb);

    }
}