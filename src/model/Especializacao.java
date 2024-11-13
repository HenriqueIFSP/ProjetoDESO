package model;

public enum Especializacao {
    CLINICA_GERAL("Clinico Geral"),
    ORTOPEDIA("Ortopedista"),
    PEDIATRIA("Pediatra"),
    CARDIOLOGIA("Cardiologista"),
    DERMATOLOGIA("Dermatologista"),
    PSIQUIATRIA("Psiquiatra"),
    NEUROLOGIA("Neurologista"),
    NEFROLOGIA("Nefrologista");

    private String especializacao;

    Especializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public String getEspecializacao() {
        return especializacao;
    }
}
