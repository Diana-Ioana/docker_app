package com.example.springdemo.validators;

import com.example.springdemo.dto.PatientDTO;
import com.example.springdemo.errorhandler.IncorrectParameterException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.List;

public class PatientFieldValidator {
    private static final Log LOGGER = LogFactory.getLog(PatientFieldValidator.class);
    private static final EmailFieldValidator EMAIL_VALIDATOR = new EmailFieldValidator() ;

    public static void validateInsertOrUpdate(PatientDTO personDTO) {

        List<String> errors = new ArrayList<>();
        if (personDTO == null) {
            errors.add("personDTO is null");
            throw new IncorrectParameterException(PatientDTO.class.getSimpleName(), errors);
        }
        if (personDTO.getPatientEmail() == null || !EMAIL_VALIDATOR.validate(personDTO.getPatientEmail())) {
            errors.add("Person email has invalid format");
        }

        if (!errors.isEmpty()) {
            LOGGER.error(errors);
            throw new IncorrectParameterException(PatientFieldValidator.class.getSimpleName(), errors);
        }
    }


}
