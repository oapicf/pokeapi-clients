package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityName
import org.openapitools.models.GenerationSummary
import org.openapitools.models.MoveDamageClassSummary
import org.openapitools.models.MoveSummary
import org.openapitools.models.TypeDetailDamageRelations
import org.openapitools.models.TypeDetailPastDamageRelationsInner
import org.openapitools.models.TypeDetailPokemonInner
import org.openapitools.models.TypeDetailSpritesValueValue
import org.openapitools.models.TypeGameIndex
import scala.collection.immutable.Seq

/**
 * Serializer for the Type resource
 * @param id 
 * @param name 
 * @param damageUnderscorerelations 
 * @param pastUnderscoredamageUnderscorerelations 
 * @param gameUnderscoreindices 
 * @param generation 
 * @param moveUnderscoredamageUnderscoreclass 
 * @param names 
 * @param pokemon 
 * @param moves 
 * @param sprites 
 */
case class TypeDetail(id: Int,
                name: String,
                damageUnderscorerelations: TypeDetailDamageRelations,
                pastUnderscoredamageUnderscorerelations: Seq[TypeDetailPastDamageRelationsInner],
                gameUnderscoreindices: Seq[TypeGameIndex],
                generation: GenerationSummary,
                moveUnderscoredamageUnderscoreclass: MoveDamageClassSummary,
                names: Seq[AbilityName],
                pokemon: Seq[TypeDetailPokemonInner],
                moves: Seq[MoveSummary],
                sprites: Map[String, Map[String, TypeDetailSpritesValueValue]]
                )

object TypeDetail {
    /**
     * Creates the codec for converting TypeDetail from and to JSON.
     */
    implicit val decoder: Decoder[TypeDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[TypeDetail] = deriveEncoder
}
