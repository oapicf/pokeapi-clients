goog.provide('API.Client.PokemonDetail');

/**
 * @record
 */
API.Client.PokemonDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.PokemonDetail.prototype.id;

/**
 * The name for this resource.
 * @type {!string}
 * @export
 */
API.Client.PokemonDetail.prototype.name;

/**
 * The base experience gained for defeating this Pokémon.
 * @type {!number}
 * @export
 */
API.Client.PokemonDetail.prototype.baseExperience;

/**
 * The height of this Pokémon in decimetres.
 * @type {!number}
 * @export
 */
API.Client.PokemonDetail.prototype.height;

/**
 * Set for exactly one Pokémon used as the default for each species.
 * @type {!boolean}
 * @export
 */
API.Client.PokemonDetail.prototype.isDefault;

/**
 * Order for sorting. Almost national order, except families are grouped together.
 * @type {!number}
 * @export
 */
API.Client.PokemonDetail.prototype.order;

/**
 * The weight of this Pokémon in hectograms.
 * @type {!number}
 * @export
 */
API.Client.PokemonDetail.prototype.weight;

/**
 * A list of abilities this Pokémon could potentially have.
 * @type {!Array<!API.Client.PokemonAbility>}
 * @export
 */
API.Client.PokemonDetail.prototype.abilities;

/**
 * A list of details showing abilities this pokémon had in previous generations
 * @type {!Array<!API.Client.PokemonPastAbility>}
 * @export
 */
API.Client.PokemonDetail.prototype.pastAbilities;

/**
 * A list of forms this Pokémon can take on.
 * @type {!Array<!API.Client.PokemonFormSummary>}
 * @export
 */
API.Client.PokemonDetail.prototype.forms;

/**
 * A list of game indices relevent to Pokémon item by generation.
 * @type {!Array<!API.Client.PokemonGameIndex>}
 * @export
 */
API.Client.PokemonDetail.prototype.gameIndices;

/**
 * A list of items this Pokémon may be holding when encountered.
 * @type {!Array<!API.Client.PokemonHeldItemSummary>}
 * @export
 */
API.Client.PokemonDetail.prototype.heldItems;

/**
 * A link to a list of location areas, as well as encounter details pertaining to specific versions.
 * @type {!string}
 * @export
 */
API.Client.PokemonDetail.prototype.locationAreaEncounters;

/**
 * A list of moves along with learn methods and level details pertaining to specific version groups.
 * @type {!Array<!API.Client.PokemonMove>}
 * @export
 */
API.Client.PokemonDetail.prototype.moves;

/**
 * The species this Pokémon belongs to.
 * @type {!API.Client.PokemonSpeciesSummary}
 * @export
 */
API.Client.PokemonDetail.prototype.species;

/**
 * A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at <a href='https://github.com/PokeAPI/sprites#sprites'>PokeAPI/sprites</a>
 * @type {!API.Client.PokemonSprites}
 * @export
 */
API.Client.PokemonDetail.prototype.sprites;

/**
 * A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at <a href='https://github.com/PokeAPI/cries#cries'>PokeAPI/cries</a>
 * @type {!API.Client.PokemonCries}
 * @export
 */
API.Client.PokemonDetail.prototype.cries;

/**
 * A list of base stat values for this Pokémon.
 * @type {!Array<!API.Client.PokemonStat>}
 * @export
 */
API.Client.PokemonDetail.prototype.stats;

/**
 * A list of details showing stats this pokémon had in previous generations
 * @type {!Array<!API.Client.PokemonPastStat>}
 * @export
 */
API.Client.PokemonDetail.prototype.pastStats;

/**
 * A list of details showing types this Pokémon has.
 * @type {!Array<!API.Client.PokemonType>}
 * @export
 */
API.Client.PokemonDetail.prototype.types;

/**
 * A list of details showing types this pokémon had in previous generations
 * @type {!Array<!API.Client.PokemonPastType>}
 * @export
 */
API.Client.PokemonDetail.prototype.pastTypes;

