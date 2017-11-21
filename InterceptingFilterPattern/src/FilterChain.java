import java.util.ArrayList;
import java.util.List;
//过滤器链 - 过滤器链携带多个过滤器，并帮助在目标上以定义的顺序执行它们。
public class FilterChain {
    private List<Filter> filters = new ArrayList<Filter>();
    private Target target;

    public void addFilter(Filter filter){
        filters.add(filter);
    }

    public void execute(String request){
        for (Filter filter : filters) {
            filter.execute(request);
        }
        target.execute(request);
    }

    public void setTarget(Target target){
        this.target = target;
    }
}