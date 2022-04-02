package modeliee.mvmf.model.generation.graph;

/**
 * Node Link.
 */
public class NodeLink {

    private LinkType linkType;
    private String leftElementId;
    private String rightElementId;

    public NodeLink() {
    }

    public NodeLink(LinkType type, String leftElementId, String rightElementId) {
        this.linkType = type;
        this.leftElementId = leftElementId;
        this.rightElementId = rightElementId;
    }

    public LinkType getLinkType() {
        return linkType;
    }

    public void setLinkType(LinkType linkType) {
        this.linkType = linkType;
    }

    public String getLeftElementId() {
        return leftElementId;
    }

    public void setLeftElementId(String leftElementId) {
        this.leftElementId = leftElementId;
    }

    public String getRightElementId() {
        return rightElementId;
    }

    public void setRightElementId(String rightElementId) {
        this.rightElementId = rightElementId;
    }
}
