package models

type PokemonDetailMovesInnerVersionGroupDetailsInner struct {

	LevelLearnedAt int32 `json:"level_learned_at"`

	MoveLearnMethod AbilityDetailPokemonInnerPokemon `json:"move_learn_method"`

	VersionGroup AbilityDetailPokemonInnerPokemon `json:"version_group"`
}
