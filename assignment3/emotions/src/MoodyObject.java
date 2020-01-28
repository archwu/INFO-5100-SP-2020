abstract class MoodyObject {
    String mood;

    public void queryMood() {
        System.out.println("I feel " + mood + " today!");
    }

    protected abstract String getMood();


    protected abstract void expressFeelings();
}
