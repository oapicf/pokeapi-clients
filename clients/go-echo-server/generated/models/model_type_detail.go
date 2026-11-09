package models

// TypeDetail - Serializer for the Type resource
type TypeDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The name for this resource.
	Name string `json:"name"`

	// A detail of how effective this type is toward others and vice versa.
	DamageRelations TypeRelationships `json:"damage_relations"`

	// A list of details of how effective this type was toward others and vice versa in previous generations
	PastDamageRelations []TypePastRelationships `json:"past_damage_relations"`

	// A list of game indices relevent to this item by generation.
	GameIndices []TypeGameIndex `json:"game_indices"`

	// The generation this type was introduced in.
	Generation GenerationSummary `json:"generation"`

	// The class of damage inflicted by this type.
	MoveDamageClass *MoveDamageClassSummary `json:"move_damage_class"`

	// The name of this resource listed in different languages.
	Names []TypeName `json:"names"`

	// A list of details of Pokémon that have this type.
	Pokemon []TypePokemon `json:"pokemon"`

	// A list of moves that have this type.
	Moves []MoveSummary `json:"moves"`

	// Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null.
	Sprites map[string]map[string]TypeGameSprite `json:"sprites"`
}
