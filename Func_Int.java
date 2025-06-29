
interface A {
    int add(int a,int b);

}

class Func_Int {
    public static void main(String[] args) {
        // A obj = new A() {
        //     public void methodA(int n) {
        //         System.out.println("Inside methodA"+n);

        //     }

        // };
        A obj = (i,j)->i+j;
        int res=obj.add(4,5);
        System.out.println(res);
        

    }
}