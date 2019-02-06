/**
 * @author Tim Pizey
 * @since 2019-02-06
 */
public class DependencyInjectionStyle {
    private final ExpensiveObject expensiveObject;

    public DependencyInjectionStyle(ExpensiveObject expensiveObject) {
        this.expensiveObject = expensiveObject;
    }


    public ExpensiveObject getExpensiveObject() {
        return expensiveObject;
    }
}
