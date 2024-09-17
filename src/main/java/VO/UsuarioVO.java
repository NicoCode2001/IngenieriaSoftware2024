package VO;

public class UsuarioVO {

/*Todo los atributos*/
    String nombreUsuario;
    String contraseniaUsuario;
    String nombre;
    String apellido;
    String dni;
    String ciudad;
    String barrio;
    String direccion;
    String rol;

public UsuarioVO(){}

/*Todo los codigos get*/
    public String getNombreUsuario(){
        return nombreUsuario;
    }
    public String getContraseniaUsuario(){
        return contraseniaUsuario;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getDni(){
        return dni;
    }
    public String getCiudad(){
        return ciudad;
    }
    public String getBarrio(){
        return barrio;
    }
    public String getDireccion(){
        return direccion;
    }
    public String getRol(){
        return rol;
    }


/*Todo los codigos set*/
    public void setNombreUsuario(String nombreUsuario){
        this.nombreUsuario = nombreUsuario;
    }
    public void setContraseniaUsuario(String contraseniaUsuario){
        this.contraseniaUsuario = contraseniaUsuario;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setDni(String dni){
        this.dni = dni;
    }
    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }
    public void setBarrio(String barrio){
        this.barrio = barrio;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public void setRol(String rol){
        this.rol = rol;
    }

}
