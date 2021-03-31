package com.duying.service;

import com.duying.dao.GuestDao;
import com.duying.dao2.GuestDao2;
import com.duying.entity.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService {

    @Autowired
    private GuestDao guestDao;

    @Autowired
    private GuestDao2 guestDao2;

    public List<Guest> findAll(){
        return guestDao.findGuestAll();
       // return guestDao2.findGuestAll();
    }

}
