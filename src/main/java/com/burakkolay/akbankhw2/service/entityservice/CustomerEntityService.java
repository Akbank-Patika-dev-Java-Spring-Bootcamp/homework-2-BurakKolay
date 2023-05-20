package com.burakkolay.akbankhw2.service.entityservice;

import com.burakkolay.akbankhw2.dao.CustomerRepository;
import com.burakkolay.akbankhw2.dto.customer.CustomerDeleteRequest;
import com.burakkolay.akbankhw2.dto.customer.CustomerUpdateRequest;
import com.burakkolay.akbankhw2.entity.Customer;
import com.burakkolay.akbankhw2.general.BaseEntityService;
import com.burakkolay.akbankhw2.general.BusinessException;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class CustomerEntityService extends BaseEntityService<Customer, CustomerRepository> {

    public CustomerEntityService(CustomerRepository repository) {
        super(repository);
    }

    public void delete(CustomerDeleteRequest request){
        Customer customer = getRepository().findCustomerByUsername(request.username());
        if(Objects.equals(customer.getPhone(), request.phoneNumber()))
            getRepository().deleteById(customer.getId());
    }

    public Customer findByUsername(String username){
        return getRepository().findCustomerByUsername(username);
    }

    public Customer update(Long id,CustomerUpdateRequest request){
        Customer customer = getRepository().findById(id).orElseThrow();
        customer.setEmail(request.email());
        customer.setUsername(request.username());
        customer.setPhone(request.phone());
        getRepository().save(customer);
        return customer;
    }
}
