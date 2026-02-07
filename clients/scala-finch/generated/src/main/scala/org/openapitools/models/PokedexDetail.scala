package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityDetailPokemonInnerPokemon
import org.openapitools.models.PokedexDescription
import org.openapitools.models.PokedexDetailPokemonEntriesInner
import org.openapitools.models.PokedexName
import org.openapitools.models.RegionSummary
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param name 
 * @param isUnderscoremainUnderscoreseries 
 * @param descriptions 
 * @param names 
 * @param pokemonUnderscoreentries 
 * @param region 
 * @param versionUnderscoregroups 
 */
case class PokedexDetail(id: Int,
                name: String,
                isUnderscoremainUnderscoreseries: Option[Boolean],
                descriptions: Seq[PokedexDescription],
                names: Seq[PokedexName],
                pokemonUnderscoreentries: Seq[PokedexDetailPokemonEntriesInner],
                region: RegionSummary,
                versionUnderscoregroups: Seq[AbilityDetailPokemonInnerPokemon]
                )

object PokedexDetail {
    /**
     * Creates the codec for converting PokedexDetail from and to JSON.
     */
    implicit val decoder: Decoder[PokedexDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[PokedexDetail] = deriveEncoder
}
