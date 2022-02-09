public class LogMessageRunner {
    public static void main(String[] args)
    {
        LogMessage server1 = new LogMessage("SERVER1:disk");
        System.out.println(server1.containsWord("disk"));
        LogMessage server2 = new LogMessage("SERVER2:error on disk");
        System.out.println(server2.containsWord("disk"));
        LogMessage server3 = new LogMessage("SERVER3:error on /dev/disk disk");
        System.out.println(server3.containsWord("disk"));
        LogMessage server4 = new LogMessage("SERVER4:error on disk DSK1");
        System.out.println(server4.containsWord("disk"));

        System.out.println("---------------");

        LogMessage server5 = new LogMessage("SERVER5:DISK");
        System.out.println(server5.containsWord("disk"));
        LogMessage server6 = new LogMessage("SERVER6:error on disk3");
        System.out.println(server6.containsWord("disk"));
        LogMessage server7 = new LogMessage("SERVER7:error on /dev/disk");
        System.out.println(server7.containsWord("disk"));
        LogMessage server8 = new LogMessage("SERVER8:diskette");
        System.out.println(server8.containsWord("disk"));
    }
}
