package models

type AbilityDetail struct {

	Id int32 `json:"id"`

	Name string `json:"name"`

	IsMainSeries bool `json:"is_main_series,omitempty"`

	Generation GenerationSummary `json:"generation"`

	Names []AbilityName `json:"names"`

	EffectEntries []AbilityEffectText `json:"effect_entries"`

	EffectChanges []AbilityChange `json:"effect_changes"`

	FlavorTextEntries []AbilityFlavorText `json:"flavor_text_entries"`

	Pokemon []AbilityDetailPokemonInner `json:"pokemon"`
}
