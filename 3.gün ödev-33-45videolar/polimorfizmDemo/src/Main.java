public class Main {
    public static void main(String[] args)
    {
//        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
//        int[] sayilar = new int[] {1,2,3};
//
//        for (BaseLogger logger: loggers
//             ) {
//            logger.Log("Log mesajı");
//        }

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();

    }
}