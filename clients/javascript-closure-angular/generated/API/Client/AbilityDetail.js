goog.provide('API.Client.AbilityDetail');

/**
 * @record
 */
API.Client.AbilityDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.AbilityDetail.prototype.id;

/**
 * The name for this resource.
 * @type {!string}
 * @export
 */
API.Client.AbilityDetail.prototype.name;

/**
 * Whether or not this ability originated in the main series of the video games.
 * @type {!boolean}
 * @export
 */
API.Client.AbilityDetail.prototype.isMainSeries;

/**
 * The generation this ability originated in.
 * @type {!API.Client.GenerationSummary}
 * @export
 */
API.Client.AbilityDetail.prototype.generation;

/**
 * The name of this resource listed in different languages.
 * @type {!Array<!API.Client.AbilityName>}
 * @export
 */
API.Client.AbilityDetail.prototype.names;

/**
 * The effect of this ability listed in different languages.
 * @type {!Array<!API.Client.AbilityEffectText>}
 * @export
 */
API.Client.AbilityDetail.prototype.effectEntries;

/**
 * The list of previous effects this ability has had across version groups.
 * @type {!Array<!API.Client.AbilityChange>}
 * @export
 */
API.Client.AbilityDetail.prototype.effectChanges;

/**
 * The flavor text of this ability listed in different languages.
 * @type {!Array<!API.Client.AbilityFlavorText>}
 * @export
 */
API.Client.AbilityDetail.prototype.flavorTextEntries;

/**
 * A list of Pokémon that could potentially have this ability.
 * @type {!Array<!API.Client.AbilityPokemonDetail>}
 * @export
 */
API.Client.AbilityDetail.prototype.pokemon;

