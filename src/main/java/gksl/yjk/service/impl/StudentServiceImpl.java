package gksl.yjk.service.impl;


import gksl.yjk.entity.Student;
import gksl.yjk.mapper.StudentDao;
import gksl.yjk.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao iUserDao;

    @Override
    public Student selectUser(int id) {
        return iUserDao.selectUser(id);
    }

    @Override
    public int insertStudent(Student student) {
        return iUserDao.insertStudent(student);
    }

    @Override
    public int deletestudent(int id) {
        return iUserDao.deleteStudent(id);
    }

    @Override
    public int updateStudent(String name, int id) {
        return iUserDao.updateStudent(name,id);
    }
}
