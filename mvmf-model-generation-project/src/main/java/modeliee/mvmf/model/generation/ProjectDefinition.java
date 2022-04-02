package modeliee.mvmf.model.generation;

import com.fasterxml.jackson.annotation.JsonProperty;
import modeliee.mvmf.model.generation.view.ViewAttribute;

import java.util.ArrayList;
import java.util.List;

/**
 * ProjectDefinition.
 */
public class ProjectDefinition {

    @JsonProperty
    protected String projectName;

    @JsonProperty
    protected String projectID;

    @JsonProperty
    protected List<ViewAttribute> attributes;

    public ProjectDefinition() {
        this.projectName = "";
        this.projectID = "";
        this.attributes = new ArrayList<>();
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public List<ViewAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<ViewAttribute> attributes) {
        this.attributes = attributes;
    }
}
