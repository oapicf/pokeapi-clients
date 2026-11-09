# PokeathlonStatAffectingNature

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MaxChange** | **int32** | The maximum amount of change to the referenced Pokéathlon stat. | 
**Nature** | [**NatureSummary**](NatureSummary.md) | The nature causing the change. | 

## Methods

### NewPokeathlonStatAffectingNature

`func NewPokeathlonStatAffectingNature(maxChange int32, nature NatureSummary, ) *PokeathlonStatAffectingNature`

NewPokeathlonStatAffectingNature instantiates a new PokeathlonStatAffectingNature object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokeathlonStatAffectingNatureWithDefaults

`func NewPokeathlonStatAffectingNatureWithDefaults() *PokeathlonStatAffectingNature`

NewPokeathlonStatAffectingNatureWithDefaults instantiates a new PokeathlonStatAffectingNature object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMaxChange

`func (o *PokeathlonStatAffectingNature) GetMaxChange() int32`

GetMaxChange returns the MaxChange field if non-nil, zero value otherwise.

### GetMaxChangeOk

`func (o *PokeathlonStatAffectingNature) GetMaxChangeOk() (*int32, bool)`

GetMaxChangeOk returns a tuple with the MaxChange field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxChange

`func (o *PokeathlonStatAffectingNature) SetMaxChange(v int32)`

SetMaxChange sets MaxChange field to given value.


### GetNature

`func (o *PokeathlonStatAffectingNature) GetNature() NatureSummary`

GetNature returns the Nature field if non-nil, zero value otherwise.

### GetNatureOk

`func (o *PokeathlonStatAffectingNature) GetNatureOk() (*NatureSummary, bool)`

GetNatureOk returns a tuple with the Nature field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNature

`func (o *PokeathlonStatAffectingNature) SetNature(v NatureSummary)`

SetNature sets Nature field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


