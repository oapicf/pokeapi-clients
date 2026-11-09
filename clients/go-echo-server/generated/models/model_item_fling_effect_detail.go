package models

type ItemFlingEffectDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The name for this resource.
	Name string `json:"name"`

	// The result of this fling effect listed in different languages.
	EffectEntries []ItemFlingEffectEffectText `json:"effect_entries"`

	// A list of items that have this fling effect.
	Items []ItemSummary `json:"items"`
}
