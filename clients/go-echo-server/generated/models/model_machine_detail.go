package models

type MachineDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The TM or HM item that corresponds to this machine.
	Item ItemSummary `json:"item"`

	// The version group that this machine applies to.
	VersionGroup VersionGroupSummary `json:"version_group"`

	// The move that is taught by this machine.
	Move MoveSummary `json:"move"`
}
