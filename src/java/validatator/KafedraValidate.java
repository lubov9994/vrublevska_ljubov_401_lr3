/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validatator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author Администратор
 */
public class KafedraValidate implements ConstraintValidator<KafedraValid, Integer>{

    @Override
    public void initialize(KafedraValid constraintAnnotation) {
        
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        return value.compareTo(100) < 0 && value.compareTo(0) > 0;
    }
    
}
