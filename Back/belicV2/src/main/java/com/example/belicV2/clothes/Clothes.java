package com.example.belicV2.clothes;


import com.example.belicV2.image.Image;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Clothes")
public class Clothes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "size")
    private String size;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "description")
    private String descripton;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "price")
    private float price;

    @ManyToMany
    @JoinTable(
            name = "clothes_imgs",
            joinColumns = @JoinColumn(name = "clothes_id"),
            inverseJoinColumns = @JoinColumn(name = "img_id")
    )
    private Set<Image> imgs = new HashSet<>();




    public Clothes(Integer id, String size, String name, String desc, String type, float price) {
        this.id = id;
        this.size = size;
        this.nombre = name;
        this.descripton = desc;
        this.tipo = type;
        this.price = price;
    }

    public Clothes(String size, String name, String desc, String type, float price) {
        this.size = size;
        this.nombre = name;
        this.descripton = desc;
        this.tipo = type;
        this.price = price;
    }

    public Clothes() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripton() {
        return descripton;
    }

    public void setDescripton(String descripton) {
        this.descripton = descripton;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Set<Image> getImgs() {
        return imgs;
    }

    public void setImgs(Set<Image> imgs) {
        this.imgs = imgs;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "id=" + id +
                ", size='" + size + '\'' +
                ", name='" + nombre + '\'' +
                ", desc='" + descripton + '\'' +
                ", type='" + tipo + '\'' +
                ", price=" + price +
                '}';
    }


    public void enrrol(Image image) {
        imgs.add(image);
    }
}
