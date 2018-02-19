package com.rte.bob.collecting.service.processor.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.rte.bob.collecting.model.Offre;


public abstract class OffreValidator implements Validator {
    public boolean supports(Class<?> aClass) {
        return aClass==Offre.class;
    }

    public void validate(Object o, Errors errors) {
    	Offre offre = (Offre)o;
        if(offre.getEda() == null){
            errors.rejectValue("Eda", "Eda est null");
        } else if (offre.getReference_offre() == null) {
        	errors.rejectValue("reference offre", "reference offre null");
        }
    }
}