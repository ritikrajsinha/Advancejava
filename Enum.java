enum Status{
    Running,Failed,Pending,Succuess;
}


public class Enum{
    public static void main(String[] args) {
        Status[] s=Status.values();
        for(Status str:s)
        {
            System.out.println(str.ordinal()+" "+str);
        }
    }


}