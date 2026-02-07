package org.openapitools.server.model


/**
 * @param versionGroup  for example: ''null''
 * @param effectEntries  for example: ''null''
*/
final case class AbilityChange (
  versionGroup: VersionGroupSummary,
  effectEntries: Seq[AbilityChangeEffectText]
)

