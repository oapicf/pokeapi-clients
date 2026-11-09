goog.provide('API.Client.CharacteristicDetail');

/**
 * @record
 */
API.Client.CharacteristicDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.CharacteristicDetail.prototype.id;

/**
 * The remainder of the highest stat/IV divided by 5.
 * @type {!number}
 * @export
 */
API.Client.CharacteristicDetail.prototype.geneModulo;

/**
 * The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5.
 * @type {!Array<!number>}
 * @export
 */
API.Client.CharacteristicDetail.prototype.possibleValues;

/**
 * The stat which results in this characteristic.
 * @type {!API.Client.StatSummary}
 * @export
 */
API.Client.CharacteristicDetail.prototype.highestStat;

/**
 * The descriptions of this characteristic listed in different languages.
 * @type {!Array<!API.Client.CharacteristicDescription>}
 * @export
 */
API.Client.CharacteristicDetail.prototype.descriptions;

