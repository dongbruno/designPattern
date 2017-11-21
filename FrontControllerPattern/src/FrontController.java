public class FrontController {

    private Dispatcher dispatcher;
    //前端控制器 - 用于处理应用程序（基于Web或基于桌面）的各种请求的单个处理程序。
    public FrontController(){
        dispatcher = new Dispatcher();
    }

    private boolean isAuthenticUser(){
        System.out.println("User is authenticated successfully.");
        return true;
    }

    private void trackRequest(String request){
        System.out.println("Page requested: " + request);
    }

    public void dispatchRequest(String request){
        //log each request
        trackRequest(request);

        //authenticate the user
        if(isAuthenticUser()){
            dispatcher.dispatch(request);
        }
    }
}