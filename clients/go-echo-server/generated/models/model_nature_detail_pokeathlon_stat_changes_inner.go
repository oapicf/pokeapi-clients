package models

type NatureDetailPokeathlonStatChangesInner struct {

	MaxChange int32 `json:"max_change"`

	PokeathlonStat AbilityDetailPokemonInnerPokemon `json:"pokeathlon_stat"`
}
