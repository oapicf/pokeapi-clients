goog.provide('API.Client.TypeDetail');

/**
 * Serializer for the Type resource
 * @record
 */
API.Client.TypeDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.TypeDetail.prototype.id;

/**
 * The name for this resource.
 * @type {!string}
 * @export
 */
API.Client.TypeDetail.prototype.name;

/**
 * A detail of how effective this type is toward others and vice versa.
 * @type {!API.Client.TypeRelationships}
 * @export
 */
API.Client.TypeDetail.prototype.damageRelations;

/**
 * A list of details of how effective this type was toward others and vice versa in previous generations
 * @type {!Array<!API.Client.TypePastRelationships>}
 * @export
 */
API.Client.TypeDetail.prototype.pastDamageRelations;

/**
 * A list of game indices relevent to this item by generation.
 * @type {!Array<!API.Client.TypeGameIndex>}
 * @export
 */
API.Client.TypeDetail.prototype.gameIndices;

/**
 * The generation this type was introduced in.
 * @type {!API.Client.GenerationSummary}
 * @export
 */
API.Client.TypeDetail.prototype.generation;

/**
 * The class of damage inflicted by this type.
 * @type {!API.Client.MoveDamageClassSummary}
 * @export
 */
API.Client.TypeDetail.prototype.moveDamageClass;

/**
 * The name of this resource listed in different languages.
 * @type {!Array<!API.Client.TypeName>}
 * @export
 */
API.Client.TypeDetail.prototype.names;

/**
 * A list of details of Pokémon that have this type.
 * @type {!Array<!API.Client.TypePokemon>}
 * @export
 */
API.Client.TypeDetail.prototype.pokemon;

/**
 * A list of moves that have this type.
 * @type {!Array<!API.Client.MoveSummary>}
 * @export
 */
API.Client.TypeDetail.prototype.moves;

/**
 * Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null.
 * @type {!Object<!string, Object<!string, API.Client.TypeGameSprite>>}
 * @export
 */
API.Client.TypeDetail.prototype.sprites;

