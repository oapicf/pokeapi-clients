package models

type TypeDetailDamageRelations struct {

	NoDamageTo []AbilityDetailPokemonInnerPokemon `json:"no_damage_to"`

	HalfDamageTo []AbilityDetailPokemonInnerPokemon `json:"half_damage_to"`

	DoubleDamageTo []AbilityDetailPokemonInnerPokemon `json:"double_damage_to"`

	NoDamageFrom []AbilityDetailPokemonInnerPokemon `json:"no_damage_from"`

	HalfDamageFrom []AbilityDetailPokemonInnerPokemon `json:"half_damage_from"`

	DoubleDamageFrom []AbilityDetailPokemonInnerPokemon `json:"double_damage_from"`
}
