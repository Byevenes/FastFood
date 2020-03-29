package curso.brayan.fastfood;

import java.io.Serializable;

public class Sandwich implements Serializable {
    private int idImage;
    private String name;
    private String price;
    private String description;


    public Sandwich(String name, String description, String price,int idImage){
        this.idImage = idImage;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public int getIdImage(){
        return idImage;
    }

    public void setIdImage(int idImage){
        this.idImage = idImage;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getPrice(){
        return price;
    }

    public void setPrice(){
        this.price = price;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(){
        this.description = description;
    }
}
