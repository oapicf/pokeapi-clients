package models

type TypeDetailPokemonInnerPokemon struct {

	// The name of the pokemon
	Name string `json:"name,omitempty"`

	// The URL to get more information about the pokemon
	Url string `json:"url,omitempty"`
}
