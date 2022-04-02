package modeliee.mvmf.model.generation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InterfaceTypeDefinition.
 */
public class InterfaceTypeDefinition {

    @JsonProperty(value = "interface")
    protected String name;

    @JsonProperty
    protected String derivedFrom;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDerivedFrom() {
        return derivedFrom;
    }

    public void setDerivedFrom(String derivedFrom) {
        this.derivedFrom = derivedFrom;
    }
}
