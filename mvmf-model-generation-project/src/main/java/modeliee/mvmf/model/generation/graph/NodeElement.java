package modeliee.mvmf.model.generation.graph;

import java.util.ArrayList;
import java.util.List;

/**
 * NodeElement.
 */
public class NodeElement {

    private String id;
    private List<NodeView> views;

    public NodeElement() {
        views = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<NodeView> getViews() {
        return views;
    }

    public void setViews(List<NodeView> views) {
        this.views = views;
    }

    public void addView(NodeView view) {
        this.views.add(view);
    }
}
