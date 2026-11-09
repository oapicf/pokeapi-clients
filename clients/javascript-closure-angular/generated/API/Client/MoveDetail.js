goog.provide('API.Client.MoveDetail');

/**
 * @record
 */
API.Client.MoveDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.MoveDetail.prototype.id;

/**
 * The name for this resource.
 * @type {!string}
 * @export
 */
API.Client.MoveDetail.prototype.name;

/**
 * The percent value of how likely this move is to be successful.
 * @type {!number}
 * @export
 */
API.Client.MoveDetail.prototype.accuracy;

/**
 * The percent value of how likely it is this moves effect will happen.
 * @type {!number}
 * @export
 */
API.Client.MoveDetail.prototype.effectChance;

/**
 * Power points. The number of times this move can be used.
 * @type {!number}
 * @export
 */
API.Client.MoveDetail.prototype.pp;

/**
 * A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail.
 * @type {!number}
 * @export
 */
API.Client.MoveDetail.prototype.priority;

/**
 * The base power of this move, or null if it has no fixed base power.
 * @type {!number}
 * @export
 */
API.Client.MoveDetail.prototype.power;

/**
 * A detail of normal and super contest combos that require this move.
 * @type {!API.Client.MoveCombos}
 * @export
 */
API.Client.MoveDetail.prototype.contestCombos;

/**
 * The type of appeal this move gives a Pokémon when used in a contest.
 * @type {!API.Client.ContestTypeSummary}
 * @export
 */
API.Client.MoveDetail.prototype.contestType;

/**
 * The effect the move has when used in a contest.
 * @type {!API.Client.ContestEffectSummary}
 * @export
 */
API.Client.MoveDetail.prototype.contestEffect;

/**
 * The type of damage the move inflicts on the target, e.g. physical.
 * @type {!API.Client.MoveDamageClassSummary}
 * @export
 */
API.Client.MoveDetail.prototype.damageClass;

/**
 * The effect of this move listed in different languages.
 * @type {!Array<!API.Client.MoveEffectEffectText>}
 * @export
 */
API.Client.MoveDetail.prototype.effectEntries;

/**
 * The list of previous effects this move has had across version groups of the games.
 * @type {!Array<!API.Client.MoveEffectChange>}
 * @export
 */
API.Client.MoveDetail.prototype.effectChanges;

/**
 * The generation in which this move was introduced.
 * @type {!API.Client.GenerationSummary}
 * @export
 */
API.Client.MoveDetail.prototype.generation;

/**
 * Metadata about this move
 * @type {!API.Client.MoveMeta}
 * @export
 */
API.Client.MoveDetail.prototype.meta;

/**
 * The name of this resource listed in different languages.
 * @type {!Array<!API.Client.MoveName>}
 * @export
 */
API.Client.MoveDetail.prototype.names;

/**
 * A list of move resource value changes across version groups of the game.
 * @type {!Array<!API.Client.MoveChange>}
 * @export
 */
API.Client.MoveDetail.prototype.pastValues;

/**
 * A list of stats this moves effects and how much it effects them.
 * @type {!Array<!API.Client.MoveMetaStatChange>}
 * @export
 */
API.Client.MoveDetail.prototype.statChanges;

/**
 * The effect the move has when used in a super contest.
 * @type {!API.Client.SuperContestEffectSummary}
 * @export
 */
API.Client.MoveDetail.prototype.superContestEffect;

/**
 * The type of target that will receive the effects of the attack.
 * @type {!API.Client.MoveTargetSummary}
 * @export
 */
API.Client.MoveDetail.prototype.target;

/**
 * The elemental type of this move.
 * @type {!API.Client.TypeSummary}
 * @export
 */
API.Client.MoveDetail.prototype.type;

/**
 * A list of the machines that teach this move.
 * @type {!Array<!API.Client.ItemMachine>}
 * @export
 */
API.Client.MoveDetail.prototype.machines;

/**
 * The flavor text of this move listed in different languages.
 * @type {!Array<!API.Client.MoveFlavorText>}
 * @export
 */
API.Client.MoveDetail.prototype.flavorTextEntries;

/**
 * List of Pokemon that can learn the move
 * @type {!Array<!API.Client.PokemonSummary>}
 * @export
 */
API.Client.MoveDetail.prototype.learnedByPokemon;

