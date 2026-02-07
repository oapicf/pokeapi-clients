package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MoveSummary
import org.openapitools.models.SuperContestEffectFlavorText
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param appeal 
 * @param flavorUnderscoretextUnderscoreentries 
 * @param moves 
 */
case class SuperContestEffectDetail(id: Int,
                appeal: Int,
                flavorUnderscoretextUnderscoreentries: Seq[SuperContestEffectFlavorText],
                moves: Seq[MoveSummary]
                )

object SuperContestEffectDetail {
    /**
     * Creates the codec for converting SuperContestEffectDetail from and to JSON.
     */
    implicit val decoder: Decoder[SuperContestEffectDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[SuperContestEffectDetail] = deriveEncoder
}
