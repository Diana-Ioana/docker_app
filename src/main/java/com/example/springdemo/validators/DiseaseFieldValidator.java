package com.example.springdemo.validators;

import com.example.springdemo.dto.DiseaseDTO;
import com.example.springdemo.errorhandler.IncorrectParameterException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.List;

public class DiseaseFieldValidator { private static final Log LOGGER = LogFactory.getLog(DiseaseFieldValidator.class);
    private static final EmailFieldValidator EMAIL_VALIDATOR = new EmailFieldValidator() ;

    public static void validateInsertOrUpdate(DiseaseDTO personDTO) {

        List<String> errors = new ArrayList<>();
        if (personDTO == null) {
            errors.add("personDTO is null");
            throw new IncorrectParameterException(DiseaseDTO.class.getSimpleName(), errors);
        }
        if (!errors.isEmpty()) {
            LOGGER.error(errors);
            throw new IncorrectParameterException(DiseaseFieldValidator.class.getSimpleName(), errors);
        }
    }
}