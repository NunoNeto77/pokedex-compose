package com.plcoding.jetpackcomposepokedex.data.remote.responses

data class Ability(
    val ability: com.plcoding.jetpackcomposepokedex.data.remote.responses.AbilityX,
    val is_hidden: Boolean,
    val slot: Int
)