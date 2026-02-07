package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ItemSummary
import org.openapitools.models.MoveSummary
import org.openapitools.models.VersionGroupSummary

/**
 * 
 * @param id 
 * @param item 
 * @param versionUnderscoregroup 
 * @param move 
 */
case class MachineDetail(id: Int,
                item: ItemSummary,
                versionUnderscoregroup: VersionGroupSummary,
                move: MoveSummary
                )

object MachineDetail {
    /**
     * Creates the codec for converting MachineDetail from and to JSON.
     */
    implicit val decoder: Decoder[MachineDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[MachineDetail] = deriveEncoder
}
