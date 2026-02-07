goog.provide('API.Client.LanguageDetail');

/**
 * @record
 */
API.Client.LanguageDetail = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.LanguageDetail.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.LanguageDetail.prototype.name;

/**
 * @type {!boolean}
 * @export
 */
API.Client.LanguageDetail.prototype.official;

/**
 * @type {!string}
 * @export
 */
API.Client.LanguageDetail.prototype.iso639;

/**
 * @type {!string}
 * @export
 */
API.Client.LanguageDetail.prototype.iso3166;

/**
 * @type {!Array<!API.Client.LanguageName>}
 * @export
 */
API.Client.LanguageDetail.prototype.names;

