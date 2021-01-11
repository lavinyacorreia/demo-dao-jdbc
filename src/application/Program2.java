package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Department by id:");
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department department = departmentDao.findById(2);
		System.out.println(department);
		
		System.out.println("Department Find All");		
		List<Department> list = departmentDao.findAll();
		for (Department obj : list){
			System.out.println(obj);
		}

		System.out.println("Department Insert");
		System.out.println("\n=== TEST 3: insert =======");
		Department newDepartment = new Department(null, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id: " + newDepartment.getId());
		
		departmentDao.update(department);
		
		System.out.println("Enter the id to delete: ");
		int id = sc.nextInt();		
		departmentDao.deleteById(id);
		
		sc.close();
		
	}

}
