/**
 * @author Tim Pizey
 * @since 2019-02-06
 */
public class FunctionalStyleObject {
    private ExpensiveObject expensiveObject;

    public ExpensiveObject getExpensiveObject() {
        if (expensiveObject == null) {
            expensiveObject = new ExpensiveObject();
        }
        return expensiveObject;
    }

}
