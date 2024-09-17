package DAO;

import Conexion.Conectar;
import VO.InscripcionbecaVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class InscripcionbecaDAO{

/*Metodo listar*/
    public ArrayList<InscripcionbecaVO> Listar_InscripcionbecaVO(){
        ArrayList<InscripcionbecaVO> list = new ArrayList<InscripcionbecaVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM inscripcionbeca;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                InscripcionbecaVO vo = new InscripcionbecaVO();
                vo.setIdinscripcionbeca(rs.getInt(1));
                vo.setNombreUsuario(rs.getString(2));
                vo.setEstadoBeca(rs.getString(3));
                vo.setInscripcionbecacol(rs.getString(4));
                vo.setIngresos(rs.getString(5));
                vo.setVivienda(rs.getString(6));
                vo.setCondicionVivienda(rs.getString(7));
                vo.setPadre(rs.getString(8));
                vo.setMadre(rs.getString(9));
                vo.setHermano(rs.getString(10));
                vo.setTio(rs.getString(11));
                vo.setAbuelo(rs.getString(12));
                vo.setOtro(rs.getString(13));
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
    public void Agregar_InscripcionbecaVO(InscripcionbecaVO vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO inscripcionbeca (idinscripcionbeca, nombreUsuario, estadoBeca, inscripcionbecacol, ingresos, vivienda, condicionVivienda, padre, madre, hermano, tio, abuelo, otro) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getIdinscripcionbeca());
            ps.setString(2, vo.getNombreUsuario());
            ps.setString(3, vo.getEstadoBeca());
            ps.setString(4, vo.getInscripcionbecacol());
            ps.setString(5, vo.getIngresos());
            ps.setString(6, vo.getVivienda());
            ps.setString(7, vo.getCondicionVivienda());
            ps.setString(8, vo.getPadre());
            ps.setString(9, vo.getMadre());
            ps.setString(10, vo.getHermano());
            ps.setString(11, vo.getTio());
            ps.setString(12, vo.getAbuelo());
            ps.setString(13, vo.getOtro());
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
    public void Modificar_InscripcionbecaVO(InscripcionbecaVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE inscripcionbeca SET nombreUsuario = ?, estadoBeca = ?, inscripcionbecacol = ?, ingresos = ?, vivienda = ?, condicionVivienda = ?, padre = ?, madre = ?, hermano = ?, tio = ?, abuelo = ?, otro = ? WHERE idinscripcionbeca = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getIdinscripcionbeca());
            ps.setString(2, vo.getNombreUsuario());
            ps.setString(3, vo.getEstadoBeca());
            ps.setString(4, vo.getInscripcionbecacol());
            ps.setString(5, vo.getIngresos());
            ps.setString(6, vo.getVivienda());
            ps.setString(7, vo.getCondicionVivienda());
            ps.setString(8, vo.getPadre());
            ps.setString(9, vo.getMadre());
            ps.setString(10, vo.getHermano());
            ps.setString(11, vo.getTio());
            ps.setString(12, vo.getAbuelo());
            ps.setString(13, vo.getOtro());
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
    public void Eliminar_InscripcionbecaVO(InscripcionbecaVO vo){
        Conectar conec = new Conectar();
        String sql = "DELETE FROM inscripcionbeca WHERE idinscripcionbeca = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getIdinscripcionbeca());
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
