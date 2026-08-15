public class StringBuilderTest {
    public static void main(String[] args) {
        String a="a";
        int count=10000;
        long start1=System.currentTimeMillis();
        String b="b";
        for(int i=0;i<count;i++){
            b=b+a;
        }
        long end1=System.currentTimeMillis();
        System.out.println(end1-start1);


        long start2=System.currentTimeMillis();
        StringBuilder s=new StringBuilder();
        for(int i=0;i<count;i++){
            s.append(a);
        }
        String result=s.toString();
        long end2=System.currentTimeMillis();
        System.out.println(end2-start2);

    }
}
