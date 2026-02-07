package models

type EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner struct {

	Gender EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender `json:"gender"`

	HeldItem EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender `json:"held_item"`

	Item EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender `json:"item"`

	KnownMove map[string]interface{} `json:"known_move"`

	KnownMoveType map[string]interface{} `json:"known_move_type"`

	Location EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender `json:"location"`

	MinAffection int32 `json:"min_affection"`

	MinBeauty int32 `json:"min_beauty"`

	MinHappiness int32 `json:"min_happiness"`

	MinLevel int32 `json:"min_level"`

	NeedsOverworldRain bool `json:"needs_overworld_rain"`

	PartySpecies string `json:"party_species"`

	PartyType string `json:"party_type"`

	RelativePhysicalStats string `json:"relative_physical_stats"`

	TimeOfDay string `json:"time_of_day"`

	TradeSpecies string `json:"trade_species"`

	Trigger AbilityDetailPokemonInnerPokemon `json:"trigger"`

	TurnUpsideDown bool `json:"turn_upside_down"`
}
