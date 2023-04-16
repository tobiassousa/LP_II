package edu.fatec.lp2.exercicio1;

public abstract class Mensagens {
    private Contatinho destinatario;
    private String conteudo;
    private String horaEnvio;

    public Mensagens(Contatinho destinatario, String conteudo, String horaEnvio) {
        this.destinatario = destinatario;
        this.conteudo = conteudo;
        this.horaEnvio = horaEnvio;
    }

    public abstract Mensagens[] sendMessage(String mensagens);


    public Contatinho getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Contatinho destinatario) {
        this.destinatario = destinatario;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public  String getHoraEnvio(){
        return horaEnvio;
    }

    public void  setHoraEnvio(String horaEnvio){
        this.horaEnvio = horaEnvio;
    }
}

