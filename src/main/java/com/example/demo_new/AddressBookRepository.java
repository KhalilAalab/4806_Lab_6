package com.example.demo_new;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface AddressBookRepository extends CrudRepository<AddressBook, Long> {

    AddressBook findById(@Param("id") long id);

}
