package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MoveMeta.
  * @param ailment The status ailment this move inflicts on its target.
  * @param category The category of move this move falls under, e.g. damage or ailment.
  * @param minHits The minimum number of times this move hits. Null if it always only hits once.
  * @param maxHits The maximum number of times this move hits. Null if it always only hits once.
  * @param minTurns The minimum number of turns this move continues to take effect. Null if it always only lasts one turn.
  * @param maxTurns The maximum number of turns this move continues to take effect. Null if it always only lasts one turn.
  * @param drain HP drain (if positive) or Recoil damage (if negative), in percent of damage done.
  * @param healing The amount of hp gained by the attacking Pokemon, in percent of it's maximum HP.
  * @param critRate Critical hit rate bonus.
  * @param ailmentChance The likelihood this attack will cause an ailment.
  * @param flinchChance The likelihood this attack will cause the target Pokémon to flinch.
  * @param statChance The likelihood this attack will cause a stat change in the target Pokémon.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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

