package com.mowiggins.domain

data class PlayerSeasonData(
    val ast: Double,
    val blk: Double,
    val dreb: Double,
    val fg3_pct: Double,
    val fg3a: Double,
    val fg3m: Double,
    val fg_pct: Double,
    val fga: Double,
    val fgm: Double,
    val ft_pct: Double,
    val fta: Double,
    val ftm: Double,
    val games_played: Int,
    val min: String,
    val oreb: Double,
    val pf: Double,
    val player_id: Int,
    val pts: Double,
    val reb: Double,
    val season: Int,
    val stl: Double,
    val turnover: Double
)

{
  fun defensiveScore() : Double {
    return blk + dreb + oreb + reb + stl
  }

  fun playerRating()  : Double {
    return  ast + blk + dreb + fg3_pct + fg_pct + ft_pct + oreb + pts + stl + reb
  }

}