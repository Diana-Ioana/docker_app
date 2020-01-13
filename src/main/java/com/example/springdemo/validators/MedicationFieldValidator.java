package com.example.springdemo.validators;

import com.example.springdemo.dto.MedicationDTO;
import com.example.springdemo.errorhandler.IncorrectParameterException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.List;

public class MedicationFieldValidator {
    private static final Log LOGGER = LogFactory.getLog(MedicationFieldValidator.class);
    private static final EmailFieldValidator EMAIL_VALIDATOR = new EmailFieldValidator() ;

    public static void validateInsertOrUpdate(MedicationDTO personDTO) {

        List<String> errors = new ArrayList<>();
        if (personDTO == null) {
            errors.add("MedicatonDTo is null");
            throw new IncorrectParameterException(MedicationDTO.class.getSimpleName(), errors);
        }

        if (!errors.isEmpty()) {
            LOGGER.error(errors);
            throw new IncorrectParameterException(MedicationFieldValidator.class.getSimpleName(), errors);
        }
    }
}
