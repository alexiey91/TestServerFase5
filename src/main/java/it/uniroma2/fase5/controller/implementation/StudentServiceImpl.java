package it.uniroma2.fase5.controller.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import it.uniroma2.fase5.controller.StudentService;
import it.uniroma2.fase5.model.Problem;
import it.uniroma2.fase5.model.Student;
import it.uniroma2.fase5.model.rest.DTOresponse;
import it.uniroma2.fase5.repositories.ProblemRepository;
import it.uniroma2.fase5.repositories.StudentRepository;

@Service("StudentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	ProblemRepository problemRepository;
	
	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public ResponseEntity<DTOresponse> createStudent(String name, String surname, String problemcause) {
	
		Student student = new Student(name, surname);
		Problem problem = new Problem(problemcause);
		
		problemRepository.save(problem);
		
		student.setProblem(problem);
		
		studentRepository.save(student);
		
		DTOresponse dtoresponse = new DTOresponse();
		dtoresponse.setStudentid(student.getId());
		dtoresponse.setStudentname(student.getName());
		dtoresponse.setStudentsurname(student.getSurname());
		dtoresponse.setProblemid(student.getProblem().getId());
		
		ResponseEntity<DTOresponse> response = new ResponseEntity<DTOresponse>(dtoresponse,HttpStatus.OK);
		
		
		return response;
	}

	@Override
	public ResponseEntity<DTOresponse> updateStudent(String id,String name, String surname, String problemcause) {
	
		Student student = new Student(name, surname);
		Problem problem = new Problem(problemcause);
		List<Student> students = studentRepository.findAll();
		List<Problem> problems = problemRepository.findAll();
		
		int i=0;
		for(Problem p:problems){
			if(p.getCause().equals(problemcause)){
				problem.setId(p.getId());
				break;
			}
			i++;
		}
		if(i==problems.size())
			problemRepository.save(problem);
		
		
		for(Student s:students){
			if(s.getId().equals(id))
				studentRepository.delete(s.getId());
		}
		student.setProblem(problem);
		studentRepository.save(student);
		
		DTOresponse dtoresponse = new DTOresponse();
		
		dtoresponse.setStudentname(student.getName());
		dtoresponse.setStudentsurname(student.getSurname());
		
		
		ResponseEntity<DTOresponse> response = new ResponseEntity<DTOresponse>(dtoresponse,HttpStatus.OK);
		
		
		return response;
	}


	@Override
	public ResponseEntity<DTOresponse> getStudents() {
		
		List<Student> students = studentRepository.findAll();
		
		DTOresponse dtoresponse = new DTOresponse();
		dtoresponse.setStudents(students);
		
		ResponseEntity<DTOresponse> response = new ResponseEntity<DTOresponse>(dtoresponse,HttpStatus.OK);	
		
		return response;
		
	}


	@Override
	public ResponseEntity<DTOresponse> getStudentsByName(String name) {
		
		List<Student> students = studentRepository.findAll();
		List<Student> stud = new ArrayList<Student>();

		for(Student s:students){
		
			if (s.getName().equals(name))
				stud.add(s);		
			
		}
		DTOresponse dtoresponse = new DTOresponse();
		dtoresponse.setStudents(stud);
		
		ResponseEntity<DTOresponse> response = new ResponseEntity<DTOresponse>(dtoresponse,HttpStatus.OK);	
		
		return response;
		
	}

}
