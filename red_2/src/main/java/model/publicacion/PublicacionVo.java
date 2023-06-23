package model.publicacion;

public class PublicacionVo {

    private int idP;
    private String titulo;
    private String descripcion;
    private String imagen;


     public PublicacionVo(){
     }

    public PublicacionVo(int idP, String titulo, String descripcion, String imagen) {
        this.idP = idP;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imagen =imagen;
    }

    public int getIdP() {
        return idP;
    }
    public void setIdP(int idP) {
         this.idP = idP;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
   
}
