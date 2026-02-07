package models

type PokemonDetail struct {

	Id int32 `json:"id"`

	Name string `json:"name"`

	BaseExperience *int32 `json:"base_experience,omitempty"`

	Height *int32 `json:"height,omitempty"`

	IsDefault bool `json:"is_default,omitempty"`

	Order *int32 `json:"order,omitempty"`

	Weight *int32 `json:"weight,omitempty"`

	Abilities []PokemonDetailAbilitiesInner `json:"abilities"`

	PastAbilities []PokemonDetailPastAbilitiesInner `json:"past_abilities"`

	Forms []PokemonFormSummary `json:"forms"`

	GameIndices []PokemonGameIndex `json:"game_indices"`

	HeldItems PokemonDetailHeldItems `json:"held_items"`

	LocationAreaEncounters string `json:"location_area_encounters"`

	Moves []PokemonDetailMovesInner `json:"moves"`

	Species PokemonSpeciesSummary `json:"species"`

	Sprites PokemonDetailSprites `json:"sprites"`

	Cries PokemonDetailCries `json:"cries"`

	Stats []PokemonStat `json:"stats"`

	Types []PokemonDetailTypesInner `json:"types"`

	PastTypes []PokemonDetailPastTypesInner `json:"past_types"`
}
