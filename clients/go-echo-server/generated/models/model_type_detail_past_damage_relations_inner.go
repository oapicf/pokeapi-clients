package models

type TypeDetailPastDamageRelationsInner struct {

	Generation AbilityDetailPokemonInnerPokemon `json:"generation"`

	DamageRelations TypeDetailPastDamageRelationsInnerDamageRelations `json:"damage_relations"`
}
