package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityDetailPokemonInnerPokemon
import org.openapitools.models.EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner
import scala.collection.immutable.Seq

/**
 * 
 * @param evolutionUnderscoredetails 
 * @param isUnderscorebaby 
 * @param species 
 */
case class EvolutionChainDetailChainEvolvesToInner(evolutionUnderscoredetails: Seq[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner],
                isUnderscorebaby: Boolean,
                species: AbilityDetailPokemonInnerPokemon
                )

object EvolutionChainDetailChainEvolvesToInner {
    /**
     * Creates the codec for converting EvolutionChainDetailChainEvolvesToInner from and to JSON.
     */
    implicit val decoder: Decoder[EvolutionChainDetailChainEvolvesToInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[EvolutionChainDetailChainEvolvesToInner] = deriveEncoder
}
