goog.provide('API.Client.PokemonSpeciesDetail');

/**
 * @record
 */
API.Client.PokemonSpeciesDetail = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.name;

/**
 * @type {!number}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.order;

/**
 * @type {!number}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.genderRate;

/**
 * @type {!number}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.captureRate;

/**
 * @type {!number}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.baseHappiness;

/**
 * @type {!boolean}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.isBaby;

/**
 * @type {!boolean}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.isLegendary;

/**
 * @type {!boolean}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.isMythical;

/**
 * @type {!number}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.hatchCounter;

/**
 * @type {!boolean}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.hasGenderDifferences;

/**
 * @type {!boolean}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.formsSwitchable;

/**
 * @type {!API.Client.GrowthRateSummary}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.growthRate;

/**
 * @type {!Array<!API.Client.PokemonDexEntry>}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.pokedexNumbers;

/**
 * @type {!Array<!API.Client.AbilityDetail_pokemon_inner_pokemon>}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.eggGroups;

/**
 * @type {!API.Client.PokemonColorSummary}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.color;

/**
 * @type {!API.Client.PokemonShapeSummary}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.shape;

/**
 * @type {!API.Client.PokemonSpeciesSummary}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.evolvesFromSpecies;

/**
 * @type {!API.Client.EvolutionChainSummary}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.evolutionChain;

/**
 * @type {!API.Client.PokemonHabitatSummary}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.habitat;

/**
 * @type {!API.Client.GenerationSummary}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.generation;

/**
 * @type {!Array<!API.Client.PokemonFormDetail_form_names_inner>}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.names;

/**
 * @type {!Array<!API.Client.PokemonSpeciesDetail_pal_park_encounters_inner>}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.palParkEncounters;

/**
 * @type {!Array<!API.Client.PokemonSpeciesDescription>}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.formDescriptions;

/**
 * @type {!Array<!API.Client.PokemonSpeciesFlavorText>}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.flavorTextEntries;

/**
 * @type {!Array<!API.Client.PokemonSpeciesDetail_genera_inner>}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.genera;

/**
 * @type {!Array<!API.Client.PokemonSpeciesDetail_varieties_inner>}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.varieties;

