package com.zhy.hxds.mis.api.service.impl;

import com.zhy.hxds.mis.api.db.dao.PermissionDao;
import com.zhy.hxds.mis.api.service.PermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;

@Service
public class PermissionServiceImpl implements PermissionService {

    @Resource
    private PermissionDao permissionDao;

    @Override
    public ArrayList<HashMap> searchAllPermission() {
        ArrayList<HashMap> list = permissionDao.searchAllPermission();
        return list;
    }
}
