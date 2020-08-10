package com.mowiggins.controller

import com.mowiggins.domain.Player
import com.mowiggins.service.DpoyPredictorService
import com.mowiggins.service.MvpPredictorService
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Controller

@Controller("/nba_predictor_api/v1")
class Controller (
  private val dpoyPredictorService: DpoyPredictorService,
  private val mvpPredictorService: MvpPredictorService
){

  @Get("/players/dpoy")
  fun getDpoy(): Player {
    return dpoyPredictorService.predictDpoy()
  }

  @Get("/players/mvp")
  fun getMvp(): Player{
    return mvpPredictorService.predictMvp()
  }


}