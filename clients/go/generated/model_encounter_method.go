/*


No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

API version: 20220523
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
)

// EncounterMethod struct for EncounterMethod
type EncounterMethod struct {
	// The identifier for this encounter method resource
	Id int32 `json:"id"`
	// The name for this encounter method resource
	Name string `json:"name"`
	// A good value for sorting
	Order int32 `json:"order"`
}

// NewEncounterMethod instantiates a new EncounterMethod object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewEncounterMethod(id int32, name string, order int32) *EncounterMethod {
	this := EncounterMethod{}
	this.Id = id
	this.Name = name
	this.Order = order
	return &this
}

// NewEncounterMethodWithDefaults instantiates a new EncounterMethod object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewEncounterMethodWithDefaults() *EncounterMethod {
	this := EncounterMethod{}
	return &this
}

// GetId returns the Id field value
func (o *EncounterMethod) GetId() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *EncounterMethod) GetIdOk() (*int32, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *EncounterMethod) SetId(v int32) {
	o.Id = v
}

// GetName returns the Name field value
func (o *EncounterMethod) GetName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Name
}

// GetNameOk returns a tuple with the Name field value
// and a boolean to check if the value has been set.
func (o *EncounterMethod) GetNameOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Name, true
}

// SetName sets field value
func (o *EncounterMethod) SetName(v string) {
	o.Name = v
}

// GetOrder returns the Order field value
func (o *EncounterMethod) GetOrder() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Order
}

// GetOrderOk returns a tuple with the Order field value
// and a boolean to check if the value has been set.
func (o *EncounterMethod) GetOrderOk() (*int32, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Order, true
}

// SetOrder sets field value
func (o *EncounterMethod) SetOrder(v int32) {
	o.Order = v
}

func (o EncounterMethod) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["id"] = o.Id
	}
	if true {
		toSerialize["name"] = o.Name
	}
	if true {
		toSerialize["order"] = o.Order
	}
	return json.Marshal(toSerialize)
}

type NullableEncounterMethod struct {
	value *EncounterMethod
	isSet bool
}

func (v NullableEncounterMethod) Get() *EncounterMethod {
	return v.value
}

func (v *NullableEncounterMethod) Set(val *EncounterMethod) {
	v.value = val
	v.isSet = true
}

func (v NullableEncounterMethod) IsSet() bool {
	return v.isSet
}

func (v *NullableEncounterMethod) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableEncounterMethod(val *EncounterMethod) *NullableEncounterMethod {
	return &NullableEncounterMethod{value: val, isSet: true}
}

func (v NullableEncounterMethod) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableEncounterMethod) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


