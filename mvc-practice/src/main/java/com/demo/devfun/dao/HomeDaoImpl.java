package com.demo.devfun.dao;

import java.util.List;
import java.util.Map;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HomeDaoImpl implements HomeDao{

    @Autowired
    SqlSessionTemplate template;

    public HomeDaoImpl(SqlSessionTemplate template) {
        super();
        this.template = template;
    }

    @Override
    public int getTestCount() {
        return template.selectOne("com.test.springTest.testxml.selectTest");
    }

    @Override
    public List<Map<String, Object>> getRequests() {
        return template.selectList("com.test.springTest.testxml.selectTest2");
    }
}
