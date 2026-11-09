package models

type PokedexDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The name for this resource.
	Name string `json:"name"`

	// Whether or not this Pokédex originated in the main series of the video games.
	IsMainSeries bool `json:"is_main_series,omitempty"`

	// The description of this resource listed in different languages.
	Descriptions []PokedexDescription `json:"descriptions"`

	// The name of this resource listed in different languages.
	Names []PokedexName `json:"names"`

	// A list of Pokémon catalogued in this Pokédex and their indexes.
	PokemonEntries []PokemonDexNumber `json:"pokemon_entries"`

	// The region this Pokédex catalogues Pokémon for.
	Region *RegionSummary `json:"region"`

	// A list of version groups this Pokédex is relevant to.
	VersionGroups []VersionGroupSummary `json:"version_groups"`
}
