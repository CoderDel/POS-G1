package custom;

import custom.listener.FoodItemMouseListener;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;

public class FoodItemUI extends javax.swing.JPanel {

    private Color defaultColor;
    private Color hoverColor;
    private Color clickedColor;
    
    private Color availableColor;
    private Color notAvailableColor;
    
    private String foodType;
    
    public FoodItemUI(String foodType, String foodName, float price, boolean availability) {
        
        initComponents();
        
        this.foodType = foodType;
        availableColor = new Color(0,200,83);
        notAvailableColor = new Color(244, 67, 54);
        updateFoodInfo(foodType, foodName, price, availability);
        
        setPreferredSize(new Dimension(617, 100));
        
        FoodItemMouseListener fi = new FoodItemMouseListener(this);
        this.addMouseListener(fi);
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
    
    public String getFoodName() {
        return foodName.getText();
    }
    
    
    //setters
    public void setDefaultColor(Color defaultColor) {
        this.defaultColor = defaultColor;
    }
    
    public void setHoverColor(Color hoverColor) {
        this.hoverColor = hoverColor;
    }
    
    public void setClickedColor(Color clickedColor) {
        this.clickedColor = clickedColor;
    }
    
    public void setaFoodTypeIcon(String filename) {
        foodName.setIcon(new ImageIcon("D:\\Java\\Netbeans Projects\\Ant\\FoodTerria POS System"
                + "\\src\\pos\\icons\\"+filename));
    }
    
    public void setaFoodTypeTxt(String foodName) {
        foodTypeTxt.setText(foodName);
    }
    
    public void setaPriceTxt(float price) {
        priceTxt.setText(String.format("₱%.2f", price));
    }
    
    public void setaFoodName(String name) {
        foodName.setText(name);
    }
    
    public void setaFoodType(String type) {
        //sets the food icon depending on the type
        String path = "D:\\Java\\Netbeans Projects\\Ant\\FoodTerria POS System"
                + "\\src\\pos\\icons\\";
        String name = "";
        
        //sets food type as well as the panel color of the corresponding type 
        foodType = type;
        
        switch(foodType) {
            case "Breakfast":
                setDefaultColor(new Color(255,245,157));
                setHoverColor(new Color(255,238,88));
                setClickedColor(new Color(253, 216, 53));
                name = "breakfast.png";
                break;
            case "Lunch":
                setDefaultColor(new Color(255,204,128));
                setHoverColor(new Color(255,183,77));
                setClickedColor(new Color(255, 167, 38));
                name = "lunch.png";
                break;
            case "Dinner":
                setDefaultColor(new Color(206, 147, 216));
                setHoverColor(new Color(186, 104, 200));
                setClickedColor(new Color(171, 71, 188));
                name = "dinner.png";
                break;
            case "Dessert":
                setDefaultColor(new Color(248,187,208));
                setHoverColor(new Color(244,143,177));
                setClickedColor(new Color(240, 98, 146));
                name = "dessert.png";
                break;
            case "Drink":
                setDefaultColor(new Color(128,222,234));
                setHoverColor(new Color(77,208,225));
                setClickedColor(new Color(38, 198, 218));
                name = "drinks.png";
                break;
            default:
                System.out.println("Invalid food type");
        }
        
        foodTypeIcon.setIcon(new ImageIcon(path+name));
        setBackground(defaultColor);
        
    }
    
    public void setFoodTypeText() {
        
    }
    
    public void setAvailability(boolean availability) {
        if(availability)
            foodStatus.setBackground(availableColor);
        else
            foodStatus.setBackground(notAvailableColor);
        
    }
    
    public void updateFoodInfo(String type, String name, float price, boolean availability) {
        setaFoodType(type);
        setaFoodName(name);
        setaPriceTxt(price);
        setAvailability(availability);
    }
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        foodTypeIcon = new javax.swing.JLabel();
        foodName = new javax.swing.JLabel();
        priceTxt = new javax.swing.JLabel();
        foodTypeTxt = new javax.swing.JLabel();
        foodStatus = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 234, 167));
        setPreferredSize(new java.awt.Dimension(617, 100));

        foodTypeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/icons/breakfast.png"))); // NOI18N

        foodName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        foodName.setText("Tapsilog");

        priceTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        priceTxt.setText("₱100.00");

        foodTypeTxt.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        foodTypeTxt.setText("Breakfast | Available");

        foodStatus.setBackground(new java.awt.Color(0, 200, 83));

        javax.swing.GroupLayout foodStatusLayout = new javax.swing.GroupLayout(foodStatus);
        foodStatus.setLayout(foodStatusLayout);
        foodStatusLayout.setHorizontalGroup(
            foodStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        foodStatusLayout.setVerticalGroup(
            foodStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(foodTypeIcon)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(foodTypeTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(foodName, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 285, Short.MAX_VALUE)
                .addComponent(foodStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(foodTypeIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(foodTypeTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(foodName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(priceTxt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(foodStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel foodName;
    private javax.swing.JPanel foodStatus;
    private javax.swing.JLabel foodTypeIcon;
    private javax.swing.JLabel foodTypeTxt;
    private javax.swing.JLabel priceTxt;
    // End of variables declaration//GEN-END:variables
}
