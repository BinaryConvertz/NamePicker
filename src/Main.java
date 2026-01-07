import App.App;

import javax.swing.*;
import java.awt.*;
import java.util.List;

void main() {

    JFrame frame = new JFrame();
    JLabel label = new JLabel();
    GenerateFirstName(frame, label);

    App app = new App();
    app.start();
}

void Label(JLabel label, JFrame frame) {
    var listFirst = List.of("Ryan", "Peter", "Luke", "Manny");
    var listLast = List.of("James", "Johnson", "Manna", "Danvers");

    int length1 = RandomNum();
    int length  = RandomNum();


    label.setText(listFirst.get(length1) + " " + listLast.get(length));
    frame.setSize(new Dimension(150 * 2, 155 * 5));
    label.setFont(new Font("sans-serif",  Font.BOLD, 18));

}

// BACKGROUND COLORS CODE
void SetBackground(JPanel frame) {

    frame.setBackground(new Color(20, 20, 20));
}

// FOREGROUND COLORS CODE
void SetForeground(JLabel label) {

    label.setForeground(new Color(255, 255, 255));
}

int RandomNum() {
    Random r = new Random();
    return r.nextInt(0, 3);
}


// FULL UI CHANGE AND MAKES CODE READABLE
void GenerateFirstName(JFrame frame, JLabel label) {

    JPanel panel = new JPanel();
    panel.add(label);


    // COLORS CODE
    SetBackground(panel);
    SetForeground(label);
    ExtraSetup(frame, panel);
    Label(label, frame);

}

void ExtraSetup(JFrame frame, JPanel panel) {
    frame.add(panel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
}
