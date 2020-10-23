package com.everis.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
public class ReniecRequest {

  @NotNull(message = "Se requiere numero de documento")
  @Size(max = 8, min = 8, message = "Numero de documento debe ser de {min} digitos")
  private String document;

}
