package com.duying.dao;

import com.duying.entity.Guest;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GuestDao {


    @Select("select * from guest")
    List<Guest> findGuestAll();

}
