/*


No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

API version: 20220523
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
	"fmt"
)

// EvolutionChainChainEvolutionDetailsInnerLocation - struct for EvolutionChainChainEvolutionDetailsInnerLocation
type EvolutionChainChainEvolutionDetailsInnerLocation struct {
	Location *Location
	Interface{} *interface{}
}

// LocationAsEvolutionChainChainEvolutionDetailsInnerLocation is a convenience function that returns Location wrapped in EvolutionChainChainEvolutionDetailsInnerLocation
func LocationAsEvolutionChainChainEvolutionDetailsInnerLocation(v *Location) EvolutionChainChainEvolutionDetailsInnerLocation {
	return EvolutionChainChainEvolutionDetailsInnerLocation{
		Location: v,
	}
}

// interface{}AsEvolutionChainChainEvolutionDetailsInnerLocation is a convenience function that returns interface{} wrapped in EvolutionChainChainEvolutionDetailsInnerLocation
func Interface{}AsEvolutionChainChainEvolutionDetailsInnerLocation(v *interface{}) EvolutionChainChainEvolutionDetailsInnerLocation {
	return EvolutionChainChainEvolutionDetailsInnerLocation{
		Interface{}: v,
	}
}


// Unmarshal JSON data into one of the pointers in the struct
func (dst *EvolutionChainChainEvolutionDetailsInnerLocation) UnmarshalJSON(data []byte) error {
	var err error
	match := 0
	// try to unmarshal data into Location
	err = newStrictDecoder(data).Decode(&dst.Location)
	if err == nil {
		jsonLocation, _ := json.Marshal(dst.Location)
		if string(jsonLocation) == "{}" { // empty struct
			dst.Location = nil
		} else {
			match++
		}
	} else {
		dst.Location = nil
	}

	// try to unmarshal data into Interface{}
	err = newStrictDecoder(data).Decode(&dst.Interface{})
	if err == nil {
		jsonInterface{}, _ := json.Marshal(dst.Interface{})
		if string(jsonInterface{}) == "{}" { // empty struct
			dst.Interface{} = nil
		} else {
			match++
		}
	} else {
		dst.Interface{} = nil
	}

	if match > 1 { // more than 1 match
		// reset to nil
		dst.Location = nil
		dst.Interface{} = nil

		return fmt.Errorf("data matches more than one schema in oneOf(EvolutionChainChainEvolutionDetailsInnerLocation)")
	} else if match == 1 {
		return nil // exactly one match
	} else { // no match
		return fmt.Errorf("data failed to match schemas in oneOf(EvolutionChainChainEvolutionDetailsInnerLocation)")
	}
}

// Marshal data from the first non-nil pointers in the struct to JSON
func (src EvolutionChainChainEvolutionDetailsInnerLocation) MarshalJSON() ([]byte, error) {
	if src.Location != nil {
		return json.Marshal(&src.Location)
	}

	if src.Interface{} != nil {
		return json.Marshal(&src.Interface{})
	}

	return nil, nil // no data in oneOf schemas
}

// Get the actual instance
func (obj *EvolutionChainChainEvolutionDetailsInnerLocation) GetActualInstance() (interface{}) {
	if obj == nil {
		return nil
	}
	if obj.Location != nil {
		return obj.Location
	}

	if obj.Interface{} != nil {
		return obj.Interface{}
	}

	// all schemas are nil
	return nil
}

type NullableEvolutionChainChainEvolutionDetailsInnerLocation struct {
	value *EvolutionChainChainEvolutionDetailsInnerLocation
	isSet bool
}

func (v NullableEvolutionChainChainEvolutionDetailsInnerLocation) Get() *EvolutionChainChainEvolutionDetailsInnerLocation {
	return v.value
}

func (v *NullableEvolutionChainChainEvolutionDetailsInnerLocation) Set(val *EvolutionChainChainEvolutionDetailsInnerLocation) {
	v.value = val
	v.isSet = true
}

func (v NullableEvolutionChainChainEvolutionDetailsInnerLocation) IsSet() bool {
	return v.isSet
}

func (v *NullableEvolutionChainChainEvolutionDetailsInnerLocation) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableEvolutionChainChainEvolutionDetailsInnerLocation(val *EvolutionChainChainEvolutionDetailsInnerLocation) *NullableEvolutionChainChainEvolutionDetailsInnerLocation {
	return &NullableEvolutionChainChainEvolutionDetailsInnerLocation{value: val, isSet: true}
}

func (v NullableEvolutionChainChainEvolutionDetailsInnerLocation) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableEvolutionChainChainEvolutionDetailsInnerLocation) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


