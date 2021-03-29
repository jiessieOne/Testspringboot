package com.duying.service;

import com.duying.dao.GuestDao;
import com.duying.entity.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService {

    @Autowired
    private GuestDao guestDao;

    public List<Guest> findAll(){
        return guestDao.findGuestAll();
    }

}
