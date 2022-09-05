package com.tcc.api.enums;

public enum AgendamentoStatus {

    AGUARDANDO(1),
    APROVADO(2),
    FINALIZADO(3);

    private int code;

    private AgendamentoStatus(int code){
        this.code = code;
    }

    public int getCode(){
        return code;
    }

    public static AgendamentoStatus valueOf(int code) {
        for (AgendamentoStatus value : AgendamentoStatus.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }


       throw  new IllegalArgumentException("Invalid AgendamentoStatus code");
    }

}
