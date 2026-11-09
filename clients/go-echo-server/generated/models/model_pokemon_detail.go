package models

type PokemonDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The name for this resource.
	Name string `json:"name"`

	// The base experience gained for defeating this Pokémon.
	BaseExperience *int32 `json:"base_experience,omitempty"`

	// The height of this Pokémon in decimetres.
	Height *int32 `json:"height,omitempty"`

	// Set for exactly one Pokémon used as the default for each species.
	IsDefault bool `json:"is_default,omitempty"`

	// Order for sorting. Almost national order, except families are grouped together.
	Order *int32 `json:"order,omitempty"`

	// The weight of this Pokémon in hectograms.
	Weight *int32 `json:"weight,omitempty"`

	// A list of abilities this Pokémon could potentially have.
	Abilities []PokemonAbility `json:"abilities"`

	// A list of details showing abilities this pokémon had in previous generations
	PastAbilities []PokemonPastAbility `json:"past_abilities"`

	// A list of forms this Pokémon can take on.
	Forms []PokemonFormSummary `json:"forms"`

	// A list of game indices relevent to Pokémon item by generation.
	GameIndices []PokemonGameIndex `json:"game_indices"`

	// A list of items this Pokémon may be holding when encountered.
	HeldItems []PokemonHeldItemSummary `json:"held_items"`

	// A link to a list of location areas, as well as encounter details pertaining to specific versions.
	LocationAreaEncounters string `json:"location_area_encounters"`

	// A list of moves along with learn methods and level details pertaining to specific version groups.
	Moves []PokemonMove `json:"moves"`

	// The species this Pokémon belongs to.
	Species PokemonSpeciesSummary `json:"species"`

	// A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at <a href='https://github.com/PokeAPI/sprites#sprites'>PokeAPI/sprites</a>
	Sprites PokemonSprites `json:"sprites"`

	// A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at <a href='https://github.com/PokeAPI/cries#cries'>PokeAPI/cries</a>
	Cries PokemonCries `json:"cries"`

	// A list of base stat values for this Pokémon.
	Stats []PokemonStat `json:"stats"`

	// A list of details showing stats this pokémon had in previous generations
	PastStats []PokemonPastStat `json:"past_stats"`

	// A list of details showing types this Pokémon has.
	Types []PokemonType `json:"types"`

	// A list of details showing types this pokémon had in previous generations
	PastTypes []PokemonPastType `json:"past_types"`
}
