package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.Classes;
import com.demo.dao.ClassesDao;

@Service
public class ClassesServiceImpl implements ClassesService {
    @Autowired
    private ClassesDao classesDao;

    @Override
    public List<Classes> getAllClasses() {
        return classesDao.findAll();
    }

    @Override
    public Classes getById(long id) {
        Optional<Classes> clazz = classesDao.findById(id);
        return clazz.orElse(null);
    }
    
	@Override
	public Classes getByName(String id) {
		
		return classesDao.findByName(id);
	}
    

    @Override
    public int addClass(Classes clazz) {
        Classes savedClass = classesDao.save(clazz);
        return savedClass != null ? 1 : 0;
    }


    @Override
    public void deleteById(long id) {
        classesDao.deleteById(id);
    }

	@Override
	public List<Classes> findClassesByStaff(String staffid) {

		return classesDao.findClassesByStaff(staffid);
	}


}
