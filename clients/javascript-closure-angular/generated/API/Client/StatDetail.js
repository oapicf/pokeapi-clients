goog.provide('API.Client.StatDetail');

/**
 * @record
 */
API.Client.StatDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.StatDetail.prototype.id;

/**
 * The name for this resource.
 * @type {!string}
 * @export
 */
API.Client.StatDetail.prototype.name;

/**
 * ID the games use for this stat.
 * @type {!number}
 * @export
 */
API.Client.StatDetail.prototype.gameIndex;

/**
 * Whether this stat only exists within a battle.
 * @type {!boolean}
 * @export
 */
API.Client.StatDetail.prototype.isBattleOnly;

/**
 * A detail of moves which affect this stat positively or negatively.
 * @type {!API.Client.StatAffectingMoves}
 * @export
 */
API.Client.StatDetail.prototype.affectingMoves;

/**
 * A detail of natures which affect this stat positively or negatively.
 * @type {!API.Client.StatAffectingNatures}
 * @export
 */
API.Client.StatDetail.prototype.affectingNatures;

/**
 * Items that affect this stat, such as vitamins and battle items.
 * @type {!Array<!API.Client.ItemSummary>}
 * @export
 */
API.Client.StatDetail.prototype.affectingItems;

/**
 * A list of characteristics that are set on a Pokémon when its highest base stat is this stat.
 * @type {!Array<!API.Client.CharacteristicSummary>}
 * @export
 */
API.Client.StatDetail.prototype.characteristics;

/**
 * The class of damage this stat is directly related to.
 * @type {!API.Client.MoveDamageClassSummary}
 * @export
 */
API.Client.StatDetail.prototype.moveDamageClass;

/**
 * The name of this resource listed in different languages.
 * @type {!Array<!API.Client.StatName>}
 * @export
 */
API.Client.StatDetail.prototype.names;

