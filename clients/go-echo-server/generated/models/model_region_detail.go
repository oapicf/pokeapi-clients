package models

type RegionDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The name for this resource.
	Name string `json:"name"`

	// A list of locations that can be found in this region.
	Locations []LocationSummary `json:"locations"`

	// The generation this region was introduced in.
	MainGeneration *GenerationSummary `json:"main_generation"`

	// The name of this resource listed in different languages.
	Names []RegionName `json:"names"`

	// A list of pokédexes that catalogue Pokémon in this region.
	Pokedexes []PokedexSummary `json:"pokedexes"`

	// A list of version groups where this region can be visited.
	VersionGroups []VersionGroupSummary `json:"version_groups"`
}
