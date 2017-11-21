public class BusinessLookUp {

    //查找服务对象负责获得相关业务的实施和提供业务的委托对象业务对象的访问。
    public BusinessService getBusinessService(String serviceType){

        if(serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        }
        else {
            return new JMSService();
        }
    }
}