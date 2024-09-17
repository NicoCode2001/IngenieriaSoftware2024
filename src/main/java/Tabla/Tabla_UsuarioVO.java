package Tabla;

import DAO.UsuarioDAO;
import VO.UsuarioVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_UsuarioVO{

   UsuarioDAO dao = null;


    public void visualizar_UsuarioVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("nombreUsuario");
        dt.addColumn("contraseniaUsuario");
        dt.addColumn("nombre");
        dt.addColumn("apellido");
        dt.addColumn("dni");
        dt.addColumn("ciudad");
        dt.addColumn("barrio");
        dt.addColumn("direccion");
        dt.addColumn("rol");

        dao = new UsuarioDAO();
        UsuarioVO vo = new UsuarioVO();
        ArrayList<UsuarioVO> list = dao.Listar_UsuarioVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[9];
                vo = list.get(i);
                fila[0] = vo.getNombreUsuario();
                fila[1] = vo.getContraseniaUsuario();
                fila[2] = vo.getNombre();
                fila[3] = vo.getApellido();
                fila[4] = vo.getDni();
                fila[5] = vo.getCiudad();
                fila[6] = vo.getBarrio();
                fila[7] = vo.getDireccion();
                fila[8] = vo.getRol();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


