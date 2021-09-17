package com.myprj.prj.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Mapper
public interface  UserDAO {
    List<HashMap<String, Object>>  selectUsers(HashMap<String, Object> map) throws Exception;
}
