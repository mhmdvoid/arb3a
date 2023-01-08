package Core;

public class Project {

    public enum ProjectType {
        Fifty_, Sera_, Hundred_;
    }
    public enum ProjectResult {
        Qeed(false), Correct(true), Unknown(false);
        final private boolean Indicator;

        ProjectResult(boolean I) {
            Indicator = I;
        }

        public boolean GetIndicator() {
            return Indicator;
        }
    }
    ProjectType Type;

    public Project(ProjectType T) {
        Type = T;
    }

    // public boolean issueProjects(List<ProjectType> Projects, CardSet PlayerCard) {
    //     for (var i = 0; i < Projects.length; i++) {
    //         if (!issueProject(Projects[i], PlayerCard)) {
    //             break; // failed
    //         }
    //     }

    // }
    // private boolean issueProject(ProjectType PT, CardSet PlayerCard) {
    //     var valid = ProjectValidator.validate(PT, PlayerCard);
    //     if (valid) {
    //         System.out.println("Ignore. Your card set doesn't have " + PT + " project");
    //         return false; // Couldn't 
    //     }

    //     return true;

    // }
}