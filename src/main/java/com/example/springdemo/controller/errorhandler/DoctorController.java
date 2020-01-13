package com.example.springdemo.controller.errorhandler;

import com.example.springdemo.dto.DoctorDTO;
import com.example.springdemo.dto.dtoVIEWS.DoctorViewDTO;
import com.example.springdemo.entities.ApiResponse;
import com.example.springdemo.entities.Doctor;
import com.example.springdemo.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.print.Doc;
import java.util.List;
@RestController
@CrossOrigin
@RequestMapping(value = "/doctors")
public class DoctorController {

//
//        private final DoctorService personService;
//
//        @Autowired
//        public DoctorController(DoctorService personService) {
//            this.personService = personService;
//        }
//
//        @GetMapping(value = "/{id}")
//        public DoctorViewDTO findById(@PathVariable("id") Integer id){
//            return personService.findDoctorByIdDoctor(id);
//        }
//
//        @GetMapping()
//        public List<DoctorViewDTO> findAll(){
//            return personService.findAll();
//        }
//
//        @PostMapping()
//        public Integer insertUserDTO(@RequestBody DoctorDTO personDTO){
//            return personService.insert(personDTO);
//        }
//
//        @PutMapping()
//        public Integer updateUser(@RequestBody DoctorDTO personDTO) {
//            return personService.update(personDTO);
//        }
//
//        @DeleteMapping()
//        public void delete(@RequestBody DoctorViewDTO personViewDTO){
//            personService.delete(personViewDTO);
//        }


    @Autowired
    private DoctorService docService;

    @PostMapping
    public ApiResponse<Doctor> saveUser(@RequestBody DoctorDTO user){
        return new ApiResponse<>(HttpStatus.OK.value(), "User saved successfully.",docService.insert(user));
    }

    @GetMapping
    public ApiResponse<List<Doctor>> listUser(){
        return new ApiResponse<>(HttpStatus.OK.value(), "User list fetched successfully.",docService.findAll());
    }

    @GetMapping("/{id}")
    public ApiResponse<Doctor> getOne(@PathVariable int id){
        return new ApiResponse<>(HttpStatus.OK.value(), "User fetched successfully.",docService.findDoctorByIdDoctor(id));
    }

    @PutMapping("/{id}")
    public ApiResponse<DoctorDTO> update(@RequestBody DoctorDTO userDto) {
        return new ApiResponse<>(HttpStatus.OK.value(), "User updated successfully.",docService.update(userDto));
    }

    @DeleteMapping("/{id}")
    public ApiResponse<Void> deleteUser(@PathVariable int id) {
        docService.deleteUser(docService.findDoctorByIdDoctor(id));
        return new ApiResponse<>(HttpStatus.OK.value(), "User deleted successfully.", null);
    }





}
