package DAO;

import Conexion.Conectar;
import VO.ViandaVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class ViandaDAO{

/*Metodo listar*/
    public ArrayList<ViandaVO> Listar_ViandaVO(){
        ArrayList<ViandaVO> list = new ArrayList<ViandaVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM vianda;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                ViandaVO vo = new ViandaVO();
                vo.setCodVianda(rs.getInt(1));
                vo.setFecha(rs.getString(2));
                vo.setTipoMenu(rs.getString(3));
                vo.setPlato(rs.getString(4));
                vo.setGuarnicion(rs.getString(5));
                vo.setPostre(rs.getString(6));
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
    public void Agregar_ViandaVO(ViandaVO vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO vianda (codVianda, fecha, tipoMenu, plato, guarnicion, postre) VALUES(?, ?, ?, ?, ?, ?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodVianda());
            ps.setString(2, vo.getFecha());
            ps.setString(3, vo.getTipoMenu());
            ps.setString(4, vo.getPlato());
            ps.setString(5, vo.getGuarnicion());
            ps.setString(6, vo.getPostre());
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
    public void Modificar_ViandaVO(ViandaVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE vianda SET fecha = ?, tipoMenu = ?, plato = ?, guarnicion = ?, postre = ? WHERE codVianda = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodVianda());
            ps.setString(2, vo.getFecha());
            ps.setString(3, vo.getTipoMenu());
            ps.setString(4, vo.getPlato());
            ps.setString(5, vo.getGuarnicion());
            ps.setString(6, vo.getPostre());
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
    public void Eliminar_ViandaVO(ViandaVO vo){
        Conectar conec = new Conectar();
        String sql = "DELETE FROM vianda WHERE codVianda = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodVianda());
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
