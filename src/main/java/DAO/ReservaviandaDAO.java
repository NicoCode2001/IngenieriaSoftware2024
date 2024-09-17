package DAO;

import Conexion.Conectar;
import VO.ReservaviandaVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class ReservaviandaDAO{

/*Metodo listar*/
    public ArrayList<ReservaviandaVO> Listar_ReservaviandaVO(){
        ArrayList<ReservaviandaVO> list = new ArrayList<ReservaviandaVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM reservavianda;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                ReservaviandaVO vo = new ReservaviandaVO();
                vo.setCodReserva(rs.getInt(1));
                vo.setCodVianda(rs.getInt(2));
                vo.setNombreUsuario(rs.getString(3));
                vo.setCalificacion(rs.getString(4));
                vo.setOpinion(rs.getString(5));
                vo.setCancelada(rs.getString(6));
                list.add(vo);
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                rs.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
        return list;
    }


/*Metodo agregar*/
    public void Agregar_ReservaviandaVO(ReservaviandaVO vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO reservavianda (codReserva, codVianda, nombreUsuario, calificacion, opinion, cancelada) VALUES(?, ?, ?, ?, ?, ?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodReserva());
            ps.setInt(2, vo.getCodVianda());
            ps.setString(3, vo.getNombreUsuario());
            ps.setString(4, vo.getCalificacion());
            ps.setString(5, vo.getOpinion());
            ps.setString(6, vo.getCancelada());
            ps.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
    }


/*Metodo Modificar*/
    public void Modificar_ReservaviandaVO(ReservaviandaVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE reservavianda SET codVianda = ?, nombreUsuario = ?, calificacion = ?, opinion = ?, cancelada = ? WHERE codReserva = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodReserva());
            ps.setInt(2, vo.getCodVianda());
            ps.setString(3, vo.getNombreUsuario());
            ps.setString(4, vo.getCalificacion());
            ps.setString(5, vo.getOpinion());
            ps.setString(6, vo.getCancelada());
            ps.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
    }


/*Metodo Eliminar*/
    public void Eliminar_ReservaviandaVO(ReservaviandaVO vo){
        Conectar conec = new Conectar();
        String sql = "DELETE FROM reservavianda WHERE codReserva = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodReserva());
            ps.executeUpdate();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
    }


}
