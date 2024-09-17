package Tabla;

import DAO.ReservaviandaDAO;
import VO.ReservaviandaVO;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class Tabla_ReservaviandaVO{

   ReservaviandaDAO dao = null;


    public void visualizar_ReservaviandaVO(JTable tabla){
        DefaultTableModel dt = new DefaultTableModel();
        dt.addColumn("codReserva");
        dt.addColumn("codVianda");
        dt.addColumn("nombreUsuario");
        dt.addColumn("calificacion");
        dt.addColumn("opinion");
        dt.addColumn("cancelada");

        dao = new ReservaviandaDAO();
        ReservaviandaVO vo = new ReservaviandaVO();
        ArrayList<ReservaviandaVO> list = dao.Listar_ReservaviandaVO();

        if(list.size() > 0){
            for(int i=0; i<list.size(); i++){
                Object fila[] = new Object[6];
                vo = list.get(i);
                fila[0] = vo.getCodReserva();
                fila[1] = vo.getCodVianda();
                fila[2] = vo.getNombreUsuario();
                fila[3] = vo.getCalificacion();
                fila[4] = vo.getOpinion();
                fila[5] = vo.getCancelada();
                dt.addRow(fila);
            }
            tabla.setModel(dt);
        }
    }
}


