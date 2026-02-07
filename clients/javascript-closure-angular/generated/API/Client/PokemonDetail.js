goog.provide('API.Client.PokemonDetail');

/**
 * @record
 */
API.Client.PokemonDetail = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PokemonDetail.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.PokemonDetail.prototype.name;

/**
 * @type {!number}
 * @export
 */
API.Client.PokemonDetail.prototype.baseExperience;

/**
 * @type {!number}
 * @export
 */
API.Client.PokemonDetail.prototype.height;

/**
 * @type {!boolean}
 * @export
 */
API.Client.PokemonDetail.prototype.isDefault;

/**
 * @type {!number}
 * @export
 */
API.Client.PokemonDetail.prototype.order;

/**
 * @type {!number}
 * @export
 */
API.Client.PokemonDetail.prototype.weight;

/**
 * @type {!Array<!API.Client.PokemonDetail_abilities_inner>}
 * @export
 */
API.Client.PokemonDetail.prototype.abilities;

/**
 * @type {!Array<!API.Client.PokemonDetail_past_abilities_inner>}
 * @export
 */
API.Client.PokemonDetail.prototype.pastAbilities;

/**
 * @type {!Array<!API.Client.PokemonFormSummary>}
 * @export
 */
API.Client.PokemonDetail.prototype.forms;

/**
 * @type {!Array<!API.Client.PokemonGameIndex>}
 * @export
 */
API.Client.PokemonDetail.prototype.gameIndices;

/**
 * @type {!API.Client.PokemonDetail_held_items}
 * @export
 */
API.Client.PokemonDetail.prototype.heldItems;

/**
 * @type {!string}
 * @export
 */
API.Client.PokemonDetail.prototype.locationAreaEncounters;

/**
 * @type {!Array<!API.Client.PokemonDetail_moves_inner>}
 * @export
 */
API.Client.PokemonDetail.prototype.moves;

/**
 * @type {!API.Client.PokemonSpeciesSummary}
 * @export
 */
API.Client.PokemonDetail.prototype.species;

/**
 * @type {!API.Client.PokemonDetail_sprites}
 * @export
 */
API.Client.PokemonDetail.prototype.sprites;

/**
 * @type {!API.Client.PokemonDetail_cries}
 * @export
 */
API.Client.PokemonDetail.prototype.cries;

/**
 * @type {!Array<!API.Client.PokemonStat>}
 * @export
 */
API.Client.PokemonDetail.prototype.stats;

/**
 * @type {!Array<!API.Client.PokemonDetail_types_inner>}
 * @export
 */
API.Client.PokemonDetail.prototype.types;

/**
 * @type {!Array<!API.Client.PokemonDetail_past_types_inner>}
 * @export
 */
API.Client.PokemonDetail.prototype.pastTypes;

