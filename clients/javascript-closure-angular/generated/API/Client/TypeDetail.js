goog.provide('API.Client.TypeDetail');

/**
 * Serializer for the Type resource
 * @record
 */
API.Client.TypeDetail = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.TypeDetail.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.TypeDetail.prototype.name;

/**
 * @type {!API.Client.TypeDetail_damage_relations}
 * @export
 */
API.Client.TypeDetail.prototype.damageRelations;

/**
 * @type {!Array<!API.Client.TypeDetail_past_damage_relations_inner>}
 * @export
 */
API.Client.TypeDetail.prototype.pastDamageRelations;

/**
 * @type {!Array<!API.Client.TypeGameIndex>}
 * @export
 */
API.Client.TypeDetail.prototype.gameIndices;

/**
 * @type {!API.Client.GenerationSummary}
 * @export
 */
API.Client.TypeDetail.prototype.generation;

/**
 * @type {!API.Client.MoveDamageClassSummary}
 * @export
 */
API.Client.TypeDetail.prototype.moveDamageClass;

/**
 * @type {!Array<!API.Client.AbilityName>}
 * @export
 */
API.Client.TypeDetail.prototype.names;

/**
 * @type {!Array<!API.Client.TypeDetail_pokemon_inner>}
 * @export
 */
API.Client.TypeDetail.prototype.pokemon;

/**
 * @type {!Array<!API.Client.MoveSummary>}
 * @export
 */
API.Client.TypeDetail.prototype.moves;

/**
 * @type {!Object<!string, Object<!string, API.Client.TypeDetail_sprites_value_value>>}
 * @export
 */
API.Client.TypeDetail.prototype.sprites;

