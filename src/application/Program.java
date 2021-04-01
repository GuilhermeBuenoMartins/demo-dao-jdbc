package application;

import model.dao.DB;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public class Program {

    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        departmentDao.delete(8);
        System.out.println("Delete complete!");
//        Department department = new Department(7, "Furnitures");
//        departmentDao.update(department);
//        System.out.println("Update complete!");
//        departmentDao.insert(department);
//        System.out.println("Insertion complete! Id = " + department.getId());
//        System.out.println(departmentDao.findById(department.getId()));
        List<Department> departmentList = departmentDao.findAll();
        departmentList.forEach(System.out::println);
        DB.closeConnection();
    }
}
