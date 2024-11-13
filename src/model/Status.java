package model;

public enum Status {

    AGENDADA("Consulta Agendado"),
    CONCLUIDA("Consulta Concluida"),
    CANCELADA("Consulta Cancelada");

    private String status;

    Status(String status){
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
