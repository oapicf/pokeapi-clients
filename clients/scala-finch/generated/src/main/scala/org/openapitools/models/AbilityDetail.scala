package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityChange
import org.openapitools.models.AbilityDetailPokemonInner
import org.openapitools.models.AbilityEffectText
import org.openapitools.models.AbilityFlavorText
import org.openapitools.models.AbilityName
import org.openapitools.models.GenerationSummary
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param name 
 * @param isUnderscoremainUnderscoreseries 
 * @param generation 
 * @param names 
 * @param effectUnderscoreentries 
 * @param effectUnderscorechanges 
 * @param flavorUnderscoretextUnderscoreentries 
 * @param pokemon 
 */
case class AbilityDetail(id: Int,
                name: String,
                isUnderscoremainUnderscoreseries: Option[Boolean],
                generation: GenerationSummary,
                names: Seq[AbilityName],
                effectUnderscoreentries: Seq[AbilityEffectText],
                effectUnderscorechanges: Seq[AbilityChange],
                flavorUnderscoretextUnderscoreentries: Seq[AbilityFlavorText],
                pokemon: Seq[AbilityDetailPokemonInner]
                )

object AbilityDetail {
    /**
     * Creates the codec for converting AbilityDetail from and to JSON.
     */
    implicit val decoder: Decoder[AbilityDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[AbilityDetail] = deriveEncoder
}
