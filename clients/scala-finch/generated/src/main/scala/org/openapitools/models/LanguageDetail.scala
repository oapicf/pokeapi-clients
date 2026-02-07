package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.LanguageName
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param name 
 * @param official 
 * @param iso639 
 * @param iso3166 
 * @param names 
 */
case class LanguageDetail(id: Int,
                name: String,
                official: Option[Boolean],
                iso639: String,
                iso3166: String,
                names: Seq[LanguageName]
                )

object LanguageDetail {
    /**
     * Creates the codec for converting LanguageDetail from and to JSON.
     */
    implicit val decoder: Decoder[LanguageDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[LanguageDetail] = deriveEncoder
}
