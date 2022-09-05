public class Main{
    public static void arrayListIntro(){
        ArrayList<Integer> list = new ArrayList<>();// to create
        System.out.println(list);

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list+" "+list.size());

        for(int i =0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}