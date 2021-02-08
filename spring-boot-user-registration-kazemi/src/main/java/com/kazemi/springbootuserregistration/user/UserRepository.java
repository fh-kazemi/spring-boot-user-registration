package com.kazemi.springbootuserregistration.user;

import com.kazemi.springbootuserregistration.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
interface UserRepository extends CrudRepository<User, Long> {

	Optional<User> findByEmail(String email);
}
