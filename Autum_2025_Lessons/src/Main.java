public class Main {
    public static void main(String[] args) {
        int id = 1;
        String name = "Add Class";
        String description = "Example how to create Class";
        CheckList checkList = new CheckList(id, name, description);
        checkList.addRunStep("Add new file in project");
        checkList.addExteptedStep("File add in project");

        System.out.printf("I make class CheckList. \n with id: %d\n name: %s\n description: %s \n",
                checkList.id, checkList.name, checkList.description);
        if (checkList.curentRunStep > 0) {
            System.out.println("CheckList have Run Steps:");
            for (int i = 0; i < checkList.runSteps.size(); i++) {
                checkList.runSteps.get(i).printStep();
            }
        }
        if (checkList.curentExteptedStep > 0) {
            System.out.println("CheckList have Extepted Steps:");
            for (int i = 0; i < checkList.exteptedSteps.size(); i++) {
                checkList.exteptedSteps.get(i).printStep();
            }
        }
    }
}