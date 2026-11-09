goog.provide('API.Client.PokemonEvolution');

/**
 * @record
 */
API.Client.PokemonEvolution = function() {}

/**
 * The version group in which these evolution requirements apply.
 * @type {!API.Client.VersionGroupSummary}
 * @export
 */
API.Client.PokemonEvolution.prototype.versionGroup;

/**
 * Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one 'default' evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker.
 * @type {!boolean}
 * @export
 */
API.Client.PokemonEvolution.prototype.isDefault;

/**
 * The item required to cause evolution this into Pokémon species.
 * @type {!API.Client.ItemSummary}
 * @export
 */
API.Client.PokemonEvolution.prototype.item;

/**
 * The type of event that triggers evolution into this Pokémon species.
 * @type {!API.Client.EvolutionTriggerSummary}
 * @export
 */
API.Client.PokemonEvolution.prototype.trigger;

/**
 * The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species.
 * @type {!number}
 * @export
 */
API.Client.PokemonEvolution.prototype.gender;

/**
 * The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species.
 * @type {!API.Client.ItemSummary}
 * @export
 */
API.Client.PokemonEvolution.prototype.heldItem;

/**
 * @type {!API.Client.PokemonEvolution_known_move}
 * @export
 */
API.Client.PokemonEvolution.prototype.knownMove;

/**
 * @type {!API.Client.PokemonEvolution_known_move}
 * @export
 */
API.Client.PokemonEvolution.prototype.knownMoveType;

/**
 * The location the evolution must be triggered at.
 * @type {!API.Client.LocationSummary}
 * @export
 */
API.Client.PokemonEvolution.prototype.location;

/**
 * The minimum required level of the evolving Pokémon species to evolve into this Pokémon species.
 * @type {!number}
 * @export
 */
API.Client.PokemonEvolution.prototype.minLevel;

/**
 * The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species.
 * @type {!number}
 * @export
 */
API.Client.PokemonEvolution.prototype.minHappiness;

/**
 * The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species.
 * @type {!number}
 * @export
 */
API.Client.PokemonEvolution.prototype.minBeauty;

/**
 * The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species.
 * @type {!number}
 * @export
 */
API.Client.PokemonEvolution.prototype.minAffection;

/**
 * Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species.
 * @type {!boolean}
 * @export
 */
API.Client.PokemonEvolution.prototype.nearSpecialRock;

/**
 * Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle).
 * @type {!boolean}
 * @export
 */
API.Client.PokemonEvolution.prototype.needsMultiplayer;

/**
 * Whether or not it must be raining in the overworld to cause evolution this Pokémon species.
 * @type {!boolean}
 * @export
 */
API.Client.PokemonEvolution.prototype.needsOverworldRain;

/**
 * The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species.
 * @type {!API.Client.PokemonSpeciesSummary}
 * @export
 */
API.Client.PokemonEvolution.prototype.partySpecies;

/**
 * The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species.
 * @type {!API.Client.TypeSummary}
 * @export
 */
API.Client.PokemonEvolution.prototype.partyType;

/**
 * The required relation between the Pokémon's Attack and Defense stats. 1 means Attack > Defense. 0 means Attack = Defense. -1 means Attack < Defense.
 * @type {!number}
 * @export
 */
API.Client.PokemonEvolution.prototype.relativePhysicalStats;

/**
 * The required time of day. Day or night.
 * @type {!string}
 * @export
 */
API.Client.PokemonEvolution.prototype.timeOfDay;

/**
 * Pokémon species for which this one must be traded.
 * @type {!API.Client.PokemonSpeciesSummary}
 * @export
 */
API.Client.PokemonEvolution.prototype.tradeSpecies;

/**
 * Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up.
 * @type {!boolean}
 * @export
 */
API.Client.PokemonEvolution.prototype.turnUpsideDown;

/**
 * The required region in which this evolution can occur.
 * @type {!API.Client.RegionSummary}
 * @export
 */
API.Client.PokemonEvolution.prototype.region;

/**
 * The Pokémon form required before evolving, or null if unrestricted.
 * @type {!API.Client.PokemonFormSummary}
 * @export
 */
API.Client.PokemonEvolution.prototype.requiredPokemonForm;

/**
 * The Pokémon form produced by this evolution, or null if unspecified.
 * @type {!API.Client.PokemonFormSummary}
 * @export
 */
API.Client.PokemonEvolution.prototype.evolvedPokemonForm;

/**
 * The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species.
 * @type {!API.Client.MoveSummary}
 * @export
 */
API.Client.PokemonEvolution.prototype.usedMove;

/**
 * The minimum number of times a move must be used in order to evolve into this Pokémon species.
 * @type {!number}
 * @export
 */
API.Client.PokemonEvolution.prototype.minMoveCount;

/**
 * The minimum number of steps that must be taken in order to evolve into this Pokémon species.
 * @type {!number}
 * @export
 */
API.Client.PokemonEvolution.prototype.minSteps;

/**
 * The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species.
 * @type {!number}
 * @export
 */
API.Client.PokemonEvolution.prototype.minDamageTaken;

/**
 * The natures that allow this evolution, or null if unrestricted.
 * @type {!Array<!API.Client.NatureSummary>}
 * @export
 */
API.Client.PokemonEvolution.prototype.allowedNatures;

/**
 * An additional evolution condition expressed in reverse Polish notation, or null if none.
 * @type {!API.Client.EvolutionConditionExpression}
 * @export
 */
API.Client.PokemonEvolution.prototype.conditionExpression;

