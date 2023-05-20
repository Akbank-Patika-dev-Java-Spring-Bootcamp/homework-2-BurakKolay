package com.burakkolay.akbankhw2.controller.contract;

import com.burakkolay.akbankhw2.dto.customer.CustomerDTO;
import com.burakkolay.akbankhw2.dto.customer.CustomerDeleteRequest;
import com.burakkolay.akbankhw2.dto.customer.CustomerSaveRequest;
import com.burakkolay.akbankhw2.dto.customer.CustomerUpdateRequest;

import java.util.List;

public interface CustomerControllerContract {

    CustomerDTO save(CustomerSaveRequest request);

    List<CustomerDTO> findAll();

    CustomerDTO findById(Long id);

    void delete(CustomerDeleteRequest request);
    CustomerDTO findByUsername(String username);
    CustomerDTO update(Long id, CustomerUpdateRequest request);
}
