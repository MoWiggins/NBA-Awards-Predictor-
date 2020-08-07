package com.mowiggins.domain

import com.fasterxml.jackson.annotation.JsonProperty

data class SeasonAveragesData(
    @JsonProperty("data")  //tells micronaut to look at the json value i named data populate the below variable
    var seasonData: List<PlayerSeasonData>
)