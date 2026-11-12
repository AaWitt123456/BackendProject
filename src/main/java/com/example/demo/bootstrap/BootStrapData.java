package com.example.demo.bootstrap;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.dao.DivisionRepository;
import com.example.demo.entities.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class BootStrapData implements CommandLineRunner {

    private CustomerRepository customerRepository;
    private DivisionRepository divisionRepository;

    public BootStrapData(CustomerRepository customerRepository, DivisionRepository divisionRepository) {
        this.customerRepository = customerRepository;
        this.divisionRepository = divisionRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if (customerRepository.count() == 1) {


            Customer customer1 = new Customer();
            customer1.setFirstName("Andy");
            customer1.setLastName("Mink");
            customer1.setPostal_code("56178");
            customer1.setAddress("123 Andy Street");
            customer1.setPhone("1234567890");
            customer1.setDivision(divisionRepository.findAll().get(2));
            customerRepository.save(customer1);


            Customer customer2 = new Customer();
            customer2.setFirstName("Bob");
            customer2.setLastName("Larson");
            customer2.setPostal_code("02937");
            customer2.setAddress("3455 West Street");
            customer2.setPhone("0985671234");
            customer2.setDivision(divisionRepository.findAll().get(3));
            customerRepository.save(customer2);


            Customer customer3 = new Customer();
            customer3.setFirstName("Carly");
            customer3.setLastName("Windsor");
            customer3.setPostal_code("102975");
            customer3.setAddress("038 Park Street");
            customer3.setPhone("0299461209");
            customer3.setDivision(divisionRepository.findAll().get(5));
            customerRepository.save(customer3);

            Customer customer4 = new Customer();
            customer4.setFirstName("Danny");
            customer4.setLastName("Danson");
            customer4.setPostal_code("10268");
            customer4.setAddress("1029 Park Street");
            customer4.setPhone("9280984687");
            customer4.setDivision(divisionRepository.findAll().get(7));
            customerRepository.save(customer4);

            Customer customer5 = new Customer();
            customer5.setFirstName("Erica");
            customer5.setLastName("Ericsson");
            customer5.setPostal_code("10298");
            customer5.setAddress("039 Windsor Drive");
            customer5.setPhone("0398619465");
            customer5.setDivision(divisionRepository.findAll().get(9));
            customerRepository.save(customer5);


        }

    }

}
