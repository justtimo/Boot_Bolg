package com.wby.jpa.reponsitory;

import com.wby.jpa.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserReponstory extends CrudRepository<User, Long> {
}
