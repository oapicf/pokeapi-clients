package models

type PokeathlonStatAffectingNatures struct {

	// A list of natures and how they change the referenced Pokéathlon stat.
	Increase []PokeathlonStatAffectingNature `json:"increase"`

	// A list of natures and how they change the referenced Pokéathlon stat.
	Decrease []PokeathlonStatAffectingNature `json:"decrease"`
}
