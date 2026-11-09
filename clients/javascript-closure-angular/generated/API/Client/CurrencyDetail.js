goog.provide('API.Client.CurrencyDetail');

/**
 * @record
 */
API.Client.CurrencyDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.CurrencyDetail.prototype.id;

/**
 * The name for this resource.
 * @type {!string}
 * @export
 */
API.Client.CurrencyDetail.prototype.name;

/**
 * The name of this resource listed in different languages.
 * @type {!Array<!API.Client.CurrencyName>}
 * @export
 */
API.Client.CurrencyDetail.prototype.names;

