package org.openapitools.server.model


/**
 * @param flavorText The localized name for an API resource in a specific language. for example: ''null''
 * @param language The language this text resource is in. for example: ''null''
 * @param versionGroup The version group that uses this flavor text. for example: ''null''
*/
final case class AbilityFlavorText (
  flavorText: String,
  language: LanguageSummary,
  versionGroup: VersionGroupSummary
)

