package org.openapitools.server.model


/**
 * @param accuracy The percent value of how likely this move is to be successful. for example: ''null''
 * @param power The base power before the listed version group, or null if power did not change. for example: ''null''
 * @param pp Power points. The number of times this move can be used. for example: ''null''
 * @param effectChance The percent value of how likely it is this moves effect will take effect. for example: ''null''
 * @param effectEntries The effect of this move listed in different languages. for example: ''null''
 * @param `type` The elemental type of this move. for example: ''null''
 * @param versionGroup The version group in which these move stat values were in effect. for example: ''null''
*/
final case class MoveChange (
  accuracy: Option[Int] = None,
  power: Option[Int] = None,
  pp: Option[Int] = None,
  effectChance: Int,
  effectEntries: Seq[MoveEffectEffectText],
  `type`: TypeSummary,
  versionGroup: VersionGroupSummary
)

