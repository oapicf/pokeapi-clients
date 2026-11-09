goog.provide('API.Client.LanguageDetail');

/**
 * @record
 */
API.Client.LanguageDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.LanguageDetail.prototype.id;

/**
 * The name for this resource.
 * @type {!string}
 * @export
 */
API.Client.LanguageDetail.prototype.name;

/**
 * Whether or not the games are published in this language.
 * @type {!boolean}
 * @export
 */
API.Client.LanguageDetail.prototype.official;

/**
 * The two-letter ISO 639-1 language code. Multiple PokéAPI language records may share this code.
 * @type {!string}
 * @export
 */
API.Client.LanguageDetail.prototype.iso639;

/**
 * The two-letter ISO 3166-1 alpha-2 code of the country or region associated with this language record. Multiple PokéAPI language records may share this code.
 * @type {!string}
 * @export
 */
API.Client.LanguageDetail.prototype.iso3166;

/**
 * The name of this resource listed in different languages.
 * @type {!Array<!API.Client.LanguageName>}
 * @export
 */
API.Client.LanguageDetail.prototype.names;

