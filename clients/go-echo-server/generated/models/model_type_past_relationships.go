package models

type TypePastRelationships struct {

	// The last generation in which the referenced type had the listed damage relations
	Generation GenerationSummary `json:"generation"`

	// The damage relations the referenced type had up to and including the listed generation
	DamageRelations TypeRelationships `json:"damage_relations"`
}
