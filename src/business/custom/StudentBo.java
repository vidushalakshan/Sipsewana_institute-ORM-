package business.custom;

import business.SuperBo;
import dto.StudentDto;

import java.util.List;

public interface StudentBo extends SuperBo {
    boolean add(StudentDto studentDTO);

    List<StudentDto> find();

    boolean delete(String id);

    boolean update(StudentDto studentDTO);
}
