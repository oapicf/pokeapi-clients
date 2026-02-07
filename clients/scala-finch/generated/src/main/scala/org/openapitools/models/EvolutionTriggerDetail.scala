package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityDetailPokemonInnerPokemon
import org.openapitools.models.EvolutionTriggerName
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param name 
 * @param names 
 * @param pokemonUnderscorespecies 
 */
case class EvolutionTriggerDetail(id: Int,
                name: String,
                names: Seq[EvolutionTriggerName],
                pokemonUnderscorespecies: Seq[AbilityDetailPokemonInnerPokemon]
                )

object EvolutionTriggerDetail {
    /**
     * Creates the codec for converting EvolutionTriggerDetail from and to JSON.
     */
    implicit val decoder: Decoder[EvolutionTriggerDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[EvolutionTriggerDetail] = deriveEncoder
}
