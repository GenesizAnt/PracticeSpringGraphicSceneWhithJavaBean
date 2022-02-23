package org.exampleclass;

import java.util.List;

public class GraphicScene {

    private List<ObjectGraph> objectGraphs;

    public GraphicScene() {

    }

    public List<ObjectGraph> getObjectGraphs() {
        return objectGraphs;
    }

    public void setObjectGraphs(List<ObjectGraph> objectGraphs) {
        this.objectGraphs = objectGraphs;
    }

    public void drawScene() {
        for (ObjectGraph objectGraph : objectGraphs) {
            objectGraph.draw();
        }
    }
}
