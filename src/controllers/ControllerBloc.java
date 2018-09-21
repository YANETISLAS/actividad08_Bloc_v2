
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import models.ModelBloc;
import views.ViewBloc;

public class ControllerBloc implements ActionListener{
  ModelBloc modelBloc;
  ViewBloc viewBloc;
  
  public ControllerBloc(ModelBloc modelBloc, ViewBloc viewBloc) {
        this.modelBloc = modelBloc;
        this.viewBloc = viewBloc;
        this.viewBloc.jmi_leer.addActionListener(this);
        this.viewBloc.jmi_guardar.addActionListener(this);
        initComponets();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == viewBloc.jmi_leer){
            jmi_leer_action_performed();
        }
       if(e.getSource() == viewBloc.jmi_guardar){
            jmi_guardar_action_performed();
        }
    }
    private void jmi_leer_action_performed() {
       modelBloc.setTexto(String.valueOf(viewBloc.jta_bloc.getText()));
       modelBloc.readFile();
    } 
    private void jmi_guardar_action_performed() {
       modelBloc.setTexto(String.valueOf(viewBloc.jta_bloc.getText()));
       modelBloc.writeFile();
      
    }
    private void initComponets() {
        viewBloc.setVisible(true);
        viewBloc.jta_bloc.setText(String.valueOf(modelBloc.getTexto()));          
    }
    
}