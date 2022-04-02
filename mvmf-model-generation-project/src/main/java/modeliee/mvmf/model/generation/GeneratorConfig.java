package modeliee.mvmf.model.generation;

import com.fasterxml.jackson.annotation.JsonProperty;
import modeliee.mvmf.model.generation.concept.ConceptDefinition;
import modeliee.mvmf.model.generation.graph.Graph;
import modeliee.mvmf.model.generation.view.ConceptViewDefinition;

import java.util.List;

/**
 * Object model for a project configuration file.
 */
public class GeneratorConfig {

    @JsonProperty
    protected ProjectDefinition projectDefinition;

    @JsonProperty
    protected List<ConceptViewDefinition> viewDefinitions;

    @JsonProperty
    protected List<ConceptDefinition> conceptMappings;

    @JsonProperty
    private Graph initGraph;

    public List<ConceptViewDefinition> getViewDefinitions() {
        return viewDefinitions;
    }

    public void setViewDefinitions(List<ConceptViewDefinition> viewDefinitions) {
        this.viewDefinitions = viewDefinitions;
    }

    public List<ConceptDefinition> getConceptMappings() {
        return conceptMappings;
    }

    public void setConceptMappings(List<ConceptDefinition> conceptMappings) {
        this.conceptMappings = conceptMappings;
    }

    public ProjectDefinition getProjectDefinition() {
        return projectDefinition;
    }

    public void setProjectDefinition(ProjectDefinition projectDefinition) {
        this.projectDefinition = projectDefinition;
    }

    public Graph getInitGraph() {
        return initGraph;
    }

    public void setInitGraph(Graph initGraph) {
        this.initGraph = initGraph;
    }
}
