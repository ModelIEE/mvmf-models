package modeliee.mvmf.model.generation.view;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import modeliee.mvmf.model.generation.InterfaceTypeDefinition;

import java.util.LinkedList;
import java.util.List;

/**
 * ConceptViewDefinition.
 */
@JsonPropertyOrder({"name", "interfaceTypes"})
public class ConceptViewDefinition {

    @JsonProperty(value = "view")
    protected String name;

    @JsonProperty()
    protected List<InterfaceTypeDefinition> interfaceTypes;

    public ConceptViewDefinition() {
        interfaceTypes = new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<InterfaceTypeDefinition> getInterfaceTypes() {
        return interfaceTypes;
    }

    public void setInterfaceTypes(List<InterfaceTypeDefinition> interfaceTypes) {
        this.interfaceTypes = interfaceTypes;
    }
}
