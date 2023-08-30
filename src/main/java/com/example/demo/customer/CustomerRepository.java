package com.example.demo.customer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Primary
@Component
public class CustomerRepository implements CustomerRepo {
    @Override
    public List<Customer> getCustomers() {
    // TODO connect to real db
    return Collections.emptyList(); // this class will be used to connect to real data
}
}
