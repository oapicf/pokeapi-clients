package org.openapitools.server.model


/**
 * @param ailment The status ailment this move inflicts on its target. for example: ''null''
 * @param category The category of move this move falls under, e.g. damage or ailment. for example: ''null''
 * @param minHits The minimum number of times this move hits. Null if it always only hits once. for example: ''null''
 * @param maxHits The maximum number of times this move hits. Null if it always only hits once. for example: ''null''
 * @param minTurns The minimum number of turns this move continues to take effect. Null if it always only lasts one turn. for example: ''null''
 * @param maxTurns The maximum number of turns this move continues to take effect. Null if it always only lasts one turn. for example: ''null''
 * @param drain HP drain (if positive) or Recoil damage (if negative), in percent of damage done. for example: ''null''
 * @param healing The amount of hp gained by the attacking Pokemon, in percent of it's maximum HP. for example: ''null''
 * @param critRate Critical hit rate bonus. for example: ''null''
 * @param ailmentChance The likelihood this attack will cause an ailment. for example: ''null''
 * @param flinchChance The likelihood this attack will cause the target Pokémon to flinch. for example: ''null''
 * @param statChance The likelihood this attack will cause a stat change in the target Pokémon. for example: ''null''
*/
final case class MoveMeta (
  ailment: MoveMetaAilmentSummary,
  category: MoveMetaCategorySummary,
  minHits: Option[Int] = None,
  maxHits: Option[Int] = None,
  minTurns: Option[Int] = None,
  maxTurns: Option[Int] = None,
  drain: Option[Int] = None,
  healing: Option[Int] = None,
  critRate: Option[Int] = None,
  ailmentChance: Option[Int] = None,
  flinchChance: Option[Int] = None,
  statChance: Option[Int] = None
)

