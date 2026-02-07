package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.EvolutionChainDetailChain
import org.openapitools.models.ItemSummary

/**
 * 
 * @param id 
 * @param babyUnderscoretriggerUnderscoreitem 
 * @param chain 
 */
case class EvolutionChainDetail(id: Int,
                babyUnderscoretriggerUnderscoreitem: ItemSummary,
                chain: EvolutionChainDetailChain
                )

object EvolutionChainDetail {
    /**
     * Creates the codec for converting EvolutionChainDetail from and to JSON.
     */
    implicit val decoder: Decoder[EvolutionChainDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[EvolutionChainDetail] = deriveEncoder
}
