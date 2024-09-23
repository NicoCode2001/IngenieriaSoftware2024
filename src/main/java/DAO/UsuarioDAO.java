package DAO;

import Conexion.Conectar;
import VO.UsuarioVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class UsuarioDAO{

/*Metodo listar*/
    public ArrayList<UsuarioVO> Listar_UsuarioVO(){
        ArrayList<UsuarioVO> list = new ArrayList<UsuarioVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM usuario;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                UsuarioVO vo = new UsuarioVO();
                vo.setNombreUsuario(rs.getString(1));
                vo.setContraseniaUsuario(rs.getString(2));
                vo.setNombre(rs.getString(3));
                vo.setApellido(rs.getString(4));
                vo.setDni(rs.getString(5));
                vo.setCiudad(rs.getString(6));
                vo.setBarrio(rs.getString(7));
                vo.setDireccion(rs.getString(8));
                vo.setRol(rs.getString(9));
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
    public void Agregar_UsuarioVO(UsuarioVO vo){
        Conectar conec = new Conectar();
        String sql = "INSERT INTO usuario (nombreUsuario, contraseniaUsuario, nombre, apellido, dni, ciudad, barrio, direccion, rol) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?);";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getNombreUsuario());
            ps.setString(2, vo.getContraseniaUsuario());
            ps.setString(3, vo.getNombre());
            ps.setString(4, vo.getApellido());
            ps.setString(5, vo.getDni());
            ps.setString(6, vo.getCiudad());
            ps.setString(7, vo.getBarrio());
            ps.setString(8, vo.getDireccion());
            ps.setString(9, vo.getRol());
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
    public void Modificar_UsuarioVO(UsuarioVO vo){
        Conectar conec = new Conectar();
        String sql = "UPDATE usuario SET contraseniaUsuario = ?, nombre = ?, apellido = ?, dni = ?, ciudad = ?, barrio = ?, direccion = ?, rol = ? WHERE nombreUsuario = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getNombreUsuario());
            ps.setString(2, vo.getContraseniaUsuario());
            ps.setString(3, vo.getNombre());
            ps.setString(4, vo.getApellido());
            ps.setString(5, vo.getDni());
            ps.setString(6, vo.getCiudad());
            ps.setString(7, vo.getBarrio());
            ps.setString(8, vo.getDireccion());
            ps.setString(9, vo.getRol());
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
    public void Eliminar_UsuarioVO(UsuarioVO vo){
        Conectar conec = new Conectar();
        String sql = "DELETE FROM usuario WHERE nombreUsuario = ?;";
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getNombreUsuario());
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
    };
    
    
    public ArrayList<UsuarioVO> buscarUsuario(String usuario, String contrasenia) {
        
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM Usuario where NombreUsuario = '"+usuario+"';";
        ResultSet rs = null;
        PreparedStatement ps = null;
        UsuarioVO vo = null;
        ArrayList<UsuarioVO> list = new ArrayList<UsuarioVO>();
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                vo = new UsuarioVO();
                vo.setNombreUsuario(rs.getString(1));
                vo.setContraseniaUsuario(rs.getString(2));
                vo.setNombre(rs.getString(3));
                vo.setApellido(rs.getString(4));
                vo.setDni(rs.getString(5));
                vo.setCiudad(rs.getString(6));
                vo.setBarrio(rs.getString(7));
                vo.setDireccion(rs.getString(8));
                vo.setRol(rs.getString(9));
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
    

}
