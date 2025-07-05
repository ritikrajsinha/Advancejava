import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main{
    public static void main(String[] args)  {    
        List<Integer>arr=Arrays.asList(1,2,3,4,5,6);
        //create a String array simple
        int[] strArray = {1,2,3,4,5,6,7,8};
        System.out.println(arr);

        List<Integer>arr1=new ArrayList<>(arr);

        boolean yes=arr1.equals(arr1);
        System.out.println(yes);
        System.out.println(arr1);


        Stream<Integer>s1=Arrays.stream(strArray).boxed();
        List<Integer>list=s1.filter(i->i>2).collect(Collectors.toList());
        System.out.println(list);
        
        

    }
}