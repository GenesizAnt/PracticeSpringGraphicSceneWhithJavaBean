package org.exampleclass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class GraphicSceneBuilder {

    @Bean
    public Coordinates coordinatesDotOne() {
        return new Coordinates(10, 15);
    }

    @Bean
    public Coordinates coordinatesDotTwo() {
        return new Coordinates(7, 11);
    }

    @Bean
    public Coordinates coordinatesCircleOne() {
        return new Coordinates(17, 21);
    }

    @Bean
    public Coordinates coordinatesCircleTwo() {
        return new Coordinates(6, 14);
    }


    @Bean
    public Dot dotOne() {
        return new Dot("red", coordinatesDotOne());
    }

    @Bean
    public Dot dotTwo() {
        return new Dot("green", coordinatesDotOne());
    }

    @Bean
    public Circle circleOne() {
        return new Circle("blue", coordinatesDotOne(), 4);
    }

    @Bean
    public Circle circleTwo() {
        return new Circle("green", coordinatesDotOne(), 6);
    }

    @Bean
    @Scope("prototype")
    public GraphicScene graphicScene() {
        GraphicScene graphicScene = new GraphicScene();

        List<ObjectGraph> list = new ArrayList<>();
        list.add(dotOne());
        list.add(dotTwo());
        list.add(circleOne());
        list.add(circleTwo());

        graphicScene.setObjectGraphs(list);

        return graphicScene;
    }
}
