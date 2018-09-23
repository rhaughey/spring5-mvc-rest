package guru.springfamework.api.v1.mapper;

import guru.springfamework.api.v1.model.CustomerDTO;
import guru.springfamework.domain.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerMapperTest {

    public static final Long id = 1L;
    public static final String firstName = "Saul";
    public static final String lastName = "Goodman";
    public static final String url = "betterCallSaul.com";
    CustomerMapper customerMapper = CustomerMapper.INSTANCE;

    @Test
    public void customerToCustomerDTO() {

        //given
        Customer customer = new Customer();
        customer.setId(id);
        customer.setFirstname(firstName);
        customer.setLastname(lastName);

        //when
        CustomerDTO customerDTO = customerMapper.customerToCustomerDTO(customer);

        //then
        assertEquals(firstName, customerDTO.getFirstname());
        assertEquals(lastName, customerDTO.getLastname());


    }
}