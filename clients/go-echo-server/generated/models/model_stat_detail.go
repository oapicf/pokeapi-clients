package models

type StatDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The name for this resource.
	Name string `json:"name"`

	// ID the games use for this stat.
	GameIndex int32 `json:"game_index"`

	// Whether this stat only exists within a battle.
	IsBattleOnly bool `json:"is_battle_only,omitempty"`

	// A detail of moves which affect this stat positively or negatively.
	AffectingMoves StatAffectingMoves `json:"affecting_moves"`

	// A detail of natures which affect this stat positively or negatively.
	AffectingNatures StatAffectingNatures `json:"affecting_natures"`

	// Items that affect this stat, such as vitamins and battle items.
	AffectingItems []ItemSummary `json:"affecting_items"`

	// A list of characteristics that are set on a Pokémon when its highest base stat is this stat.
	Characteristics []CharacteristicSummary `json:"characteristics"`

	// The class of damage this stat is directly related to.
	MoveDamageClass *MoveDamageClassSummary `json:"move_damage_class"`

	// The name of this resource listed in different languages.
	Names []StatName `json:"names"`
}
