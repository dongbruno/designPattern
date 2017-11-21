public class FilterManager {
    FilterChain filterChain;

    //过滤器管理器 - 过滤器管理器管理过滤器和过滤器链。
    public FilterManager(Target target){
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }
    public void setFilter(Filter filter){
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request){
        filterChain.execute(request);
    }
}