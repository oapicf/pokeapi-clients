package models

type TypeGameSprite struct {

	// The URL of the icon displaying the type name in this game, or null if unavailable.
	NameIcon *string `json:"name_icon,omitempty"`

	// The URL of the type symbol icon in this game, or null if unavailable.
	SymbolIcon *string `json:"symbol_icon,omitempty"`
}
