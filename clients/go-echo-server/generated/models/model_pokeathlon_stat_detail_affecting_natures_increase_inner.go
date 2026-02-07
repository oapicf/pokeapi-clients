package models

type PokeathlonStatDetailAffectingNaturesIncreaseInner struct {

	MaxChange int32 `json:"max_change"`

	Nature AbilityDetailPokemonInnerPokemon `json:"nature"`
}
