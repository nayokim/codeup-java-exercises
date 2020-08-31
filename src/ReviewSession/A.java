package ReviewSession;

public class A {
    public String n;

    public A (String name){
        this.n = name;
    }

    public static void main(String[] args) {
        A a = new A("Jerry");
        A r = new A("Roshan");
        A m = new A("Matt");
        m=a;
        r = m;
//        d.n = "anitoly"; //change the name to what it is pointing to


        System.out.println(a.n);
        System.out.println(r.n);
        System.out.println(m.n);
//        System.out.println(r.n);

        //garbage collection  -looks for orphan objects
        //data structure
        //linked list








    }
}
