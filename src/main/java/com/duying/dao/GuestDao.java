package com.duying.dao;


import com.duying.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestDao extends JpaRepository<Guest,Long> {

}
