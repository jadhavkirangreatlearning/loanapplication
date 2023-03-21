package com.csi.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Customer{

    private int custId;
    private String custName;
    private double custAccountBalance;
    private long custContactNumber;


}
@RestController
@RequestMapping("/v1")
public class CustomerController {
    @GetMapping("/getcustlist")
    public ResponseEntity<List<Customer>>getCustList(){
        return ResponseEntity.ok(Stream.of(new Customer(121,"Akshay", 10000, 878787887),
                new Customer(122,"Vaibhav",11000, 57576767)).collect(Collectors.toList()));
    }

    @GetMapping("/business")
    public String sayBusiness(){
        return "APP DEVELOPMENT";
    }

    @GetMapping("/hello")
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Welcome to Intellij");
    }

}
