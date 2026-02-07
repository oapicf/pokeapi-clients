package models

type PokeathlonStatDetailAffectingNatures struct {

	Decrease []PokeathlonStatDetailAffectingNaturesDecreaseInner `json:"decrease"`

	Increase []PokeathlonStatDetailAffectingNaturesIncreaseInner `json:"increase"`
}
