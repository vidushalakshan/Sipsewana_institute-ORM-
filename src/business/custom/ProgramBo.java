package business.custom;

import business.SuperBo;
import dto.ProgramDto;

import java.sql.SQLException;
import java.util.List;

public interface ProgramBo extends SuperBo {
    public boolean add(ProgramDto programDTO) throws Exception;;

    List<ProgramDto> find() throws SQLException, ClassNotFoundException;;

    boolean delete(String id) throws Exception;;

    boolean update(ProgramDto programDTO) throws Exception;;
}
