/**
 * @author Tim Pizey
 * @since 2019-02-06
 */
public class ExpensiveObject {
    public ExpensiveObject() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
