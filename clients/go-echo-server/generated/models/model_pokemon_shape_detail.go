package models

type PokemonShapeDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The name for this resource.
	Name string `json:"name"`

	// The \"scientific\" name of this Pokémon shape listed in different languages.
	AwesomeNames []PokemonShapeAwesomeName `json:"awesome_names"`

	// The name of this resource listed in different languages.
	Names []PokemonShapeName `json:"names"`

	// A list of the Pokémon species that have this shape.
	PokemonSpecies []PokemonSpeciesSummary `json:"pokemon_species"`
}
