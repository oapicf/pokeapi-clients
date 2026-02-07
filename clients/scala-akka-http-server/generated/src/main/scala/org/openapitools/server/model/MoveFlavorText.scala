package org.openapitools.server.model


/**
 * @param flavorText  for example: ''null''
 * @param language  for example: ''null''
 * @param versionGroup  for example: ''null''
*/
final case class MoveFlavorText (
  flavorText: String,
  language: LanguageSummary,
  versionGroup: VersionGroupSummary
)

