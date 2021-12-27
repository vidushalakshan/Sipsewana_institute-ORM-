package business.custom.impl;

import business.custom.StudentBo;
import dao.DaoFactory;
import dao.DaoType;
import dto.StudentDto;

import java.util.ArrayList;
import java.util.List;

public class StudentBoImpl implements StudentBo {

    StudentBoImpl studentBo = DaoFactory.getInstance().getDAO(DaoType.PROGRAM);


    @Override
    public boolean add(StudentDto studentDTO) {
        return studentBo.add(new StudentDto(
           studentDTO.getRegnum(),
           studentDTO.getStudentname(),
           studentDTO.getStudentnum(),
           studentDTO.getEmail(),
           studentDTO.getMobilenum(),
           studentDTO.getBirthday(),
           studentDTO.getGender(),
           studentDTO.getNic()
        ));
    }

    @Override
    public List<StudentDto> find() {
        List<StudentDto> list = studentBo.find();
        ArrayList<StudentDto> dtoArrayList = new ArrayList<>();

        StudentDto studentDTO = null;

        for (StudentDto student : list
        ) {
            dtoArrayList.add(new StudentDto(
                    studentDTO.getRegnum(),
                    studentDTO.getStudentname(),
                    studentDTO.getStudentnum(),
                    studentDTO.getEmail(),
                    studentDTO.getMobilenum(),
                    studentDTO.getBirthday(),
                    studentDTO.getGender(),
                    studentDTO.getNic()
            ));

        }
        return dtoArrayList;
    }

    @Override
    public boolean delete(String id) {
        return studentBo.delete(id);
    }

    @Override
    public boolean update(StudentDto studentDTO) {
        return studentBo.update(new StudentDto(
                studentDTO.getRegnum(),
                studentDTO.getStudentname(),
                studentDTO.getStudentnum(),
                studentDTO.getEmail(),
                studentDTO.getMobilenum(),
                studentDTO.getBirthday(),
                studentDTO.getGender(),
                studentDTO.getNic()
        ));
    }
}
