package models

type VersionGroupDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The name for this resource.
	Name string `json:"name"`

	// Order for sorting. Almost by date of release, except similar versions are grouped together.
	Order *int32 `json:"order,omitempty"`

	// The generation this version was introduced in.
	Generation GenerationSummary `json:"generation"`

	// A list of methods in which Pokémon can learn moves in this version group.
	MoveLearnMethods []MoveLearnMethodSummary `json:"move_learn_methods"`

	// A list of Pokédexes introduces in this version group.
	Pokedexes []PokedexSummary `json:"pokedexes"`

	// A list of regions that can be visited in this version group.
	Regions []RegionSummary `json:"regions"`

	// The versions this version group owns.
	Versions []VersionSummary `json:"versions"`
}
