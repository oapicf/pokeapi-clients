goog.provide('API.Client.PokemonSpeciesDetail');

/**
 * @record
 */
API.Client.PokemonSpeciesDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.id;

/**
 * The name for this resource.
 * @type {!string}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.name;

/**
 * The order in which species should be sorted. Based on National Dex order, except families are grouped together and sorted by stage.
 * @type {!number}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.order;

/**
 * The chance of this Pokémon being female, in eighths; or -1 for genderless.
 * @type {!number}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.genderRate;

/**
 * The base capture rate; up to 255. The higher the number, the easier the catch.
 * @type {!number}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.captureRate;

/**
 * The happiness when caught by a normal Pokéball; up to 255. The higher the number, the happier the Pokémon.
 * @type {!number}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.baseHappiness;

/**
 * Whether or not this is a baby Pokémon.
 * @type {!boolean}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.isBaby;

/**
 * Whether or not this is a legendary Pokémon.
 * @type {!boolean}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.isLegendary;

/**
 * Whether or not this is a mythical Pokémon.
 * @type {!boolean}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.isMythical;

/**
 * Initial hatch counter: one must walk Y × (hatch_counter + 1) steps before this Pokémon's egg hatches, unless utilizing bonuses like Flame Body's. Y varies per generation. In Generations II, III, and VII, Egg cycles are 256 steps long. In Generation IV, Egg cycles are 255 steps long. In Pokémon Brilliant Diamond and Shining Pearl, Egg cycles are also 255 steps long, but are shorter on special dates. In Generations V and VI, Egg cycles are 257 steps long. In Pokémon Sword and Shield, and in Pokémon Scarlet and Violet, Egg cycles are 128 steps long.
 * @type {!number}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.hatchCounter;

/**
 * Whether or not this Pokémon has visual gender differences.
 * @type {!boolean}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.hasGenderDifferences;

/**
 * Whether or not this Pokémon has multiple forms and can switch between them.
 * @type {!boolean}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.formsSwitchable;

/**
 * The rate at which this Pokémon species gains levels.
 * @type {!API.Client.GrowthRateSummary}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.growthRate;

/**
 * A list of Pokedexes and the indexes reserved within them for this Pokémon species.
 * @type {!Array<!API.Client.PokemonDexEntry>}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.pokedexNumbers;

/**
 * A list of egg groups this Pokémon species is a member of.
 * @type {!Array<!API.Client.EggGroupSummary>}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.eggGroups;

/**
 * The color of this Pokémon for Pokédex search.
 * @type {!API.Client.PokemonColorSummary}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.color;

/**
 * The shape of this Pokémon for Pokédex search.
 * @type {!API.Client.PokemonShapeSummary}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.shape;

/**
 * The Pokémon species that evolves into this Pokemon_species.
 * @type {!API.Client.PokemonSpeciesSummary}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.evolvesFromSpecies;

/**
 * The evolution chain this Pokémon species is a member of.
 * @type {!API.Client.EvolutionChainSummary}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.evolutionChain;

/**
 * The habitat this Pokémon species can be encountered in.
 * @type {!API.Client.PokemonHabitatSummary}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.habitat;

/**
 * The generation this Pokémon species was introduced in.
 * @type {!API.Client.GenerationSummary}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.generation;

/**
 * The name of this resource listed in different languages.
 * @type {!Array<!API.Client.PokemonSpeciesName>}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.names;

/**
 * A list of encounters that can be had with this Pokémon species in pal park.
 * @type {!Array<!API.Client.PokemonSpeciesPalParkEncounter>}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.palParkEncounters;

/**
 * Descriptions of different forms Pokémon take on within the Pokémon species.
 * @type {!Array<!API.Client.PokemonSpeciesDescription>}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.formDescriptions;

/**
 * A list of flavor text entries for this Pokémon species.
 * @type {!Array<!API.Client.PokemonSpeciesFlavorText>}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.flavorTextEntries;

/**
 * The genus of this Pokémon species listed in multiple languages.
 * @type {!Array<!API.Client.PokemonSpeciesGenus>}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.genera;

/**
 * A list of the Pokémon that exist within this Pokémon species.
 * @type {!Array<!API.Client.PokemonSpeciesVariety>}
 * @export
 */
API.Client.PokemonSpeciesDetail.prototype.varieties;

