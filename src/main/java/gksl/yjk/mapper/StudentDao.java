package gksl.yjk.mapper;


import gksl.yjk.entity.Student;
import org.apache.ibatis.annotations.Param;

public interface StudentDao {

    Student selectUser(int id);

    int insertStudent(Student student);

    int deleteStudent(int id);

    int updateStudent(@Param("name") String name, @Param("id") int id);

}
