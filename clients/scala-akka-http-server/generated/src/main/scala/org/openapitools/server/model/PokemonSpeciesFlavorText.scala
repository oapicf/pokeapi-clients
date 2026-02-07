package org.openapitools.server.model


/**
 * @param flavorText  for example: ''null''
 * @param language  for example: ''null''
 * @param version  for example: ''null''
*/
final case class PokemonSpeciesFlavorText (
  flavorText: String,
  language: LanguageSummary,
  version: VersionSummary
)

