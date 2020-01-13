package com.example.springdemo.validators;

import com.example.springdemo.dto.MedicalRecordDTO;
import com.example.springdemo.errorhandler.IncorrectParameterException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.List;

public class MedicalRecordFieldValidator {
    private static final Log LOGGER = LogFactory.getLog(MedicalRecordFieldValidator.class);
    private static final EmailFieldValidator EMAIL_VALIDATOR = new EmailFieldValidator() ;

    public static void validateInsertOrUpdate(MedicalRecordDTO personDTO) {

        List<String> errors = new ArrayList<>();
        if (personDTO == null) {
            errors.add("personDTO is null");
            throw new IncorrectParameterException(MedicalRecordDTO.class.getSimpleName(), errors);
        }
        if (!errors.isEmpty()) {
            LOGGER.error(errors);
            throw new IncorrectParameterException(MedicalRecordFieldValidator.class.getSimpleName(), errors);
        }
    }

}
