package models

type MoveDetailEffectChangesInner struct {

	EffectEntries []MoveDetailEffectChangesInnerEffectEntriesInner `json:"effect_entries"`

	VersionGroup AbilityDetailPokemonInnerPokemon `json:"version_group"`
}
