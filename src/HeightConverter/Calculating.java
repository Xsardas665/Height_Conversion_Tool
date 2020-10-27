package HeightConverter;

import HeightConverter.UI.GUI;

import java.text.DecimalFormat;

public class Calculating {
    public static void calculate(GUI gui) {
        double dFeet, dInches, dCentimeters;
        if (gui.getCmTextField().getText().equals("")) {
            dFeet = Double.parseDouble(gui.getFeetTextField().getText());
            dInches = Double.parseDouble(gui.getInchesTextField().getText());
            dCentimeters = (dFeet * 12 + dInches) * 2.54;
            gui.getCmTextField().setText("" + dCentimeters);
            gui.feetTF_clear();
            gui.inchesTF_clear();
        } else {
            double tmp;
            tmp = Double.parseDouble(gui.getCmTextField().getText());
            tmp = tmp / 2.54;
            dInches = tmp % 12;
            dFeet = (tmp - dInches) / 12;
            DecimalFormat f = new DecimalFormat("##.00");
            gui.getFeetTextField().setText("" + f.format(dFeet));
            gui.getInchesTextField().setText("" + f.format(dInches));
            gui.cmTF_clear();
        }
    }

}
