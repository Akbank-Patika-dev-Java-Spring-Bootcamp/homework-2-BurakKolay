package com.burakkolay.akbankhw2.general;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author bahadirmemis
 */
@Getter
@Setter
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
@RequiredArgsConstructor
public class BusinessException extends RuntimeException{

  private final BaseErrorMessage baseErrorMessage;
}
