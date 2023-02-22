
public class stringBuildr {
    public static void main(String args[]){
        StringBuilder s1 = new StringBuilder();
        s1.append("Raihan Ahmed");
        System.out.println(s1);
        s1.insert(7,"java ");
        System.out.println(s1);
        s1.replace(7, 12, "123 ");
        System.out.println(s1);
        s1.delete(7, 11);
        System.out.println(s1);
        s1.reverse();
        System.out.println(s1);
        System.out.println(s1.capacity());

    }
    
}
