package com.zhy.hxds.mis.api.service;

import com.zhy.hxds.common.util.PageUtils;
import com.zhy.hxds.mis.api.db.pojo.DeptEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public interface DeptService {
    public ArrayList<HashMap> searchAllDept();

    public PageUtils searchDeptByPage(Map param);

    public HashMap searchById(int id);

    public int insert(DeptEntity dept);

    public int update(DeptEntity dept);

    public int deleteDeptByIds(Integer[] ids);
}
