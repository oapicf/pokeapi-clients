package org.openapitools.server.model


/**
 * @param text  for example: ''null''
 * @param versionGroup  for example: ''null''
 * @param language  for example: ''null''
*/
final case class ItemFlavorText (
  text: String,
  versionGroup: VersionGroupSummary,
  language: LanguageSummary
)

