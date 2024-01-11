/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package project1;

/**
 *
 * @author Lenovo
 */
public class Reservate {

    private String name;
    private int x;
    private int y;
    private String iconName;

    public Reservate(String name, int x, int y, String iconName) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.iconName = iconName;
    }
    
    public Reservate(){
    }
    
    public String getIconName() {
        return iconName;
    }

    public void setIconName(String iconName) {
        this.iconName = iconName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
