package models

type PokemonFormTriggerCondition struct {

	// The trigger for this form change.
	Trigger string `json:"trigger"`

	// The name of the required item, ability, or move. Only present for a resource-based trigger.
	Name string `json:"name,omitempty"`

	// The URL of the required item, ability, or move. Only present for a resource-based trigger.
	Url string `json:"url,omitempty"`

	// The required base form. Only present when the trigger specifies one.
	BaseForm PokemonFormSummary `json:"base_form,omitempty"`
}
