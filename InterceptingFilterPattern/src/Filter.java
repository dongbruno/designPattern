public interface Filter {
    //过滤器 - 在请求处理程序执行请求之前或之后执行某些任务的过滤器。
    public void execute(String request);
}