package com.mowiggins.service

import com.mowiggins.client.BallDontLieClient
import com.mowiggins.domain.Player
import javax.inject.Singleton

@Singleton
class DpoyPredictorService (
  private val ballDontLieClient: BallDontLieClient
){
  fun predictDpoy(): Player {
    var seasonAverages = ballDontLieClient.getSeasonAverages()  //grabbing all the season averages from client and storing it in a variable, now we can look through and do stuff

    seasonAverages.seasonData = seasonAverages.seasonData.filter {playerSeasonData -> playerSeasonData.games_played > 30  } //filters out players that have played more than 30 games in season

    val dpoyId = seasonAverages.seasonData.maxBy { playerSeasonData -> playerSeasonData.defensiveScore()}!!.player_id       // finds the playerID with the max defensiveScore
    return ballDontLieClient.getPlayerById(dpoyId)
  }


}