package com.Graduationdesign.dao;

import java.sql.Connection;

public interface UserCRUDDao<T> {
     T search(T t,Connection con); 
}