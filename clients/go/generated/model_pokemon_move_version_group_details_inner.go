/*


No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

API version: 20220523
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
)

// PokemonMoveVersionGroupDetailsInner struct for PokemonMoveVersionGroupDetailsInner
type PokemonMoveVersionGroupDetailsInner struct {
	// The minimum level to learn the move
	LevelLearnedAt int32 `json:"level_learned_at"`
	MoveLearnMethod NamedAPIResource `json:"move_learn_method"`
	VersionGroup NamedAPIResource `json:"version_group"`
}

// NewPokemonMoveVersionGroupDetailsInner instantiates a new PokemonMoveVersionGroupDetailsInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewPokemonMoveVersionGroupDetailsInner(levelLearnedAt int32, moveLearnMethod NamedAPIResource, versionGroup NamedAPIResource) *PokemonMoveVersionGroupDetailsInner {
	this := PokemonMoveVersionGroupDetailsInner{}
	this.LevelLearnedAt = levelLearnedAt
	this.MoveLearnMethod = moveLearnMethod
	this.VersionGroup = versionGroup
	return &this
}

// NewPokemonMoveVersionGroupDetailsInnerWithDefaults instantiates a new PokemonMoveVersionGroupDetailsInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewPokemonMoveVersionGroupDetailsInnerWithDefaults() *PokemonMoveVersionGroupDetailsInner {
	this := PokemonMoveVersionGroupDetailsInner{}
	return &this
}

// GetLevelLearnedAt returns the LevelLearnedAt field value
func (o *PokemonMoveVersionGroupDetailsInner) GetLevelLearnedAt() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.LevelLearnedAt
}

// GetLevelLearnedAtOk returns a tuple with the LevelLearnedAt field value
// and a boolean to check if the value has been set.
func (o *PokemonMoveVersionGroupDetailsInner) GetLevelLearnedAtOk() (*int32, bool) {
	if o == nil {
    return nil, false
	}
	return &o.LevelLearnedAt, true
}

// SetLevelLearnedAt sets field value
func (o *PokemonMoveVersionGroupDetailsInner) SetLevelLearnedAt(v int32) {
	o.LevelLearnedAt = v
}

// GetMoveLearnMethod returns the MoveLearnMethod field value
func (o *PokemonMoveVersionGroupDetailsInner) GetMoveLearnMethod() NamedAPIResource {
	if o == nil {
		var ret NamedAPIResource
		return ret
	}

	return o.MoveLearnMethod
}

// GetMoveLearnMethodOk returns a tuple with the MoveLearnMethod field value
// and a boolean to check if the value has been set.
func (o *PokemonMoveVersionGroupDetailsInner) GetMoveLearnMethodOk() (*NamedAPIResource, bool) {
	if o == nil {
    return nil, false
	}
	return &o.MoveLearnMethod, true
}

// SetMoveLearnMethod sets field value
func (o *PokemonMoveVersionGroupDetailsInner) SetMoveLearnMethod(v NamedAPIResource) {
	o.MoveLearnMethod = v
}

// GetVersionGroup returns the VersionGroup field value
func (o *PokemonMoveVersionGroupDetailsInner) GetVersionGroup() NamedAPIResource {
	if o == nil {
		var ret NamedAPIResource
		return ret
	}

	return o.VersionGroup
}

// GetVersionGroupOk returns a tuple with the VersionGroup field value
// and a boolean to check if the value has been set.
func (o *PokemonMoveVersionGroupDetailsInner) GetVersionGroupOk() (*NamedAPIResource, bool) {
	if o == nil {
    return nil, false
	}
	return &o.VersionGroup, true
}

// SetVersionGroup sets field value
func (o *PokemonMoveVersionGroupDetailsInner) SetVersionGroup(v NamedAPIResource) {
	o.VersionGroup = v
}

func (o PokemonMoveVersionGroupDetailsInner) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["level_learned_at"] = o.LevelLearnedAt
	}
	if true {
		toSerialize["move_learn_method"] = o.MoveLearnMethod
	}
	if true {
		toSerialize["version_group"] = o.VersionGroup
	}
	return json.Marshal(toSerialize)
}

type NullablePokemonMoveVersionGroupDetailsInner struct {
	value *PokemonMoveVersionGroupDetailsInner
	isSet bool
}

func (v NullablePokemonMoveVersionGroupDetailsInner) Get() *PokemonMoveVersionGroupDetailsInner {
	return v.value
}

func (v *NullablePokemonMoveVersionGroupDetailsInner) Set(val *PokemonMoveVersionGroupDetailsInner) {
	v.value = val
	v.isSet = true
}

func (v NullablePokemonMoveVersionGroupDetailsInner) IsSet() bool {
	return v.isSet
}

func (v *NullablePokemonMoveVersionGroupDetailsInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullablePokemonMoveVersionGroupDetailsInner(val *PokemonMoveVersionGroupDetailsInner) *NullablePokemonMoveVersionGroupDetailsInner {
	return &NullablePokemonMoveVersionGroupDetailsInner{value: val, isSet: true}
}

func (v NullablePokemonMoveVersionGroupDetailsInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullablePokemonMoveVersionGroupDetailsInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


