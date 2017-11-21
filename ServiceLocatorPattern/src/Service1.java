//服务 - 将处理请求的实际服务。 将在JNDI服务器中查找此类服务的引用。
public class Service1 implements Service {
    public void execute(){
        System.out.println("Executing Service1");
    }

    @Override
    public String getName() {
        return "Service1";
    }
}