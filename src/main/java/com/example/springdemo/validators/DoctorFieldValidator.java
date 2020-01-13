package com.example.springdemo.validators;

import com.example.springdemo.dto.DoctorDTO;
import com.example.springdemo.errorhandler.IncorrectParameterException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import  com.example.springdemo.validators.EmailFieldValidator;
import java.util.ArrayList;
import java.util.List;

public class DoctorFieldValidator{

    private static final Log LOGGER = LogFactory.getLog(DoctorFieldValidator.class);
    private static final EmailFieldValidator EMAIL_VALIDATOR = new EmailFieldValidator() ;

    public static void validateInsertOrUpdate(DoctorDTO personDTO) {

        List<String> errors = new ArrayList<>();
        if (personDTO == null) {
            errors.add("personDTO is null");
            throw new IncorrectParameterException(DoctorDTO.class.getSimpleName(), errors);
        }
        if (personDTO.getDoctorEmail() == null || !EMAIL_VALIDATOR.validate(personDTO.getDoctorEmail())) {
            errors.add("Person email has invalid format");
        }

        if (!errors.isEmpty()) {
            LOGGER.error(errors);
            throw new IncorrectParameterException(DoctorFieldValidator.class.getSimpleName(), errors);
        }
    }
}
