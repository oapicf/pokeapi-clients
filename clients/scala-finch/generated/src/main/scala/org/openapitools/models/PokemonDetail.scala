package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.PokemonDetailAbilitiesInner
import org.openapitools.models.PokemonDetailCries
import org.openapitools.models.PokemonDetailHeldItems
import org.openapitools.models.PokemonDetailMovesInner
import org.openapitools.models.PokemonDetailPastAbilitiesInner
import org.openapitools.models.PokemonDetailPastTypesInner
import org.openapitools.models.PokemonDetailSprites
import org.openapitools.models.PokemonDetailTypesInner
import org.openapitools.models.PokemonFormSummary
import org.openapitools.models.PokemonGameIndex
import org.openapitools.models.PokemonSpeciesSummary
import org.openapitools.models.PokemonStat
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param name 
 * @param baseUnderscoreexperience 
 * @param height 
 * @param isUnderscoredefault 
 * @param order 
 * @param weight 
 * @param abilities 
 * @param pastUnderscoreabilities 
 * @param forms 
 * @param gameUnderscoreindices 
 * @param heldUnderscoreitems 
 * @param locationUnderscoreareaUnderscoreencounters 
 * @param moves 
 * @param species 
 * @param sprites 
 * @param cries 
 * @param stats 
 * @param types 
 * @param pastUnderscoretypes 
 */
case class PokemonDetail(id: Int,
                name: String,
                baseUnderscoreexperience: Option[Int],
                height: Option[Int],
                isUnderscoredefault: Option[Boolean],
                order: Option[Int],
                weight: Option[Int],
                abilities: Seq[PokemonDetailAbilitiesInner],
                pastUnderscoreabilities: Seq[PokemonDetailPastAbilitiesInner],
                forms: Seq[PokemonFormSummary],
                gameUnderscoreindices: Seq[PokemonGameIndex],
                heldUnderscoreitems: PokemonDetailHeldItems,
                locationUnderscoreareaUnderscoreencounters: String,
                moves: Seq[PokemonDetailMovesInner],
                species: PokemonSpeciesSummary,
                sprites: PokemonDetailSprites,
                cries: PokemonDetailCries,
                stats: Seq[PokemonStat],
                types: Seq[PokemonDetailTypesInner],
                pastUnderscoretypes: Seq[PokemonDetailPastTypesInner]
                )

object PokemonDetail {
    /**
     * Creates the codec for converting PokemonDetail from and to JSON.
     */
    implicit val decoder: Decoder[PokemonDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[PokemonDetail] = deriveEncoder
}
