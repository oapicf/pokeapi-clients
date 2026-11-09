goog.provide('API.Client.GenderDetail');

/**
 * @record
 */
API.Client.GenderDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.GenderDetail.prototype.id;

/**
 * The name for this resource.
 * @type {!string}
 * @export
 */
API.Client.GenderDetail.prototype.name;

/**
 * A list of Pokémon species that can be this gender and how likely it is that they will be.
 * @type {!Array<!API.Client.GenderPokemonSpecies>}
 * @export
 */
API.Client.GenderDetail.prototype.pokemonSpeciesDetails;

/**
 * A list of Pokémon species that required this gender in order for a Pokémon to evolve into them.
 * @type {!Array<!API.Client.PokemonSpeciesSummary>}
 * @export
 */
API.Client.GenderDetail.prototype.requiredForEvolution;

