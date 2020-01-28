public class Driver {
    public static void main(String[] args) {
        PsychiatristObject psy = new PsychiatristObject();
        HappyObject hpy = new HappyObject();
        SadObject sad = new SadObject();
        psy.examine(hpy);
        psy.observe(hpy);
        psy.examine(sad);
        psy.observe(sad);
    }
}
