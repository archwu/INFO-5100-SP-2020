public class SadObject extends MoodyObject {
    public SadObject() {
        super.mood = "sad";
    }

    @Override
    protected String getMood() {
        return this.mood;
    }

    @Override
    protected void expressFeelings() {
        System.out.println("'wah' 'boo hoo' 'weep' 'sob' 'weep'");
    }

    public String toString() {
        return new String("Subject cries a lot");
    }
}
