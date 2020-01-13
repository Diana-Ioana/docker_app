package com.example.springdemo.validators;

import com.example.springdemo.dto.MedicationPlanDTO;
import com.example.springdemo.errorhandler.IncorrectParameterException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.List;

public class MedicationPlanFieldValidator {
    private static final Log LOGGER = LogFactory.getLog(MedicationPlanFieldValidator.class);
    private static final EmailFieldValidator EMAIL_VALIDATOR = new EmailFieldValidator() ;

    public static void validateInsertOrUpdate(MedicationPlanDTO personDTO) {

        List<String> errors = new ArrayList<>();
        if (personDTO == null) {
            errors.add("MediactionPlanDTO is null");
            throw new IncorrectParameterException(MedicationPlanDTO.class.getSimpleName(), errors);
        }

        if (!errors.isEmpty()) {
            LOGGER.error(errors);
            throw new IncorrectParameterException(MedicationPlanFieldValidator.class.getSimpleName(), errors);
        }
    }

}
