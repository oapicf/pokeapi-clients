package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.PalParkAreaDetailPokemonEncountersInner
import org.openapitools.models.PalParkAreaName
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param name 
 * @param names 
 * @param pokemonUnderscoreencounters 
 */
case class PalParkAreaDetail(id: Int,
                name: String,
                names: Seq[PalParkAreaName],
                pokemonUnderscoreencounters: Seq[PalParkAreaDetailPokemonEncountersInner]
                )

object PalParkAreaDetail {
    /**
     * Creates the codec for converting PalParkAreaDetail from and to JSON.
     */
    implicit val decoder: Decoder[PalParkAreaDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[PalParkAreaDetail] = deriveEncoder
}
