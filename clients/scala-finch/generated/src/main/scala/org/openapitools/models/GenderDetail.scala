package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityDetailPokemonInnerPokemon
import org.openapitools.models.GenderDetailPokemonSpeciesDetailsInner
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param name 
 * @param pokemonUnderscorespeciesUnderscoredetails 
 * @param requiredUnderscoreforUnderscoreevolution 
 */
case class GenderDetail(id: Int,
                name: String,
                pokemonUnderscorespeciesUnderscoredetails: Seq[GenderDetailPokemonSpeciesDetailsInner],
                requiredUnderscoreforUnderscoreevolution: Seq[AbilityDetailPokemonInnerPokemon]
                )

object GenderDetail {
    /**
     * Creates the codec for converting GenderDetail from and to JSON.
     */
    implicit val decoder: Decoder[GenderDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[GenderDetail] = deriveEncoder
}
