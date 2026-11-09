goog.provide('API.Client.PokemonFormFlavorText');

/**
 * @record
 */
API.Client.PokemonFormFlavorText = function() {}

/**
 * The localized flavor text for an API resource in a specific language. Note that this text is left unprocessed as it is found in game files. This means that it contains special characters that one might want to replace with their visible decodable version. Please check out this <a href='https://github.com/veekun/pokedex/issues/218#issuecomment-339841781' >issue</a> to find out more. 
 * @type {!string}
 * @export
 */
API.Client.PokemonFormFlavorText.prototype.flavorText;

/**
 * The language this name is in.
 * @type {!API.Client.LanguageSummary}
 * @export
 */
API.Client.PokemonFormFlavorText.prototype.language;

/**
 * The game version this flavor text is extracted from.
 * @type {!API.Client.VersionSummary}
 * @export
 */
API.Client.PokemonFormFlavorText.prototype.version;

