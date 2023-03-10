package br.com.zupacademy.gabrielf.casadocodigo.validation;


import br.com.zupacademy.gabrielf.casadocodigo.modelo.dto.AutorDtoEntrada;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UniqueEmailValidation.class)
public @interface UniqueEmail {

    String message() default "email nao unico";
    Class<?>[] groups() default {};
    public abstract Class<? extends Payload>[] payload() default {};
}
