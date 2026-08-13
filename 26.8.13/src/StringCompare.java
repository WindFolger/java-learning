public class StringCompare {
    public static void main(String[] args) {
        String a="abc";
        String b="abc";
        String c=new String("abc");
        if(a==b){
            System.out.println("a==b");
        }
        if(a==c){
            System.out.println("a==c");
        }else {
            System.out.println("a!=c");
        }
        if(a.equals(b)){
            System.out.println("a==b");
        }else System.out.println("a!=b");
        if(a.equals(c)){
            System.out.println("a==c");
        }else System.out.println("a!=c");
    }
}
