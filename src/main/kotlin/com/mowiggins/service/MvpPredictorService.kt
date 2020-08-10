package com.mowiggins.service

import com.mowiggins.client.BallDontLieClient
import com.mowiggins.domain.Player
import javax.inject.Singleton

@Singleton
class MvpPredictorService (
        private val ballDontLieClient: BallDontLieClient
){
    //finds the player with the highest player rating, which is the summation of most stats. This player will be named the MVP
    //ToDo create an endpoint that filters out all teams except the top 4 teams.
    fun predictMvp(): Player{
        var seasonAverages = ballDontLieClient.getSeasonAverages()
        seasonAverages.seasonData = seasonAverages.seasonData.filter {playerSeasonData -> playerSeasonData.games_played > 40}  // filters out players who have played below 40 games
        val mvpId = seasonAverages.seasonData.maxBy { playerSeasonData -> playerSeasonData.playerRating()}!!.player_id

        return ballDontLieClient.getPlayerById(mvpId)
    }









}
