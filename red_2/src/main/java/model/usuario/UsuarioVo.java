package model.usuario;

public class UsuarioVo {
    
    private int id;
    private String nombre;
    private String correo;
    private String telefono;
    private String nomUsuario;
    private String contra;
    
    public UsuarioVo() {
    }
    public UsuarioVo(int id, String nombre, String correo, String telefono, String nomUsuario, String contra) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.nomUsuario = nomUsuario;
        this.contra = contra;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getNomUsuario() {
        return nomUsuario;
    }
    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }
    public String getContra() {
        return contra;
    }
    public void setContra(String contra) {
        this.contra = contra;
    }

    

}
