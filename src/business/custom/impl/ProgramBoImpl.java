package business.custom.impl;

import business.custom.ProgramBo;
import dao.DaoFactory;
import dao.DaoType;
import dao.custom.impl.ProgramDaoImpl;
import dto.ProgramDto;
import entity.Program;

import java.util.ArrayList;
import java.util.List;

public class ProgramBoImpl implements ProgramBo {

    ProgramDaoImpl programBo = DaoFactory.getInstance().getDAO(DaoType.PROGRAM);

    @Override
    public boolean add(ProgramDto programDTO) throws Exception {
        return programBo.add(new Program(
                programDTO.getPid(),
                programDTO.getProgram(),
                programDTO.getDuration(),
                programDTO.getFee()
        ));
    }

    @Override
    public ArrayList<ProgramDto> find() throws Exception {
        List<Program> all = programBo.findAll();
        ArrayList<ProgramDto> itemDTOS = new ArrayList<>();


        for (Program programDTO : all) {
            itemDTOS.add(new ProgramDto(
                    programDTO.getPid(),
                    programDTO.getProgram(),
                    programDTO.getDuration(),
                    programDTO.getFee()
            ));
        }
        return itemDTOS;

    }

    @Override
    public boolean delete(String id) throws Exception {
        return programBo.delete(id);
    }

    @Override
    public boolean update(ProgramDto programDTO) throws Exception {
        return programBo.update(new Program(
                programDTO.getPid(),
                programDTO.getProgram(),
                programDTO.getDuration(),
                programDTO.getFee()
        ));
    }
}
