package models

type TypeRelationships struct {

	// A list of types this type has no effect on.
	NoDamageTo []TypeSummary `json:"no_damage_to"`

	// A list of types this type is not very effect against.
	HalfDamageTo []TypeSummary `json:"half_damage_to"`

	// A list of types this type is very effect against.
	DoubleDamageTo []TypeSummary `json:"double_damage_to"`

	// A list of types that have no effect on this type.
	NoDamageFrom []TypeSummary `json:"no_damage_from"`

	// A list of types that are not very effective against this type.
	HalfDamageFrom []TypeSummary `json:"half_damage_from"`

	// A list of types that are very effective against this type.
	DoubleDamageFrom []TypeSummary `json:"double_damage_from"`
}
