goog.provide('API.Client.PokedexDetail');

/**
 * @record
 */
API.Client.PokedexDetail = function() {}

/**
 * The identifier for this resource.
 * @type {!number}
 * @export
 */
API.Client.PokedexDetail.prototype.id;

/**
 * The name for this resource.
 * @type {!string}
 * @export
 */
API.Client.PokedexDetail.prototype.name;

/**
 * Whether or not this Pokédex originated in the main series of the video games.
 * @type {!boolean}
 * @export
 */
API.Client.PokedexDetail.prototype.isMainSeries;

/**
 * The description of this resource listed in different languages.
 * @type {!Array<!API.Client.PokedexDescription>}
 * @export
 */
API.Client.PokedexDetail.prototype.descriptions;

/**
 * The name of this resource listed in different languages.
 * @type {!Array<!API.Client.PokedexName>}
 * @export
 */
API.Client.PokedexDetail.prototype.names;

/**
 * A list of Pokémon catalogued in this Pokédex and their indexes.
 * @type {!Array<!API.Client.PokemonDexNumber>}
 * @export
 */
API.Client.PokedexDetail.prototype.pokemonEntries;

/**
 * The region this Pokédex catalogues Pokémon for.
 * @type {!API.Client.RegionSummary}
 * @export
 */
API.Client.PokedexDetail.prototype.region;

/**
 * A list of version groups this Pokédex is relevant to.
 * @type {!Array<!API.Client.VersionGroupSummary>}
 * @export
 */
API.Client.PokedexDetail.prototype.versionGroups;

