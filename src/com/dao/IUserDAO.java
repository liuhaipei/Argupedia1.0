package com.dao;

import com.entity.UserEntity;
import java.util.*;

public interface IUserDAO {
    public UserEntity getUser(String username);
    public List<UserEntity> getUsers();

}
