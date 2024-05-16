package lab_03;
import java.util.ArrayList;
import java.util.List;

class UserStory extends Ticket {
	private List<UserStory> dependencies;

    public UserStory(int id, String name, int estimate, List<UserStory> dependencies) {
        super(id, name, estimate);
        this.dependencies = dependencies;
    }

    public List<UserStory> getDependencies() {
        return new ArrayList<>(dependencies);
    }

    @Override
    public void complete() {
        boolean allDependenciesCompleted = dependencies.stream().allMatch(UserStory::isCompleted);
        if (allDependenciesCompleted) {
            super.complete();
        }
    }

    @Override
    public String toString() {
        return "[US " + getId() + "] " + getName();
    }
}