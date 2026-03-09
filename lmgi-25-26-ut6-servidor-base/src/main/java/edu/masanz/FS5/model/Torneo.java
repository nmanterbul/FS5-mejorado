package edu.masanz.FS5.model;

public class Torneo {

    private String id;
    private String torneoName;

    public Torneo(){

    }

    public Torneo(String id, String torneoName) {
        this.id = id;
        this.torneoName = torneoName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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