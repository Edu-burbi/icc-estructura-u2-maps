package controllers;

import java.util.HashMap;
import java.util.Map;

import models.Empleado;

public class EmpleadoContoller {


    private Map<Integer , Empleado> empleados;

    public EmpleadoContoller() {
        empleados = new HashMap<>();
    }

/*
    // return falso si no ingreso porque ya existe
    public boolean addEmpleado(Empleado empleado){

        if(empleados.containsKey(empleado.getId())){
            return false;
        }

        empleados.put(empleado.getId(), empleado);
        return true;
    }
*/
       
     //negando 

     public boolean addEmpleado(Empleado empleado){

        if(!empleados.containsKey(empleado.getId()))
        {
            empleados.put(empleado.getId(), empleado);

            return true;
        }

        return false;
    }
     

    public Empleado getEmpleadoById(int id){
        return empleados.get(id);
    }

    public void displayEmpleados(){
        System.out.println("\n------Empleados------");
        for (Map.Entry<Integer, Empleado> empleadoEntry : empleados.entrySet()) {
            System.out.println(empleadoEntry.getKey() + " - " + empleadoEntry.getValue());
        }
    }

    public void displayEmpleadosSoloNombres(){
        System.out.println("\n------Solo Nombres------");
        for (Map.Entry<Integer, Empleado> empleadoEntry : empleados.entrySet()) {
            System.out.println(empleadoEntry.getValue().getName());
        }
    }

    public void displayLlaves(){
        System.out.println("\n------Llaves------");
        for (Integer empleadoEntry : empleados.keySet()) {
            System.out.println(empleadoEntry);
        }
    }

    public void displayEmpleadosValues(){
        System.out.println("\n------Empleados Values------");
        for (Empleado empleadoEntry : empleados.values()) {
            System.out.println(empleadoEntry);   
        }
    }
}