package rmit.rmitsb.contrller;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rmit.rmitsb.model.Admin;
import rmit.rmitsb.model.Employee;
import rmit.rmitsb.model.Item;
import rmit.rmitsb.model.Job;
import rmit.rmitsb.repository.AdminRepository;
import rmit.rmitsb.service.AdminService;
import rmit.rmitsb.service.EmployeeService;
import rmit.rmitsb.service.ItemService;
import rmit.rmitsb.service.JobService;

import java.io.IOException;
import java.util.*;
import java.io.FileReader;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(path = "/admin", method = RequestMethod.GET)
    public List<Admin> getAllAdmin(){
        return adminService.getAllAdmin();
    }

    @RequestMapping(path = "/admin", method = RequestMethod.POST)
    public void addAdmin(@RequestBody Admin admin){
        adminService.saveAdmin(admin);
    }

    @RequestMapping(path = "/admin", method = RequestMethod.PUT)
    public void updateAdmin(@RequestBody Admin admin){
        adminService.saveAdmin(admin);
    }

    @RequestMapping(path = "/admin/{id}", method = RequestMethod.DELETE)
    public void deleteAdmin(@PathVariable(value = "id") Long id){
        adminService.deleteAdmin(id);
    }

    @RequestMapping(path = "/admin/{id}", method = RequestMethod.GET)
    public Admin getAdmin(@PathVariable(value = "id") Long id){
        return adminService.getAdmin(id);
    }

    @RequestMapping(path = "/getAdmin", method =  RequestMethod.GET)
    public List<Admin> getFilterAdmin (@RequestParam String page){
        List<Admin> admins = new ArrayList<Admin>();
        List<Admin> allAdmin = getAllAdmin();
        for (int i = (Integer.parseInt(page) -1 ) *10; i <( (Integer.parseInt(page) -1 ) *10 )+10;i++ ){
            admins.add(allAdmin.get(i));
        }
        return admins;
    }

    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public Admin loginAdmin(@RequestBody Map<String, Object> map){
        String email = (String) map.get("email");
        String password = (String) map.get("password");
        System.out.println("admin" + email);
        System.out.println(password);
        List<Admin> admins =  adminService.getAllAdmin();
        for(Admin admin: admins){
            if (admin.getEmail().equals(email)){
                if (admin.getPassword().equals(password)){
                    return admin;
                }
            }
        }
        return null;
    }



}
