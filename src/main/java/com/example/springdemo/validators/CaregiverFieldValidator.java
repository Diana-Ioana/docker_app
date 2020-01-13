package com.example.springdemo.validators;

import com.example.springdemo.dto.CaregiverDTO;
import com.example.springdemo.errorhandler.IncorrectParameterException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.List;

public class CaregiverFieldValidator {

    private static final Log LOGGER = LogFactory.getLog(CaregiverFieldValidator.class);
    private static final EmailFieldValidator EMAIL_VALIDATOR = new EmailFieldValidator() ;

    public static void validateInsertOrUpdate(CaregiverDTO personDTO) {

        List<String> errors = new ArrayList<>();
        if (personDTO == null) {
            errors.add("personDTO is null");
            throw new IncorrectParameterException(CaregiverDTO.class.getSimpleName(), errors);
        }
        if (personDTO.getCaregiverEmail() == null || !EMAIL_VALIDATOR.validate(personDTO.getCaregiverEmail())) {
            errors.add("Person email has invalid format");
        }

        if (!errors.isEmpty()) {
            LOGGER.error(errors);
            throw new IncorrectParameterException(CaregiverFieldValidator.class.getSimpleName(), errors);
        }
    }

}
