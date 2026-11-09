package models

type ItemDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The name for this resource.
	Name string `json:"name"`

	// The power of the move Fling when used with this item.
	FlingPower *int32 `json:"fling_power,omitempty"`

	// The effect of the move Fling when used with this item.
	FlingEffect *ItemFlingEffectSummary `json:"fling_effect"`

	// A list of attributes this item has.
	Attributes []ItemAttributeSummary `json:"attributes"`

	// The category of items this item falls into.
	Category ItemCategorySummary `json:"category"`

	// The effect of this ability listed in different languages.
	EffectEntries []ItemEffectText `json:"effect_entries"`

	// The flavor text of this ability listed in different languages.
	FlavorTextEntries []ItemFlavorText `json:"flavor_text_entries"`

	// A list of game indices relevent to this item by generation.
	GameIndices []ItemGameIndex `json:"game_indices"`

	// Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold.
	Prices []ItemPrice `json:"prices"`

	// The name of this item listed in different languages.
	Names []ItemName `json:"names"`

	// A list of Pokémon that might be found in the wild holding this item.
	HeldByPokemon []PokemonHeldItem `json:"held_by_pokemon"`

	// A set of sprites used to depict this item in the game.
	Sprites ItemSprites `json:"sprites"`

	// An evolution chain this item requires to produce a bay during mating.
	BabyTriggerFor *EvolutionChainSummary `json:"baby_trigger_for"`

	// A list of the machines related to this item.
	Machines []ItemMachine `json:"machines"`
}
