package modeliee.mvmf.model.generation.concept;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import modeliee.mvmf.model.generation.view.ViewDefinition;

import java.util.ArrayList;
import java.util.List;

/**
 * ConceptDefinition.
 */
@JsonPropertyOrder({"name", "views"})
public class ConceptDefinition {

    @JsonProperty(value = "concept")
    protected String name;

    @JsonProperty
    protected List<ViewDefinition> views;

    public ConceptDefinition() {
        this.views = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ViewDefinition> getViews() {
        return views;
    }

    public void setViews(List<ViewDefinition> views) {
        this.views = views;
    }
}
