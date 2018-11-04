package dong.controller;

import dong.beans.Student;
import dong.service.IStudentService;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class StudentController implements Controller {

    private IStudentService service;

    public void setService(IStudentService service) {
        this.service = service;
    }

    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws Exception {
        String name = request.getParameter("name");
        String ageStr = request.getParameter("age");
        Integer age = Integer.valueOf(ageStr);
        Student student = new Student(name, age);

        service.addStudent(student);
        return new ModelAndView("/welcome.jsp");
    }
}
