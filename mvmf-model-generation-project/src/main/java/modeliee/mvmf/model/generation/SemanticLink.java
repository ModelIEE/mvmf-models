package modeliee.mvmf.model.generation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Semantic.
 */
@JsonPropertyOrder({"type", "Semantic", "reference"})
public class SemanticLink {

    @JsonProperty(value = "relation")
    protected String type;

    @JsonProperty()
    protected String reference;

    @JsonProperty()
    protected String semantic;

    public SemanticLink() {
    }

    public String getType() {
        return type;
    }

    public void setType(String file) {
        this.type = file;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getSemantic() {
        return semantic;
    }

    public void setSemantic(String semantic) {
        this.semantic = semantic;
    }
}
