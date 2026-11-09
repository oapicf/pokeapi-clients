goog.provide('API.Client.ItemDetail');

/**
 * @record
 */
API.Client.ItemDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.ItemDetail.prototype.id;

/**
 * The name for this resource.
 * @type {!string}
 * @export
 */
API.Client.ItemDetail.prototype.name;

/**
 * The power of the move Fling when used with this item.
 * @type {!number}
 * @export
 */
API.Client.ItemDetail.prototype.flingPower;

/**
 * The effect of the move Fling when used with this item.
 * @type {!API.Client.ItemFlingEffectSummary}
 * @export
 */
API.Client.ItemDetail.prototype.flingEffect;

/**
 * A list of attributes this item has.
 * @type {!Array<!API.Client.ItemAttributeSummary>}
 * @export
 */
API.Client.ItemDetail.prototype.attributes;

/**
 * The category of items this item falls into.
 * @type {!API.Client.ItemCategorySummary}
 * @export
 */
API.Client.ItemDetail.prototype.category;

/**
 * The effect of this ability listed in different languages.
 * @type {!Array<!API.Client.ItemEffectText>}
 * @export
 */
API.Client.ItemDetail.prototype.effectEntries;

/**
 * The flavor text of this ability listed in different languages.
 * @type {!Array<!API.Client.ItemFlavorText>}
 * @export
 */
API.Client.ItemDetail.prototype.flavorTextEntries;

/**
 * A list of game indices relevent to this item by generation.
 * @type {!Array<!API.Client.ItemGameIndex>}
 * @export
 */
API.Client.ItemDetail.prototype.gameIndices;

/**
 * Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold.
 * @type {!Array<!API.Client.ItemPrice>}
 * @export
 */
API.Client.ItemDetail.prototype.prices;

/**
 * The name of this item listed in different languages.
 * @type {!Array<!API.Client.ItemName>}
 * @export
 */
API.Client.ItemDetail.prototype.names;

/**
 * A list of Pokémon that might be found in the wild holding this item.
 * @type {!Array<!API.Client.PokemonHeldItem>}
 * @export
 */
API.Client.ItemDetail.prototype.heldByPokemon;

/**
 * A set of sprites used to depict this item in the game.
 * @type {!API.Client.ItemSprites}
 * @export
 */
API.Client.ItemDetail.prototype.sprites;

/**
 * An evolution chain this item requires to produce a bay during mating.
 * @type {!API.Client.EvolutionChainSummary}
 * @export
 */
API.Client.ItemDetail.prototype.babyTriggerFor;

/**
 * A list of the machines related to this item.
 * @type {!Array<!API.Client.ItemMachine>}
 * @export
 */
API.Client.ItemDetail.prototype.machines;

