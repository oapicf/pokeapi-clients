goog.provide('API.Client.TypePastRelationships');

/**
 * @record
 */
API.Client.TypePastRelationships = function() {}

/**
 * The last generation in which the referenced type had the listed damage relations
 * @type {!API.Client.GenerationSummary}
 * @export
 */
API.Client.TypePastRelationships.prototype.generation;

/**
 * The damage relations the referenced type had up to and including the listed generation
 * @type {!API.Client.TypeRelationships}
 * @export
 */
API.Client.TypePastRelationships.prototype.damageRelations;

