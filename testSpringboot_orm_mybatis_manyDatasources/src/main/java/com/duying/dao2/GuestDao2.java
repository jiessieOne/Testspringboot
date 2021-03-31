package com.duying.dao2;

import com.duying.entity.Guest;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GuestDao2 {

    @Select("select * from guest")
    List<Guest> findGuestAll();

}
