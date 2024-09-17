package VO;

public class ReservaviandaVO {

/*Todo los atributos*/
    int codReserva;
    int codVianda;
    String nombreUsuario;
    String calificacion;
    String opinion;
    String cancelada;

public ReservaviandaVO(){}

/*Todo los codigos get*/
    public int getCodReserva(){
        return codReserva;
    }
    public int getCodVianda(){
        return codVianda;
    }
    public String getNombreUsuario(){
        return nombreUsuario;
    }
    public String getCalificacion(){
        return calificacion;
    }
    public String getOpinion(){
        return opinion;
    }
    public String getCancelada(){
        return cancelada;
    }


/*Todo los codigos set*/
    public void setCodReserva(int codReserva){
        this.codReserva = codReserva;
    }
    public void setCodVianda(int codVianda){
        this.codVianda = codVianda;
    }
    public void setNombreUsuario(String nombreUsuario){
        this.nombreUsuario = nombreUsuario;
    }
    public void setCalificacion(String calificacion){
        this.calificacion = calificacion;
    }
    public void setOpinion(String opinion){
        this.opinion = opinion;
    }
    public void setCancelada(String cancelada){
        this.cancelada = cancelada;
    }

}
