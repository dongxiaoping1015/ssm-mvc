package dong.service;

import dong.beans.Student;
import dong.dao.IStudentDao;

public class StudentServiceImpl implements IStudentService {
    private IStudentDao dao;

    public void setDao(IStudentDao dao) {
        this.dao = dao;
    }

    @Override
    public void addStudent(Student student) {
        dao.insertStudent(student);
    }
}
