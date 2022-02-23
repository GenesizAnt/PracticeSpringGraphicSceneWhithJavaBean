package org.example;


import org.exampleclass.GraphicScene;
import org.exampleclass.GraphicSceneBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GraphicSceneBuilder.class);

        GraphicScene graphicScene = context.getBean(GraphicScene.class);

        graphicScene.drawScene();
    }
}
