package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MoveMeta.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class MoveMeta(
  ailment: MoveMetaAilmentSummary,
  category: MoveMetaCategorySummary,
  minHits: Option[Int],
  maxHits: Option[Int],
  minTurns: Option[Int],
  maxTurns: Option[Int],
  drain: Option[Int],
  healing: Option[Int],
  critRate: Option[Int],
  ailmentChance: Option[Int],
  flinchChance: Option[Int],
  statChance: Option[Int]
)

object MoveMeta {
  implicit lazy val moveMetaJsonFormat: Format[MoveMeta] = Json.format[MoveMeta]
}

