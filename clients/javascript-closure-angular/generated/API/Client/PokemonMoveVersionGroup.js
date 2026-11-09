goog.provide('API.Client.PokemonMoveVersionGroup');

/**
 * @record
 */
API.Client.PokemonMoveVersionGroup = function() {}

/**
 * The minimum level to learn the move.
 * @type {!number}
 * @export
 */
API.Client.PokemonMoveVersionGroup.prototype.levelLearnedAt;

/**
 * The method by which the move is learned.
 * @type {!API.Client.MoveLearnMethodSummary}
 * @export
 */
API.Client.PokemonMoveVersionGroup.prototype.moveLearnMethod;

/**
 * The version group in which the move is learned.
 * @type {!API.Client.VersionGroupSummary}
 * @export
 */
API.Client.PokemonMoveVersionGroup.prototype.versionGroup;

/**
 * Order by which the pokemon will learn the move. A newly learnt move will replace the move with lowest order.
 * @type {!number}
 * @export
 */
API.Client.PokemonMoveVersionGroup.prototype.order;

