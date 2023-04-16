package edu.fatec.lp2.exercicio1;

public class MensagemTexto extends Mensagens {

    private Contatinho[] contatos;
    private Mensagens[] mensagens;

    public MensagemTexto(Contatinho destinatario, String conteudo, String horaEnvio, int tamanhoContatos, int tamanhoMensagens) {
        super(destinatario, conteudo, horaEnvio);
        this.contatos = new Contatinho[tamanhoContatos];
        this.mensagens = new Mensagens[tamanhoMensagens];
    }

    @Override
    public Mensagens[] sendMessage(String mensagens) {
        return mensagens;
    }
}

