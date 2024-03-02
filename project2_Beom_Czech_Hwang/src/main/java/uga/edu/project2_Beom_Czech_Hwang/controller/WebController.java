package uga.edu.project2_Beom_Czech_Hwang.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import uga.edu.project2_Beom_Czech_Hwang.model.Query1;
import uga.edu.project2_Beom_Czech_Hwang.model.Query2;
import uga.edu.project2_Beom_Czech_Hwang.model.Query3;
import uga.edu.project2_Beom_Czech_Hwang.model.Query4;
import uga.edu.project2_Beom_Czech_Hwang.model.Query5;
import uga.edu.project2_Beom_Czech_Hwang.model.Query6;
import uga.edu.project2_Beom_Czech_Hwang.service.EmployeeService;

/**
 * Controller handling web requests to the dynamic section of the application.
 * It interacts with the EmployeeService to retrieve and manipulate employee data.
 */
@Controller
@RequestMapping("dynamic")
public class WebController {

    private final EmployeeService employeeService;

    /**
     * Constructs a WebController with a specified EmployeeService.
     * @param employeeService The service used for handling employee-related queries and operations.
     */
    @Autowired
    public WebController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    /**
     * Displays the home page with a welcome message.
     * @return ModelAndView containing view name and model data.
     */
    @GetMapping("/home")
    public ModelAndView homePage() {
        ModelAndView mv = new ModelAndView("Home");
        mv.addObject("message", "Welcome to our application!");
        return mv;
    }

    /**
     * Retrieves the results for Query1 from the EmployeeService and returns them.
     * @return ResponseEntity containing the list of Query1 results or an error message.
     */
    @GetMapping("/query1")
    public ResponseEntity<?> getQuery1Results() {
        try {
            List<Query1> results = employeeService.getQuery1Results();
            return ResponseEntity.ok(results);
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An error occurred while processing the request.");
        }
    }

    /**
     * Retrieves the results for Query2 from the EmployeeService and returns them.
     * @return ResponseEntity containing the list of Query2 results or an error message.
     */
    @GetMapping("/query2")
    public ResponseEntity<?> getQuery2Results() {
        try {
            List<Query2> results = employeeService.getQuery2Results();
            return ResponseEntity.ok(results);
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An error occurred while processing the request.");
        }
    }

    /**
     * Retrieves the results for Query3 from the EmployeeService and returns them.
     * @return ResponseEntity containing the list of Query3 results or an error message.
     */
    @GetMapping("/query3")
    public ResponseEntity<?> getQuery3Results() {
        try {
            List<Query3> results = employeeService.getQuery3Results();
            return ResponseEntity.ok(results);
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An error occurred while processing the request.");
        }
    }

    /**
     * Retrieves the results for Query4 from the EmployeeService and returns them.
     * @return ResponseEntity containing the list of Query4 results or an error message.
     */
    @GetMapping("/query4")
    public ResponseEntity<?> getQuery4Results() {
        try {
            List<Query4> results = employeeService.getQuery4Results();
            return ResponseEntity.ok(results);
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An error occurred while processing the request.");
        }
    }

    /**
     * Processes a POST request for Query5, extracting name parameters and retrieving results.
     * @param names Map containing the names parameters needed for the query.
     * @return ResponseEntity containing the list of Query5 results or an error message.
     */
    @PostMapping("/query5")
    public ResponseEntity<?> getQuery5Results(@RequestBody Map<String, String> names) {
        try {
            List<Query5> results = employeeService.getQuery5Results(names.get("firstName1"), names.get("lastName1"), names.get("firstName2"), names.get("lastName2"));
            return ResponseEntity.ok(results);
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An error occurred while processing the request.");
        }
    }

    /**
     * Processes a POST request for Query6, extracting name parameters and retrieving results.
     * @param names Map containing the names parameters needed for the query.
     * @return ResponseEntity containing the list of Query6 results or an error message.
     */
    @PostMapping("/query6")
    public ResponseEntity<?> getQuery6Results(@RequestBody Map<String, String> names) {
        try {
            List<Query6> results = employeeService.getQuery6Results(names.get("firstName1"), names.get("lastName1"), names.get("firstName2"), names.get("lastName2"));
            return ResponseEntity.ok(results);
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An error occurred while processing the request.");
        }
    }

}
