
public class Main {
    public static void main(String[] args) {

        if (args.length == 0){
            PrintUsage printusage = new PrintUsage();
            printusage.PrintUsage();
        } else if (args[0].equals("-l")){
            ListTasks myTasks = new ListTasks();
            myTasks.listTask();
        } else if (args[0].equals("-a")){
            ListTasks add = new ListTasks();
            add.addNew();
        }
        /*ha -r, akkor
                sout"add meg, hányadik elemet akarod törölni"
            remove(i)*/



    }
}
