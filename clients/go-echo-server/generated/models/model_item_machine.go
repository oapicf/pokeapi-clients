package models

type ItemMachine struct {

	// The machine that teaches a move from an item.
	Machine MachineSummary `json:"machine"`

	// The version group of this specific machine.
	VersionGroup VersionGroupSummary `json:"version_group"`
}
