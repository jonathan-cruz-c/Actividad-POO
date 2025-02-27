package CarolinaCT;

class Autos{
    int id;
    String marca;
    String modelo;
    int año;
    String color;
    int precio;
Autos(){}
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getMarca() {
    return marca;
}
public void setMarca(String marca) {
    this.marca = marca;
}
public String getModelo() {
    return modelo;
}
public void setModelo(String modelo) {
    this.modelo = modelo;
}
public int getAño() {
    return año;
}
public void setAño(int año) {
    this.año = año;
}
public String getColor() {
    return color;
}
public void setColor(String color) {
    this.color = color;
}
public int getPrecio() {
    return precio;
}
public void setPrecio(int precio) {
    this.precio = precio;
}

@Override
public String toString() {
    return "Autos [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", año=" + año + ", color=" + color
            + ", precio=" + precio + "]";
}

}