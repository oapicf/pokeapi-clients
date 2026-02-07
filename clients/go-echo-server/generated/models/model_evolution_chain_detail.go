package models

type EvolutionChainDetail struct {

	Id int32 `json:"id"`

	BabyTriggerItem ItemSummary `json:"baby_trigger_item"`

	Chain EvolutionChainDetailChain `json:"chain"`
}
