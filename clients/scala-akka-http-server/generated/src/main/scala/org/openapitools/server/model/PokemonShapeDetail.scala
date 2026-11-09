package org.openapitools.server.model


/**
 * @param id The identifier for this resource. for example: ''null''
 * @param name The name for this resource. for example: ''null''
 * @param awesomeNames The \"scientific\" name of this Pokémon shape listed in different languages. for example: ''null''
 * @param names The name of this resource listed in different languages. for example: ''null''
 * @param pokemonSpecies A list of the Pokémon species that have this shape. for example: ''null''
*/
final case class PokemonShapeDetail (
  id: Int,
  name: String,
  awesomeNames: Seq[PokemonShapeAwesomeName],
  names: Seq[PokemonShapeName],
  pokemonSpecies: Seq[PokemonSpeciesSummary]
)

