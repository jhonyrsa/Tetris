package tetris;

import javax.swing.JFrame;

public class JanelaJogo {
    //criação de variáveis do jogo;
    public static final int LARGURA = 480, ALTURA = 720;
    private JFrame janela;

    //Método construtor da classe JanelaJogo
    public JanelaJogo(){
        //instancia um objeto do tipo JFrame com título de Tetris
        janela = new JFrame("Tetris");
        //Configura o tamanho da janela
        janela.setSize(LARGURA,ALTURA);
        //Define a operação padrão de fechar a janela
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Impede que o usuário redimensione a janela
        janela.setResizable(false);
        //Altera a configuraçao do objeto janela para visível
        janela.setVisible(true);
    }
    
    public static void main(String[] args) {
        new JanelaJogo();
    }
}
