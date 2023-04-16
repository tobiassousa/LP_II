package edu.fatec.lp2.exercicio1;

import edu.fatec.lp2.exercicio1.Contatinho;
import edu.fatec.lp2.exercicio1.Mensagens;

public class MensagemAudio extends Mensagens {

    private Contatinho[] contatos;
    private Mensagens[] mensagens;
    private byte[] arquivoAudio;

    public MensagemAudio(Contatinho destinatario, String horaEnvio,  byte[] arquivoAudio, int tamanhoContatos, int tamanhoMensagens) {
        super(destinatario, "", horaEnvio);
        this.contatos = new Contatinho[tamanhoContatos];
        this.mensagens = new Mensagens[tamanhoMensagens];
        this.arquivoAudio = arquivoAudio;
    }

    @Override
    public Mensagens[] sendMessage(String mensagem) {
        return mensagens;
    }
}