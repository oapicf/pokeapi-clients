package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilitySummary
import org.openapitools.models.GenerationName
import org.openapitools.models.MoveSummary
import org.openapitools.models.PokemonSpeciesSummary
import org.openapitools.models.RegionSummary
import org.openapitools.models.TypeSummary
import org.openapitools.models.VersionGroupSummary
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param name 
 * @param abilities 
 * @param mainUnderscoreregion 
 * @param moves 
 * @param names 
 * @param pokemonUnderscorespecies 
 * @param types 
 * @param versionUnderscoregroups 
 */
case class GenerationDetail(id: Int,
                name: String,
                abilities: Seq[AbilitySummary],
                mainUnderscoreregion: RegionSummary,
                moves: Seq[MoveSummary],
                names: Seq[GenerationName],
                pokemonUnderscorespecies: Seq[PokemonSpeciesSummary],
                types: Seq[TypeSummary],
                versionUnderscoregroups: Seq[VersionGroupSummary]
                )

object GenerationDetail {
    /**
     * Creates the codec for converting GenerationDetail from and to JSON.
     */
    implicit val decoder: Decoder[GenerationDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[GenerationDetail] = deriveEncoder
}
