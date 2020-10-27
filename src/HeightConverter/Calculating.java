package HeightConverter;

import HeightConverter.UI.GUI;

public class Calculating {
    public static void calculate(GUI gui) {
        double dFeet, dInches, dCentimeters;
        dFeet = Double.parseDouble(gui.getFeetTextField().getText());
        dInches = Double.parseDouble(gui.getInchesTextField().getText());
        dCentimeters = (dFeet * 12 + dInches) * 2.54;
        gui.getCmTextField().setText("" + dCentimeters);
    }

}
