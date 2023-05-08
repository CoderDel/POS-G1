package custom.listener;

import custom.FoodItemUI;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class FoodItemMouseListener implements MouseListener {

    private FoodItemUI fi;
    
    public FoodItemMouseListener(FoodItemUI fi) {
        this.fi = fi;
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        fi.setBackground(fi.getClickedColor());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        fi.setBackground(fi.getHoverColor());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        fi.setBackground(fi.getHoverColor());
    }

    @Override
    public void mouseExited(MouseEvent e) {
        fi.setBackground(fi.getDefaultColor());
    }
    
}
