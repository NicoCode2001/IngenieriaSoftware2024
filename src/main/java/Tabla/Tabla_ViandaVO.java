package Tabla;

import DAO.ViandaDAO;
import VO.ViandaVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_ViandaVO{

   ViandaDAO dao = null;


    public void visualizar_ViandaVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("codVianda");
        dt.addColumn("fecha");
        dt.addColumn("tipoMenu");
        dt.addColumn("plato");
        dt.addColumn("guarnicion");
        dt.addColumn("postre");

        dao = new ViandaDAO();
        ViandaVO vo = new ViandaVO();
        ArrayList<ViandaVO> list = dao.Listar_ViandaVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[6];
                vo = list.get(i);
                fila[0] = vo.getCodVianda();
                fila[1] = vo.getFecha();
                fila[2] = vo.getTipoMenu();
                fila[3] = vo.getPlato();
                fila[4] = vo.getGuarnicion();
                fila[5] = vo.getPostre();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


