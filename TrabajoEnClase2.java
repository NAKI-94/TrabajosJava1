package co.com.ps.TrabajosEnClaseEntrega;
//mi objeto es mi perro
public class TrabajoEnClase2 {

 private String nombre;
 private Short edad;
 private String raza;
private  String color;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public Short getEdad() {
        return this.edad;
    }

    public void setNombre(Short edad){
        this.edad=edad;
    }
    public String getRaza() {
        return this.raza;
    }

    public void setRaza(String raza){
        this.raza=raza;
    }
    public String getColor() {
        return this.color;
    }

    public void setColor(String color){
        this.color=color;
    }

    public void ladrar(){
        System.out.println("estoy ladrando");
    }
    public void correr(){
        System.out.println("estoy corriendo");
    }
    public void comer(){
        System.out.println("estoy comiendo");
    }



}
