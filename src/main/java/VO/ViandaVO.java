package VO;

public class ViandaVO {

/*Todo los atributos*/
    int codVianda;
    String fecha;
    String tipoMenu;
    String plato;
    String guarnicion;
    String postre;

public ViandaVO(){}

/*Todo los codigos get*/
    public int getCodVianda(){
        return codVianda;
    }
    public String getFecha(){
        return fecha;
    }
    public String getTipoMenu(){
        return tipoMenu;
    }
    public String getPlato(){
        return plato;
    }
    public String getGuarnicion(){
        return guarnicion;
    }
    public String getPostre(){
        return postre;
    }


/*Todo los codigos set*/
    public void setCodVianda(int codVianda){
        this.codVianda = codVianda;
    }
    public void setFecha(String fecha){
        this.fecha = fecha;
    }
    public void setTipoMenu(String tipoMenu){
        this.tipoMenu = tipoMenu;
    }
    public void setPlato(String plato){
        this.plato = plato;
    }
    public void setGuarnicion(String guarnicion){
        this.guarnicion = guarnicion;
    }
    public void setPostre(String postre){
        this.postre = postre;
    }

}
