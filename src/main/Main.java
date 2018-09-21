
package main;

import models.ModelBloc;
import views.ViewBloc;
import controllers.ControllerBloc;


public class Main {
    private static ViewBloc viewBloc;
    private static ModelBloc modelBloc;
    private static ControllerBloc controllerBloc;
   
    public static void main(String[] args) {
        ModelBloc modelBloc = new ModelBloc();
        ViewBloc viewBloc = new ViewBloc();
        ControllerBloc controllerBloc = new ControllerBloc(modelBloc, viewBloc);
    }  
}