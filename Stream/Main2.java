import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        //create alist of integers
        List<Integer> arr=Arrays.asList(6,5,4,3,2,1);
        int num=arr.stream().filter(i->i%2==0).map(i->i*2).reduce(0,(i,j)->i+j);

        System.out.println(arr);
         List<Integer>list=arr.stream().sorted().collect(Collectors.toList());
        System.out.println(list);
System.out.println(num);
    }
    
}
