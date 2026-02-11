package com.example.mohan_schools.service;

import com.example.mohan_schools.contants.MohanSchoolConstants;
import com.example.mohan_schools.model.Person;
import com.example.mohan_schools.model.Roles;
import com.example.mohan_schools.repository.PersonRepository;
import com.example.mohan_schools.repository.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private RolesRepository rolesRepository;

    public boolean createNewPerson(Person person){
        boolean isSaved = false;
        Roles role = rolesRepository.getByRoleName(MohanSchoolConstants.STUDENT_ROLE);
        person.setRoles(role);
        person = personRepository.save(person);
        if (null != person && person.getPersonId() > 0)
        {
            isSaved = true;
        }
        return isSaved;
    }
}
