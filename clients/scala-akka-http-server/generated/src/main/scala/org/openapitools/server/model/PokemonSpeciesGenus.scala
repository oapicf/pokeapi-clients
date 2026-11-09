package org.openapitools.server.model


/**
 * @param genus The localized genus for the referenced Pokémon species for example: ''null''
 * @param language The language this genus is in. for example: ''null''
*/
final case class PokemonSpeciesGenus (
  genus: String,
  language: LanguageSummary
)

