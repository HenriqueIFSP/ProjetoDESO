package model;

public enum Gravidade {
    BAIXA("Gravidade baixa"),
    MEDIA("Gravidade media"),
    ALTA("Gravidade alta"),
    CRITICA("Gravidade critica");

    private String gravidade;

    Gravidade(String gravidade){
        this.gravidade = gravidade;
    }

    public String getGravidade() {
        return gravidade;
    }
}
