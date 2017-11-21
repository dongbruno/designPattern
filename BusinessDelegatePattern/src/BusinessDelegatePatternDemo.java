public class BusinessDelegatePatternDemo {

    public static void main(String[] args) {

        //为客户端实体提供对业务服务方法的访问的单个入口点类。
        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        //客户端（Client） - 表示层代码可以是JSP，servlet或UI java代码。
        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}