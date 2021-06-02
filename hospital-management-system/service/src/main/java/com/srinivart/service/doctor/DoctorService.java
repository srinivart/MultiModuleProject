package com.srinivart.service.doctor;

import com.srinivart.dao.doctor.DoctorRepository;
import com.srinivart.mailService.EmailService;
import com.srinivart.model.doctor.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository repository;

    @Autowired
    private EmailService service;

   @PostConstruct
   public void initDoctor(){
       repository.saveAll(Stream.of(
               new Doctor(1,"srini","developer"),
               new Doctor(2,"sahi","qa"))
               .collect(Collectors.toList()));
   }


   public List<Doctor> getDoctors(){
       service.sendEmail();
       return repository.findAll();
   }

}
