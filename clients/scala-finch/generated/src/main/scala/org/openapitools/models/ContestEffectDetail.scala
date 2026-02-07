package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ContestEffectEffectText
import org.openapitools.models.ContestEffectFlavorText
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param appeal 
 * @param jam 
 * @param effectUnderscoreentries 
 * @param flavorUnderscoretextUnderscoreentries 
 */
case class ContestEffectDetail(id: Int,
                appeal: Int,
                jam: Int,
                effectUnderscoreentries: Seq[ContestEffectEffectText],
                flavorUnderscoretextUnderscoreentries: Seq[ContestEffectFlavorText]
                )

object ContestEffectDetail {
    /**
     * Creates the codec for converting ContestEffectDetail from and to JSON.
     */
    implicit val decoder: Decoder[ContestEffectDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[ContestEffectDetail] = deriveEncoder
}
