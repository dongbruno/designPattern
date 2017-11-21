public class Dispatcher {
    private StudentView studentView;
    private HomeView homeView;
    //分发器 - 前端控制器可以使用可以将请求分派到相应的特定处理器的分派器对象。
    public Dispatcher(){
        studentView = new StudentView();
        homeView = new HomeView();
    }

    public void dispatch(String request){
        if(request.equalsIgnoreCase("STUDENT")){
            studentView.show();
        }
        else{
            homeView.show();
        }
    }
}