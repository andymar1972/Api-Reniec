package com.everis.apis;

import com.everis.request.ReniecRequest;
import com.everis.response.ReniecResponse;
import com.everis.service.ReniecService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReniecApi {

  @Autowired
  ReniecService reniecService;
  
  @PostMapping("/external/reniec/validate")
  public ReniecResponse validate(@RequestBody @Valid ReniecRequest reniecRequest) {
    return reniecService.validate(reniecRequest);
  }

}
