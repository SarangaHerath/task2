package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

public class CustomerItemProcessor implements ItemProcessor<Customer, Customer> {

    private static final Logger log = LoggerFactory.getLogger(CustomerItemProcessor.class);

   // private static int counter=1;
    @Override
    public Customer process(final Customer customer) throws Exception {

           int age= customer.getAge();
           if(age<=18 || age>=100){
               log.error("Wrong age range customer "+customer.getFirstName()+" Age "+age);
           }
//        final String firstName = customer.getFirstName().toUpperCase();
//        final String lastName = customer.getLastName().toUpperCase();
//        customer.setFirstName(firstName);
//        customer.setLastName(lastName);
       // final Customer transformedCustomer = new Customer(firstName, lastName);
//        final Customer transformedCustomer = new Customer();
//        counter=counter+1;
//        transformedCustomer.setId(counter);
        //  Person person=new Person(firstName,lastName);

       // log.info("Converting (" + customer + ") into (" + transformedCustomer + ")");
         //return person;
        return customer;
    }

}
