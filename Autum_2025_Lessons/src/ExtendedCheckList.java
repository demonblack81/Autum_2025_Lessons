public class ExtendedCheckList extends CheckList {
    Levels level;
    TestStatus status;

    public ExtendedCheckList(int id, String name, String description, Levels level, TestStatus status) {
        super(id, name, description);
        this.level = level;
        this.status = status;
    }
}
