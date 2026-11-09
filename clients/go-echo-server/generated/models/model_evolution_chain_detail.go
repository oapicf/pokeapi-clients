package models

type EvolutionChainDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The item that a Pokémon would be holding when mating that would trigger the egg hatching a baby Pokémon rather than a basic Pokémon.
	BabyTriggerItem *ItemSummary `json:"baby_trigger_item"`

	// The base chain link object. Each link contains evolution details for a Pokémon in the chain. Each link references the next Pokémon in the natural evolution order.
	Chain EvolutionChainLink `json:"chain"`
}
