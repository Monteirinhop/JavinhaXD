/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author gustavo
 */

public class Formulario extends JPanel {

    JLabel nomeLabel;
    JLabel enderecoLabel;
    JLabel cidadeLabel;
    JLabel estadoLabel;
    JLabel dataLabel;
    
    JTextField nomeText;
    JTextField enderecoText;
    JSpinner estadoSpinner;
    JTextField cidadeText;
    JFormattedTextField dataText;
    JButton enviarButton ;
    
    private static void createandshowGUI(){
    JFrame janela = new JFrame ("Formulário Simplão");
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Formulario painelForm = new Formulario();
    painelForm.setOpaque(true);
    janela.setContentPane(painelForm);
    janela.pack();
    janela.setVisible(true);
    }
    
    public Formulario(){
    super(new BorderLayout());
    
    nomeLabel = new JLabel();
    nomeLabel.setText("Nome");
    enderecoLabel = new JLabel();
    enderecoLabel.setText("Endereço");
    cidadeLabel = new JLabel();
    cidadeLabel.setText("Cidade");
    estadoLabel = new JLabel();
    estadoLabel.setText("Estado");
    dataLabel = new JLabel();
    dataLabel.setText("Data de Nascimento");
    
        nomeText = new JTextField();
    nomeText.setColumns(30);
    enderecoText = new JTextField();
    enderecoText.setColumns(30);
    String[] estadoStrings = {
        "Acre (AC)",
        "GOIÁS (GO)",
        "PIRITUBA (PI)",
        "SEU PAI (SP)"
    };
    
    estadoSpinner = new JSpinner(new SpinnerListModel(estadoStrings));
    cidadeText = new JTextField();
    cidadeText.setColumns(20);
    dataText = new JFormattedTextField(formatador("##/##/####"));
    
        ImageIcon botaoIcon = carregarImagem("imagens/enviar.gif");
        enviarButton = new JButton("Enviar Cadastro", botaoIcon);
        
    
    JPanel titulosPanel = new JPanel (new GridLayout(0,1));
        titulosPanel.add(nomeLabel);
        titulosPanel.add(enderecoLabel);
        titulosPanel.add(estadoLabel);
        titulosPanel.add(cidadeLabel);
        titulosPanel.add(dataLabel);
    JPanel textoPanel = new JPanel (new GridLayout(0,1));
    textoPanel.add(nomeText);
    textoPanel.add(enderecoText);
    textoPanel.add(estadoSpinner);
    textoPanel.add(cidadeText);
    textoPanel.add(dataText);
    
    JPanel botaoPanel = new JPanel (new GridLayout(0,1));
        botaoPanel.add(enviarButton);
        setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        add(titulosPanel,BorderLayout.LINE_START);
        add(textoPanel,BorderLayout.LINE_END);
        add(botaoPanel,BorderLayout.PAGE_END);

    }
    protected MaskFormatter formatador (String s){
        MaskFormatter formatador = null;
        try{
            formatador = new MaskFormatter(s);
        } catch(java.text.ParseException exc) {
        System.err.println("Formatador is bad:" + exc.getMessage());
        System.exit(-1);
        }
        return formatador;
        
    }
    protected static ImageIcon carregarImagem(String path){
        java.net.URL imgURL = Formulario.class.getResource(path);
        if(imgURL != null){
            return new ImageIcon(imgURL);
        }else{
        System.err.println("Arquivo não encontrado meu bom :" + path);
            return null;
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            
            public void run() {
            createandshowGUI();
            }
            });
    }

 

   

    
}
