package com.dosu04.svelteSpringCrud.repositories;

import com.dosu04.svelteSpringCrud.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

}
