package br.com.cotiinformatica.domain.dtos;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.List;

@Data
public class ErrorResponseDto {

    private HttpStatus status;
    private List<String> errors;
}
