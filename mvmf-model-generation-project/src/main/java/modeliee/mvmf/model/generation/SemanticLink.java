package modeliee.mvmf.model.generation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Semantic.
 */
@JsonPropertyOrder({"type", "mimeType", "fileSemantic", "reference"})
public class SemanticLink {

    @JsonProperty(value = "relation")
    protected String type;

    @JsonProperty()
    protected String reference;

    @JsonProperty()
    protected String mimeType;

    @JsonProperty()
    protected String fileSemantic;

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

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getFileSemantic() {
        return fileSemantic;
    }

    public void setFileSemantic(String fileSemantic) {
        this.fileSemantic = fileSemantic;
    }
}
