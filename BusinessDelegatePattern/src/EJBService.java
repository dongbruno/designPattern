public class EJBService implements BusinessService {

    //业务服务接口。 具体类实现这个业务服务以提供实际的业务实现逻辑。
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}