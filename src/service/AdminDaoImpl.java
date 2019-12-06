package service;

import mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Admin;
@Service
public class AdminDaoImpl implements AdminDao {
    @Autowired
    AdminMapper adminMapper;
    @Override
    public Admin Login(Admin admin) {
        return null;
    }
}
