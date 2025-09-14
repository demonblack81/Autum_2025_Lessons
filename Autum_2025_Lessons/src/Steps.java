public class Steps {
    int id;
    String step;

    public Steps(int id, String step) {
        this.id = id;
        this.step = step;
    }

    public void printStep() {
        System.out.printf("Step with №: %d and text: %s\n", id, step);
    }
}
