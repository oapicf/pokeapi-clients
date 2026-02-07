package org.openapitools.server.model


/**
 * @param ailment  for example: ''null''
 * @param category  for example: ''null''
 * @param minHits  for example: ''null''
 * @param maxHits  for example: ''null''
 * @param minTurns  for example: ''null''
 * @param maxTurns  for example: ''null''
 * @param drain  for example: ''null''
 * @param healing  for example: ''null''
 * @param critRate  for example: ''null''
 * @param ailmentChance  for example: ''null''
 * @param flinchChance  for example: ''null''
 * @param statChance  for example: ''null''
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

