package cn.gs.service;

import cn.gs.dao.PersonDao;

import javax.annotation.Resource;

/**
 * @Author: gaoshuai
 * @Date: 2018/5/9 16:32
 * @Version 1.0
 */
public class PersonService {
    @Resource
    private PersonDao personDao;

    public PersonDao getPersonDao() {
        return personDao;
    }

    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }


    public PersonService(PersonDao personDao2) {
        System.out.println("构造方法注入");
        this.personDao = personDao2;
    }

    public PersonService() {
        System.out.println("空的构造方法");
    }

    public String selectPersonInfo() {
        return personDao.selectPersonInfo();
    }
}
