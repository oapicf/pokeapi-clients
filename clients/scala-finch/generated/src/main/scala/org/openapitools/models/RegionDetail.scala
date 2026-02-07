package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityDetailPokemonInnerPokemon
import org.openapitools.models.GenerationSummary
import org.openapitools.models.LocationSummary
import org.openapitools.models.PokedexSummary
import org.openapitools.models.RegionName
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param name 
 * @param locations 
 * @param mainUnderscoregeneration 
 * @param names 
 * @param pokedexes 
 * @param versionUnderscoregroups 
 */
case class RegionDetail(id: Int,
                name: String,
                locations: Seq[LocationSummary],
                mainUnderscoregeneration: GenerationSummary,
                names: Seq[RegionName],
                pokedexes: Seq[PokedexSummary],
                versionUnderscoregroups: Seq[AbilityDetailPokemonInnerPokemon]
                )

object RegionDetail {
    /**
     * Creates the codec for converting RegionDetail from and to JSON.
     */
    implicit val decoder: Decoder[RegionDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[RegionDetail] = deriveEncoder
}
