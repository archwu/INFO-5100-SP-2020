public class HappyObject extends MoodyObject {
    public HappyObject() {
        super.mood = "happy";
    }

    @Override
    protected String getMood() {
        return this.mood;
    }

    @Override
    protected void expressFeelings() {
        System.out.println("hehehe...hahahah...HAHAHAHA!!!");
    }

    public String toString() {
        return new String("Subject laughs a lot");
    }
}
