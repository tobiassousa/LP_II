package edu.fatec.lp2.exercicio1;

public class MensagemFoto extends Mensagens {

    private Contatinho[] contatos;
    private Mensagens[] mensagens;
    private byte[] arquivoFoto;

    public MensagemFoto(Contatinho destinatario, String horaEnvio, byte[] arquivoFoto, int tamanhoContatos, int tamanhoMensagens) {
        super(destinatario, "", horaEnvio);
        this.contatos = new Contatinho[tamanhoContatos];
        this.mensagens = new Mensagens[tamanhoMensagens];
        this.arquivoFoto = arquivoFoto;
    }

    @Override
    public Mensagens[] sendMessage(String mensagem) {
        return mensagens;
    }
}