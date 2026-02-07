package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.EggGroupDetailPokemonSpeciesInner
import org.openapitools.models.EggGroupName
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param name 
 * @param names 
 * @param pokemonUnderscorespecies 
 */
case class EggGroupDetail(id: Int,
                name: String,
                names: Seq[EggGroupName],
                pokemonUnderscorespecies: Seq[EggGroupDetailPokemonSpeciesInner]
                )

object EggGroupDetail {
    /**
     * Creates the codec for converting EggGroupDetail from and to JSON.
     */
    implicit val decoder: Decoder[EggGroupDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[EggGroupDetail] = deriveEncoder
}
