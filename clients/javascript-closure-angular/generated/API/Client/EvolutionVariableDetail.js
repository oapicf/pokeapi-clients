goog.provide('API.Client.EvolutionVariableDetail');

/**
 * @record
 */
API.Client.EvolutionVariableDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.EvolutionVariableDetail.prototype.id;

/**
 * The name for this resource.
 * @type {!string}
 * @export
 */
API.Client.EvolutionVariableDetail.prototype.name;

/**
 * The symbol used for this variable in evolution condition expressions.
 * @type {!string}
 * @export
 */
API.Client.EvolutionVariableDetail.prototype.symbol;

/**
 * The data type of this variable.
 * @type {!string}
 * @export
 */
API.Client.EvolutionVariableDetail.prototype.dataType;

/**
 * The source of the variable value.
 * @type {!string}
 * @export
 */
API.Client.EvolutionVariableDetail.prototype.source;

/**
 * The version group in which this variable was introduced.
 * @type {!API.Client.VersionGroupSummary}
 * @export
 */
API.Client.EvolutionVariableDetail.prototype.versionGroup;

/**
 * The name of this resource listed in different languages.
 * @type {!Array<!API.Client.EvolutionVariableName>}
 * @export
 */
API.Client.EvolutionVariableDetail.prototype.names;

/**
 * The description of this resource listed in different languages.
 * @type {!Array<!API.Client.EvolutionVariableDescription>}
 * @export
 */
API.Client.EvolutionVariableDetail.prototype.descriptions;

