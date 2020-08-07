package com.mowiggins.client

import com.mowiggins.domain.NbaStatsData
import com.mowiggins.domain.Player
import com.mowiggins.domain.PlayerSeasonData
import com.mowiggins.domain.SeasonAveragesData
import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client

@Client("balldontlie")
interface BallDontLieClient {
  //micronaut query to grab data, this function will grab all player stats from the reg season in a given season
  @Get("https://www.balldontlie.io/api/v1/stats?seasons[]=2018&postseason=false&per_page=100")
  fun getPlayerStats(): NbaStatsData



//grabbing all season average from 2018, ?season=2018 is a filter
  @Get("https://www.balldontlie.io/api/v1/season_averages?season=2018")
    fun getSeasonAverages(): SeasonAveragesData


  //get player by Id
  @Get ("https://www.balldontlie.io/api/v1/players/{playerId}")
  fun getPlayerById(playerId: Int): Player       // replaces what we passed in with the variable playerId above






}