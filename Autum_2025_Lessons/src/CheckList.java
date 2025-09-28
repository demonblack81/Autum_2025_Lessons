import java.util.ArrayList;

public class CheckList {
    int id;
    String name;
    String description;
    int curentRunStep;
    int curentExteptedStep;
    ArrayList<Steps> runSteps = new ArrayList();
    ArrayList<Steps> exteptedSteps = new ArrayList();

    public CheckList (int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
        curentRunStep = 0;
        curentExteptedStep = 0;
    }

    public void addRunStep(String step) {
        curentRunStep++;
        Steps newRunStep = new Steps(curentRunStep, step);
        runSteps.add(newRunStep);
    }

    public void addExteptedStep(String step) {
        curentExteptedStep++;
        Steps newExteptedStep = new Steps(curentExteptedStep, step);
        exteptedSteps.add(newExteptedStep);
    }

    public void removeRunStep() {
        if (curentRunStep > 0) {
            runSteps.remove(curentRunStep);
            curentRunStep--;
        }
    }

    public void removeExteptedStep() {
        if (curentExteptedStep > 0 ) {
            exteptedSteps.remove(curentExteptedStep);
            curentRunStep--;
        }
    }
}
