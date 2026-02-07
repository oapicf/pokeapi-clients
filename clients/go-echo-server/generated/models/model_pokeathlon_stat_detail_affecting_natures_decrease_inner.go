package models

type PokeathlonStatDetailAffectingNaturesDecreaseInner struct {

	MaxChange int32 `json:"max_change"`

	Nature AbilityDetailPokemonInnerPokemon `json:"nature"`
}
