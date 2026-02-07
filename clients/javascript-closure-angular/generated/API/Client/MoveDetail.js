goog.provide('API.Client.MoveDetail');

/**
 * @record
 */
API.Client.MoveDetail = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.MoveDetail.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.MoveDetail.prototype.name;

/**
 * @type {!number}
 * @export
 */
API.Client.MoveDetail.prototype.accuracy;

/**
 * @type {!number}
 * @export
 */
API.Client.MoveDetail.prototype.effectChance;

/**
 * @type {!number}
 * @export
 */
API.Client.MoveDetail.prototype.pp;

/**
 * @type {!number}
 * @export
 */
API.Client.MoveDetail.prototype.priority;

/**
 * @type {!number}
 * @export
 */
API.Client.MoveDetail.prototype.power;

/**
 * @type {!API.Client.MoveDetail_contest_combos}
 * @export
 */
API.Client.MoveDetail.prototype.contestCombos;

/**
 * @type {!API.Client.ContestTypeSummary}
 * @export
 */
API.Client.MoveDetail.prototype.contestType;

/**
 * @type {!API.Client.ContestEffectSummary}
 * @export
 */
API.Client.MoveDetail.prototype.contestEffect;

/**
 * @type {!API.Client.MoveDamageClassSummary}
 * @export
 */
API.Client.MoveDetail.prototype.damageClass;

/**
 * @type {!Array<!API.Client.MoveChange_effect_entries_inner>}
 * @export
 */
API.Client.MoveDetail.prototype.effectEntries;

/**
 * @type {!Array<!API.Client.MoveDetail_effect_changes_inner>}
 * @export
 */
API.Client.MoveDetail.prototype.effectChanges;

/**
 * @type {!API.Client.GenerationSummary}
 * @export
 */
API.Client.MoveDetail.prototype.generation;

/**
 * @type {!API.Client.MoveMeta}
 * @export
 */
API.Client.MoveDetail.prototype.meta;

/**
 * @type {!Array<!API.Client.MoveName>}
 * @export
 */
API.Client.MoveDetail.prototype.names;

/**
 * @type {!Array<!API.Client.MoveChange>}
 * @export
 */
API.Client.MoveDetail.prototype.pastValues;

/**
 * @type {!Array<!API.Client.MoveDetail_stat_changes_inner>}
 * @export
 */
API.Client.MoveDetail.prototype.statChanges;

/**
 * @type {!API.Client.SuperContestEffectSummary}
 * @export
 */
API.Client.MoveDetail.prototype.superContestEffect;

/**
 * @type {!API.Client.MoveTargetSummary}
 * @export
 */
API.Client.MoveDetail.prototype.target;

/**
 * @type {!API.Client.TypeSummary}
 * @export
 */
API.Client.MoveDetail.prototype.type;

/**
 * @type {!Array<!API.Client.MoveDetail_machines_inner>}
 * @export
 */
API.Client.MoveDetail.prototype.machines;

/**
 * @type {!Array<!API.Client.MoveFlavorText>}
 * @export
 */
API.Client.MoveDetail.prototype.flavorTextEntries;

/**
 * @type {!Array<!API.Client.AbilityDetail_pokemon_inner_pokemon>}
 * @export
 */
API.Client.MoveDetail.prototype.learnedByPokemon;

