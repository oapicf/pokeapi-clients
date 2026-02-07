goog.provide('API.Client.AbilityDetail');

/**
 * @record
 */
API.Client.AbilityDetail = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.AbilityDetail.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.AbilityDetail.prototype.name;

/**
 * @type {!boolean}
 * @export
 */
API.Client.AbilityDetail.prototype.isMainSeries;

/**
 * @type {!API.Client.GenerationSummary}
 * @export
 */
API.Client.AbilityDetail.prototype.generation;

/**
 * @type {!Array<!API.Client.AbilityName>}
 * @export
 */
API.Client.AbilityDetail.prototype.names;

/**
 * @type {!Array<!API.Client.AbilityEffectText>}
 * @export
 */
API.Client.AbilityDetail.prototype.effectEntries;

/**
 * @type {!Array<!API.Client.AbilityChange>}
 * @export
 */
API.Client.AbilityDetail.prototype.effectChanges;

/**
 * @type {!Array<!API.Client.AbilityFlavorText>}
 * @export
 */
API.Client.AbilityDetail.prototype.flavorTextEntries;

/**
 * @type {!Array<!API.Client.AbilityDetail_pokemon_inner>}
 * @export
 */
API.Client.AbilityDetail.prototype.pokemon;

