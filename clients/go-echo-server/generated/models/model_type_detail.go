package models

// TypeDetail - Serializer for the Type resource
type TypeDetail struct {

	Id int32 `json:"id"`

	Name string `json:"name"`

	DamageRelations TypeDetailDamageRelations `json:"damage_relations"`

	PastDamageRelations []TypeDetailPastDamageRelationsInner `json:"past_damage_relations"`

	GameIndices []TypeGameIndex `json:"game_indices"`

	Generation GenerationSummary `json:"generation"`

	MoveDamageClass MoveDamageClassSummary `json:"move_damage_class"`

	Names []AbilityName `json:"names"`

	Pokemon []TypeDetailPokemonInner `json:"pokemon"`

	Moves []MoveSummary `json:"moves"`

	Sprites map[string]map[string]TypeDetailSpritesValueValue `json:"sprites"`
}
