package com.hlong.oa.dao;

import com.hlong.oa.entity.Department;

public interface DepartmentDao {
    public Department selectById(Long departmentId);
}
