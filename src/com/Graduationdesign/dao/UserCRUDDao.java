package com.Graduationdesign.dao;

import java.sql.Connection;

public interface UserCRUDDao<T> {
     T search(T t,Connection con);
     T delete(T t,Connection con);
     T change(T t,Connection con);
     T add(T t,Connection con);
}