package custom;

import custom.listener.ItemFilterListener;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;

public class ItemFilter extends javax.swing.JPanel {
    
    private Color defaultColor;
    private Color hoverColor;
    private Color clickedColor;
    
    public ItemFilter() {
        initComponents();
        
        setPreferredSize(new Dimension(100, 26));
        
        ItemFilterListener ifl = new ItemFilterListener(this);
        addMouseListener(ifl);
    }
    
    //getters 
    public Color getDefaultColor() {
        return defaultColor;
    }

    public Color getHoverColor() {
        return hoverColor;
    }

    public Color getClickedColor() {
        return clickedColor;
    }
    
    
    //setters
    public void setaDefaultColor(Color defaultColor) {
        this.defaultColor = defaultColor;
    }
    
    public void setaHoverColor(Color hoverColor) {
        this.hoverColor = hoverColor;
    }
    
    public void setaClickedColor(Color clickedColor) {
        this.clickedColor = clickedColor;
    }
    
    public void setaFilterName(String name) {
        filterType.setText(name);
    }
    
    public void setaIconPath(String path) {
        icon.setIcon(new ImageIcon("D:\\Java\\Netbeans Projects\\Ant\\FoodTerria POS System"
                + "\\src\\pos\\icons\\"+path));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        icon = new javax.swing.JLabel();
        filterType = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setPreferredSize(new java.awt.Dimension(100, 26));

        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/icons/all.png"))); // NOI18N
        icon.setFocusable(false);

        filterType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        filterType.setText("Breakfast");
        filterType.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filterType, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(filterType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel filterType;
    private javax.swing.JLabel icon;
    // End of variables declaration//GEN-END:variables
}
