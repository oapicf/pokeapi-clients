package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BerryFlavorSummary
import org.openapitools.models.ContestTypeName
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param name 
 * @param berryUnderscoreflavor 
 * @param names 
 */
case class ContestTypeDetail(id: Int,
                name: String,
                berryUnderscoreflavor: BerryFlavorSummary,
                names: Seq[ContestTypeName]
                )

object ContestTypeDetail {
    /**
     * Creates the codec for converting ContestTypeDetail from and to JSON.
     */
    implicit val decoder: Decoder[ContestTypeDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[ContestTypeDetail] = deriveEncoder
}
