//上下文/初始上下文 - JNDI上下文携带对用于查找目的的服务的引用。
public class InitialContext {
    public Object lookup(String jndiName){

        if(jndiName.equalsIgnoreCase("SERVICE1")){
            System.out.println("Looking up and creating a new Service1 object");
            return new Service1();
        }
        else if (jndiName.equalsIgnoreCase("SERVICE2")){
            System.out.println("Looking up and creating a new Service2 object");
            return new Service2();
        }
        return null;
    }
}