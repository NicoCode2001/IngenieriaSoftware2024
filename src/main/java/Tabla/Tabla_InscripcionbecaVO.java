package Tabla;

import DAO.InscripcionbecaDAO;
import VO.InscripcionbecaVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_InscripcionbecaVO{

   InscripcionbecaDAO dao = null;


    public void visualizar_InscripcionbecaVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("idinscripcionbeca");
        dt.addColumn("nombreUsuario");
        dt.addColumn("estadoBeca");
        dt.addColumn("inscripcionbecacol");
        dt.addColumn("ingresos");
        dt.addColumn("vivienda");
        dt.addColumn("condicionVivienda");
        dt.addColumn("padre");
        dt.addColumn("madre");
        dt.addColumn("hermano");
        dt.addColumn("tio");
        dt.addColumn("abuelo");
        dt.addColumn("otro");

        dao = new InscripcionbecaDAO();
        InscripcionbecaVO vo = new InscripcionbecaVO();
        ArrayList<InscripcionbecaVO> list = dao.Listar_InscripcionbecaVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[13];
                vo = list.get(i);
                fila[0] = vo.getIdinscripcionbeca();
                fila[1] = vo.getNombreUsuario();
                fila[2] = vo.getEstadoBeca();
                fila[3] = vo.getInscripcionbecacol();
                fila[4] = vo.getIngresos();
                fila[5] = vo.getVivienda();
                fila[6] = vo.getCondicionVivienda();
                fila[7] = vo.getPadre();
                fila[8] = vo.getMadre();
                fila[9] = vo.getHermano();
                fila[10] = vo.getTio();
                fila[11] = vo.getAbuelo();
                fila[12] = vo.getOtro();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


