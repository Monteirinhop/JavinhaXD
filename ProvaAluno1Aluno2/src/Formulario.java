
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavo
 */
public class Formulario extends JPanel implements ActionListener{
    JLabel nomeLabel;
    JLabel sexoLabel;
    JLabel emailLabel;
    JLabel selecionarLabel;
    
    JRadioButton Masculino;
    JRadioButton Feminino;
    
    JCheckBox Esporte;
    JCheckBox Estudar;
    JCheckBox Brincar;
    JCheckBox Cinema;
    JCheckBox Viajar;
    JCheckBox Inventar;
    
    
    JTextField nomeText;
    JTextField EmailText;
    JButton VerificarButton ;
        
    StringBuffer choices;
    JLabel Imagem;

    public  Formulario (){
    super(new BorderLayout());
    
    Esporte = new JCheckBox("Esporte");
    
    Estudar = new JCheckBox("Estudar");
    
    Brincar = new JCheckBox("Brincar");
    
    Cinema  = new JCheckBox("Cinema");
    
    Viajar  = new JCheckBox("Viajar");
    
    Inventar= new JCheckBox("Inventar");
    
    
        
        choices = new StringBuffer("ESBCVI");
        
        Imagem = new JLabel();
        Imagem.setFont(Imagem.getFont().deriveFont(Font.ITALIC));
        
        
    Masculino = new JRadioButton("Masculino", false);
    Feminino = new JRadioButton("Feminino", false);
    
    
    
    nomeLabel = new JLabel();
    nomeLabel.setText("Nome:");
    sexoLabel = new JLabel();
    sexoLabel.setText("Sexo:");
    emailLabel = new JLabel();
    emailLabel.setText("Insira seu Email:");
    selecionarLabel = new JLabel();
    selecionarLabel.setText("Selecione 3 opções que você mais gosta :");
    
    nomeText = new JTextField();
    nomeText.setColumns(30);
    EmailText = new JTextField();
    EmailText.setColumns(30);
    
    VerificarButton = new JButton("Verificar");
    VerificarButton.setActionCommand("Verificar");
    VerificarButton.addActionListener(this);
    
    
       JPanel textoPanel = new JPanel (new GridLayout(1,2));
    textoPanel.add(nomeLabel);
    textoPanel.add(nomeText);
     JPanel sexoPanel = new JPanel( new GridLayout(1,2));
    sexoPanel.add(sexoLabel);
    sexoPanel.add(Masculino);
    sexoPanel.add(Feminino);
    JPanel emailPanel = new JPanel( new GridLayout(1,2));
    emailPanel.add(emailLabel);
    emailPanel.add(EmailText);
    JPanel opcoesPanel = new JPanel( new GridLayout(1,1));
    opcoesPanel.add(selecionarLabel);
    JPanel checkboxPanel = new JPanel(new GridLayout(2,3));
    checkboxPanel.add(Esporte);
    checkboxPanel.add(Estudar);
    checkboxPanel.add(Brincar);
    checkboxPanel.add(Cinema);
    checkboxPanel.add(Viajar);
    checkboxPanel.add(Inventar);
    JPanel ButtonPanel = new JPanel(new GridLayout(1,1));
    ButtonPanel.add(VerificarButton);
    
    
    JPanel imagemPanel = new JPanel(new GridLayout(1,1));
    imagemPanel.add(Imagem);
    
    setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        add(textoPanel);
        add(sexoPanel);
        add(emailPanel);
        add(opcoesPanel);
        add(checkboxPanel);
        add(ButtonPanel);
        add(imagemPanel);
    }
    /**
     * @param args the command line arguments
     */
    private static void createandshowGUI(){
    JFrame janela = new JFrame ("Formulário Bimestral");
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Formulario painelForm = new Formulario();
    painelForm.setOpaque(true);
    painelForm.setLayout(new BoxLayout(painelForm, BoxLayout.PAGE_AXIS));
    janela.setContentPane(painelForm);
    janela.pack();
    janela.setVisible(true);
    }
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            
            public void run() {
            createandshowGUI();
            }
            });// TODO code application logic here
    }

    public void itemStateChanged(ItemEvent ie) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param e
     */
    
        public void actionPerformed(ActionEvent e) {
            if("Verificar".equals(e.getActionCommand())){
            if (nomeText.getText().isEmpty()){
        showMessageDialog(null,"necessário digitar o seu nome !");
        nomeText.requestFocus();
        }
            if(Masculino.isSelected()){
            Feminino.setSelected(false);
            }else{
            Masculino.setSelected(false);
            
            }
            }
        ImageIcon icon = null;
        if(Estudar.isSelected() && Brincar.isSelected() && Inventar.isSelected()  && !Cinema.isSelected() && !Viajar.isSelected() && !Esporte.isSelected()){
           icon = createImageIcon("imgs/prova-a.jpg");
        Imagem.setIcon(icon);
        }
        else if (Esporte.isSelected() && Viajar.isSelected() && Brincar.isSelected() && !Inventar.isSelected() && !Cinema.isSelected() && !Estudar.isSelected()) {
            icon = createImageIcon("imgs/prova-n.jpg");
        Imagem.setIcon(icon);
        } else {
            icon = createImageIcon("imgs/prova-l.gif");
            Imagem.setIcon(icon);
        }
   
        }
         protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = Formulario.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
}
