package com.toDoList.demo.models.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //SINALIZANDO QUE SERÁ NO ENTIDADE BD
public class Item {

    @Id //SINALIZANDO QUE SERÁ NO ID NO BD
    @GeneratedValue(strategy = GenerationType.IDENTITY) //GERANDO AUTOMATICAMENTE ID's

    private int id;
    private String materia;
    private String tarefa;
    private String dtEntrega;
    private boolean status;

//    GETTERS / SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getTarefa() {
        return tarefa;
    }

    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    public String getDtEntrega() {
        return dtEntrega;
    }

    public void setDtEntrega(String  dtEntrega) {
        this.dtEntrega = dtEntrega;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
