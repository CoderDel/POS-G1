package custom.listener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import custom.ItemFilter;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class ItemFilterListener implements MouseListener {

    private ItemFilter filter;
    
    public ItemFilterListener(ItemFilter filter) {
        this.filter = filter;
    }
    
    //for design only 
    //sets the background and border color in a specific mouse state
    @Override
    public void mouseClicked(MouseEvent e) {
//        filter.setBackground(filter.getClickedColor());
//        
//        Border newBorder = BorderFactory.createLineBorder(filter.getClickedColor(), 1);
//        filter.setBorder(newBorder);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        filter.setBackground(filter.getClickedColor());
        
        Border newBorder = BorderFactory.createLineBorder(filter.getClickedColor(), 1);
        filter.setBorder(newBorder);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        filter.setBackground(filter.getHoverColor());
        
        Border newBorder = BorderFactory.createLineBorder(filter.getHoverColor(), 1);
        filter.setBorder(newBorder);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        filter.setBackground(filter.getHoverColor());
        
        Border newBorder = BorderFactory.createLineBorder(filter.getHoverColor(), 1);
        filter.setBorder(newBorder);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        filter.setBackground(filter.getDefaultColor());
        
        Border newBorder = BorderFactory.createLineBorder(Color.black, 1);
        filter.setBorder(newBorder);
    }
    
}
