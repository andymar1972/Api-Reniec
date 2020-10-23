package com.everis.service;

import com.everis.constant.Constant;
import com.everis.request.ReniecRequest;
import com.everis.response.ReniecResponse;
import org.springframework.stereotype.Service;

@Service
public class ReniecServiceImpl implements ReniecService {

  @Override
  public ReniecResponse validate(ReniecRequest reniecRequest) {

    ReniecResponse reniecResponse = new ReniecResponse();
    reniecResponse.setEntityName(Constant.ENTITY_NAME);
    reniecResponse.setSucces(Constant.SUCCES);

    return reniecResponse;
  }

}
