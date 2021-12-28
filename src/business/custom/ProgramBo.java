package business.custom;

import business.SuperBo;
import dto.ProgramDto;
import entity.Program;

import java.util.ArrayList;

public interface ProgramBo extends SuperBo {
    public boolean add(ProgramDto programDTO) throws Exception;;

    ArrayList<ProgramDto> find() throws Exception;;

    boolean delete(String id) throws Exception;;

    boolean update(ProgramDto programDTO) throws Exception;;
}
