package com.example.demo_new;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface BuddyInfoRepository extends CrudRepository<BuddyInfo, Long> {

    List<BuddyInfo> findByName(@Param("name") String name);

    List<BuddyInfo> findByPhoneNumber(@Param("phoneNumber") String phoneNumber);

    BuddyInfo findById(@Param("id") long id);

}
