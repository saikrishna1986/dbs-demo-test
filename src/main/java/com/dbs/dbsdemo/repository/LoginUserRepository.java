package com.dbs.dbsdemo.repository;

import com.dbs.dbsdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LoginUserRepository extends JpaRepository<User,Integer> {

    public User findByNameAndPassword(String name, String password);
}
