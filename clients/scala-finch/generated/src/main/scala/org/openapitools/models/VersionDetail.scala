package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.VersionGroupSummary
import org.openapitools.models.VersionName
import scala.collection.immutable.Seq

/**
 * Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I'm not sure how to add anything other than a hyperlink
 * @param id 
 * @param name 
 * @param names 
 * @param versionUnderscoregroup 
 */
case class VersionDetail(id: Int,
                name: String,
                names: Seq[VersionName],
                versionUnderscoregroup: VersionGroupSummary
                )

object VersionDetail {
    /**
     * Creates the codec for converting VersionDetail from and to JSON.
     */
    implicit val decoder: Decoder[VersionDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[VersionDetail] = deriveEncoder
}
