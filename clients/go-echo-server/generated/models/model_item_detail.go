package models

type ItemDetail struct {

	Id int32 `json:"id"`

	Name string `json:"name"`

	Cost *int32 `json:"cost,omitempty"`

	FlingPower *int32 `json:"fling_power,omitempty"`

	FlingEffect ItemFlingEffectSummary `json:"fling_effect"`

	Attributes []AbilityDetailPokemonInnerPokemon `json:"attributes"`

	Category ItemCategorySummary `json:"category"`

	EffectEntries []ItemEffectText `json:"effect_entries"`

	FlavorTextEntries []ItemFlavorText `json:"flavor_text_entries"`

	GameIndices []ItemGameIndex `json:"game_indices"`

	Names []ItemName `json:"names"`

	HeldByPokemon []ItemDetailHeldByPokemonInner `json:"held_by_pokemon"`

	Sprites ItemDetailSprites `json:"sprites"`

	BabyTriggerFor ItemDetailBabyTriggerFor `json:"baby_trigger_for"`

	Machines []ItemDetailMachinesInner `json:"machines"`
}
