package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MoveChangeEffectEntriesInner
import org.openapitools.models.TypeSummary
import org.openapitools.models.VersionGroupSummary
import scala.collection.immutable.Seq

/**
 * 
 * @param accuracy 
 * @param power 
 * @param pp 
 * @param effectUnderscorechance 
 * @param effectUnderscoreentries 
 * @param _type 
 * @param versionUnderscoregroup 
 */
case class MoveChange(accuracy: Option[Int],
                power: Option[Int],
                pp: Option[Int],
                effectUnderscorechance: Int,
                effectUnderscoreentries: Seq[MoveChangeEffectEntriesInner],
                _type: TypeSummary,
                versionUnderscoregroup: VersionGroupSummary
                )

object MoveChange {
    /**
     * Creates the codec for converting MoveChange from and to JSON.
     */
    implicit val decoder: Decoder[MoveChange] = deriveDecoder
    implicit val encoder: ObjectEncoder[MoveChange] = deriveEncoder
}
