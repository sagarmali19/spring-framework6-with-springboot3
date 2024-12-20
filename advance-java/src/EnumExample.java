enum Status{
    Running, Failed, Pending, Success;
}

public class EnumExample {
    public static void main(String[] args) {
        Status s = Status.Success;
        System.out.println(s);

        // accessing all enums
        Status[] ss = Status.values();
        System.out.println(ss[0]);
        System.out.println(ss[1].ordinal());

        // if else statement
        if(s == Status.Running){
            System.out.println("All Good");
        } else if (s == Status.Pending) {
            System.out.println("Please Wait");
        }
        else{
            System.out.println("Another status");
        }

        // switch statement example
        switch (s)
        {
            case Failed :
                System.out.println("Failed status");
                break;
            case Running:
                System.out.println("All Good");
                break;
            case Pending:
                System.out.println("Need to wait");
                break;
            default:
                System.out.println("Done");
                break;
        }
    }
}
