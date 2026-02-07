package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.net.URI

/**
 * 
 * @param name 
 * @param url 
 */
case class EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender(name: String,
                url: URI
                )

object EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender {
    /**
     * Creates the codec for converting EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender from and to JSON.
     */
    implicit val decoder: Decoder[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender] = deriveDecoder
    implicit val encoder: ObjectEncoder[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender] = deriveEncoder
}
