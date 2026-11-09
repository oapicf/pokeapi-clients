goog.provide('API.Client.TypeRelationships');

/**
 * @record
 */
API.Client.TypeRelationships = function() {}

/**
 * A list of types this type has no effect on.
 * @type {!Array<!API.Client.TypeSummary>}
 * @export
 */
API.Client.TypeRelationships.prototype.noDamageTo;

/**
 * A list of types this type is not very effect against.
 * @type {!Array<!API.Client.TypeSummary>}
 * @export
 */
API.Client.TypeRelationships.prototype.halfDamageTo;

/**
 * A list of types this type is very effect against.
 * @type {!Array<!API.Client.TypeSummary>}
 * @export
 */
API.Client.TypeRelationships.prototype.doubleDamageTo;

/**
 * A list of types that have no effect on this type.
 * @type {!Array<!API.Client.TypeSummary>}
 * @export
 */
API.Client.TypeRelationships.prototype.noDamageFrom;

/**
 * A list of types that are not very effective against this type.
 * @type {!Array<!API.Client.TypeSummary>}
 * @export
 */
API.Client.TypeRelationships.prototype.halfDamageFrom;

/**
 * A list of types that are very effective against this type.
 * @type {!Array<!API.Client.TypeSummary>}
 * @export
 */
API.Client.TypeRelationships.prototype.doubleDamageFrom;

