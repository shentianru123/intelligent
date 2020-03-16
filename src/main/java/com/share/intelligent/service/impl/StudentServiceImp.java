package com.share.intelligent.service.impl;

import com.share.intelligent.dao.StudentDao;
import com.share.intelligent.entity.Student;
import com.share.intelligent.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImp implements StudentService {

    @Autowired
    private StudentDao dao;

    @Override
    public Student queryStudentBySno(String sno) {
        return this.dao.queryStudentBySno(sno);
    }
}
