package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityDetailPokemonInnerPokemon
import org.openapitools.models.AnyType
import org.openapitools.models.EvolutionChainDetailChainEvolvesToInner
import scala.collection.immutable.Seq

/**
 * 
 * @param evolutionUnderscoredetails 
 * @param evolvesUnderscoreto 
 * @param isUnderscorebaby 
 * @param species 
 */
case class EvolutionChainDetailChain(evolutionUnderscoredetails: Seq[AnyType],
                evolvesUnderscoreto: Seq[EvolutionChainDetailChainEvolvesToInner],
                isUnderscorebaby: Boolean,
                species: AbilityDetailPokemonInnerPokemon
                )

object EvolutionChainDetailChain {
    /**
     * Creates the codec for converting EvolutionChainDetailChain from and to JSON.
     */
    implicit val decoder: Decoder[EvolutionChainDetailChain] = deriveDecoder
    implicit val encoder: ObjectEncoder[EvolutionChainDetailChain] = deriveEncoder
}
