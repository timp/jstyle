public class Main {

    static ExpensiveObject eo;
    static GlobalStyleObject gso;
    static FunctionalStyleObject fso;
    static DependencyInjectionStyle diso;

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        eo = new ExpensiveObject();
        start = report("new ExpensiveObject()", start);
        gso = new GlobalStyleObject();
        start = report("new GlobalStyleObject()", start);
        gso.getExpensiveObject();
        start = report("gso.getExpensiveObject();", start);

        fso = new FunctionalStyleObject();
        start = report("new FunctionalStyleObject()", start);
        fso.getExpensiveObject();
        start = report("fso.getExpensiveObject();", start);

        diso = new DependencyInjectionStyle(eo);
        start = report("new DependencyInjectionStyle()", start);
        diso.getExpensiveObject();
        start = report("diso.getExpensiveObject();", start);
    }
    static long report(String action, long start) {
        long now = System.currentTimeMillis();
        System.out.println(action + " took " + (now - start));
        return now;
    }
}
