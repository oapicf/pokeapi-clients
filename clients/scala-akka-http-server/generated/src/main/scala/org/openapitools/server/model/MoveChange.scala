package org.openapitools.server.model


/**
 * @param accuracy  for example: ''null''
 * @param power  for example: ''null''
 * @param pp  for example: ''null''
 * @param effectChance  for example: ''null''
 * @param effectEntries  for example: ''null''
 * @param `type`  for example: ''null''
 * @param versionGroup  for example: ''null''
*/
final case class MoveChange (
  accuracy: Option[Int] = None,
  power: Option[Int] = None,
  pp: Option[Int] = None,
  effectChance: Int,
  effectEntries: Seq[MoveChangeEffectEntriesInner],
  `type`: TypeSummary,
  versionGroup: VersionGroupSummary
)

