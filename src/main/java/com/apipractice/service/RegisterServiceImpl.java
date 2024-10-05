package com.apipractice.service;

import com.apipractice.entity.Register;
import com.apipractice.repository.RegisterRepository;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService{

    private RegisterRepository registerRepository;

    public RegisterServiceImpl(RegisterRepository registerRepository) {
        this.registerRepository = registerRepository;
    }

    @Override
    public Register createRegister(Register register) {
       Register savedentity= registerRepository.save(register);
       return savedentity;
    }
}
