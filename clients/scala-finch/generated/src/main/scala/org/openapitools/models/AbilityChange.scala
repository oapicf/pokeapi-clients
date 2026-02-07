package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityChangeEffectText
import org.openapitools.models.VersionGroupSummary
import scala.collection.immutable.Seq

/**
 * 
 * @param versionUnderscoregroup 
 * @param effectUnderscoreentries 
 */
case class AbilityChange(versionUnderscoregroup: VersionGroupSummary,
                effectUnderscoreentries: Seq[AbilityChangeEffectText]
                )

object AbilityChange {
    /**
     * Creates the codec for converting AbilityChange from and to JSON.
     */
    implicit val decoder: Decoder[AbilityChange] = deriveDecoder
    implicit val encoder: ObjectEncoder[AbilityChange] = deriveEncoder
}
