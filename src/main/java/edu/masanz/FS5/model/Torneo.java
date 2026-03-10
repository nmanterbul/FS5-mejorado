package edu.masanz.FS5.model;

public class Torneo {

    private int id;
    private String torneoName;

    public Torneo(){

    }

    public Torneo(String torneoName) {
        this.torneoName = torneoName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTorneoName() {
        return torneoName;
    }

    public void setTorneoName(String torneoName) {
        this.torneoName = torneoName;
    }

    @Override
    public String toString() {
        return "Torneo{" +
                "id='" + id + '\'' +
                ", torneoName='" + torneoName + '\'' +
                '}';
    }
}
