package org.openapitools.server.model


/**
 * @param versionGroup The version group in which the previous effect of this ability originated. for example: ''null''
 * @param effectEntries The previous effect of this ability listed in different languages. for example: ''null''
*/
final case class MoveEffectChange (
  versionGroup: VersionGroupSummary,
  effectEntries: Seq[MoveEffectChangeEffectText]
)

