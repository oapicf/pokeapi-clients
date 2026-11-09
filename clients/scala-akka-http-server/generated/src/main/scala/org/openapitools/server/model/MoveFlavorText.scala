package org.openapitools.server.model


/**
 * @param flavorText The localized flavor text for an api resource in a specific language. for example: ''null''
 * @param language The language this name is in. for example: ''null''
 * @param versionGroup The version group that uses this flavor text. for example: ''null''
*/
final case class MoveFlavorText (
  flavorText: String,
  language: LanguageSummary,
  versionGroup: VersionGroupSummary
)

