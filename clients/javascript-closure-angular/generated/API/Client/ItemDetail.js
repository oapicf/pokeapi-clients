goog.provide('API.Client.ItemDetail');

/**
 * @record
 */
API.Client.ItemDetail = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.ItemDetail.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.ItemDetail.prototype.name;

/**
 * @type {!number}
 * @export
 */
API.Client.ItemDetail.prototype.cost;

/**
 * @type {!number}
 * @export
 */
API.Client.ItemDetail.prototype.flingPower;

/**
 * @type {!API.Client.ItemFlingEffectSummary}
 * @export
 */
API.Client.ItemDetail.prototype.flingEffect;

/**
 * @type {!Array<!API.Client.AbilityDetail_pokemon_inner_pokemon>}
 * @export
 */
API.Client.ItemDetail.prototype.attributes;

/**
 * @type {!API.Client.ItemCategorySummary}
 * @export
 */
API.Client.ItemDetail.prototype.category;

/**
 * @type {!Array<!API.Client.ItemEffectText>}
 * @export
 */
API.Client.ItemDetail.prototype.effectEntries;

/**
 * @type {!Array<!API.Client.ItemFlavorText>}
 * @export
 */
API.Client.ItemDetail.prototype.flavorTextEntries;

/**
 * @type {!Array<!API.Client.ItemGameIndex>}
 * @export
 */
API.Client.ItemDetail.prototype.gameIndices;

/**
 * @type {!Array<!API.Client.ItemName>}
 * @export
 */
API.Client.ItemDetail.prototype.names;

/**
 * @type {!Array<!API.Client.ItemDetail_held_by_pokemon_inner>}
 * @export
 */
API.Client.ItemDetail.prototype.heldByPokemon;

/**
 * @type {!API.Client.ItemDetail_sprites}
 * @export
 */
API.Client.ItemDetail.prototype.sprites;

/**
 * @type {!API.Client.ItemDetail_baby_trigger_for}
 * @export
 */
API.Client.ItemDetail.prototype.babyTriggerFor;

/**
 * @type {!Array<!API.Client.ItemDetail_machines_inner>}
 * @export
 */
API.Client.ItemDetail.prototype.machines;

