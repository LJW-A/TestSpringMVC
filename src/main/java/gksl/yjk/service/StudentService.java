package gksl.yjk.service;


import gksl.yjk.entity.Student;
import org.apache.ibatis.annotations.Param;

public interface StudentService {

    public Student selectUser(int id);

    public int insertStudent(Student student);

    public int deletestudent(int id);

    int  updateStudent(@Param("name") String name, @Param("id") int id);
}
