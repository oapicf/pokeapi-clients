package models

type ItemFlingEffectDetail struct {

	Id int32 `json:"id"`

	Name string `json:"name"`

	EffectEntries []ItemFlingEffectEffectText `json:"effect_entries"`

	Items []ItemSummary `json:"items"`
}
