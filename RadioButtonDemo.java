import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonDemo extends JFrame implements ActionListener {
    
    private JRadioButton birdRadio, catRadio, dogRadio, rabbitRadio, pigRadio;
    private ButtonGroup group;
    
    public RadioButtonDemo() {
        setTitle("RadioButtonDemo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(300, 200);
        
        birdRadio = new JRadioButton("Bird");
        catRadio = new JRadioButton("Cat");
        dogRadio = new JRadioButton("Dog");
        rabbitRadio = new JRadioButton("Rabbit");
        pigRadio = new JRadioButton("Pig");
        
        birdRadio.addActionListener(this);
        catRadio.addActionListener(this);
        dogRadio.addActionListener(this);
        rabbitRadio.addActionListener(this);
        pigRadio.addActionListener(this);
        
        group = new ButtonGroup();
        group.add(birdRadio);
        group.add(catRadio);
        group.add(dogRadio);
        group.add(rabbitRadio);
        group.add(pigRadio);
        
        add(birdRadio);
        add(catRadio);
        add(dogRadio);
        add(rabbitRadio);
        add(pigRadio);
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String selectedPet = "";
        
        if (e.getSource() == birdRadio) {
            selectedPet = "Bird";
        } else if (e.getSource() == catRadio) {
            selectedPet = "Cat";
        } else if (e.getSource() == dogRadio) {
            selectedPet = "Dog";
        } else if (e.getSource() == rabbitRadio) {
            selectedPet = "Rabbit";
        } else if (e.getSource() == pigRadio) {
            selectedPet = "Pig";
        }
        
        JOptionPane.showMessageDialog(this, 
            "You selected: " + selectedPet, 
            "Pet Selection", 
            JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RadioButtonDemo();
            }
        });
    }
}