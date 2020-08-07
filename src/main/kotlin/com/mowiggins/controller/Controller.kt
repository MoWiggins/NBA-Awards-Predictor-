package com.mowiggins.controller

import com.mowiggins.domain.Player
import com.mowiggins.service.DpoyPredictorService
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Controller

@Controller("/nba_predictor_api/v1")
class Controller (
  private val dpoyPredictorService: DpoyPredictorService
){

  @Get("/players/dpoy")
  fun getDpoy(): Player {
    return dpoyPredictorService.predictDpoy()
  }



}