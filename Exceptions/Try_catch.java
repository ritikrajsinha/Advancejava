

public class Try_catch {
    public static void main(String[] args) {
        int i = 2;
        int[] arr = new int[5];
        String str=null;

        int j = 0;

        try {
            j = 18 / i;
            System.out.println(str.charAt(2));
            System.out.println(arr[5]); // ❗ Division by zero
        } catch (ArithmeticException e) {
            System.out.println("Exception caught" + e);
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println("Index out of bounds exception caught" + e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println(j); // ➡ Still prints 0 (initial value)
        System.out.println("bye"); // ➡ Always prints

    }
}
