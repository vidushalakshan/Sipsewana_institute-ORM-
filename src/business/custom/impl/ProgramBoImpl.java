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
    public List<ProgramDto> find() {
        /*List<ProgramDto> list = programBo.find();
        ArrayList<ProgramDto> dtoArrayList = new ArrayList<>();

        ProgramDto programDTO = null;

        for (ProgramDto program : list
        ) {
            dtoArrayList.add(new ProgramDto(
                    programDTO.getPid(),
                    programDTO.getProgram(),
                    programDTO.getDuration(),
                    programDTO.getFee()
            ));

        }
        return dtoArrayList;*/

        return null;
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
