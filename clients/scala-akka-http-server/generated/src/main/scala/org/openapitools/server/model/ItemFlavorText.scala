package org.openapitools.server.model


/**
 * @param text The localized flavor text for an API resource in a specific language. for example: ''null''
 * @param versionGroup The version group which uses this flavor text. for example: ''null''
 * @param language The language this name is in. for example: ''null''
*/
final case class ItemFlavorText (
  text: String,
  versionGroup: VersionGroupSummary,
  language: LanguageSummary
)

