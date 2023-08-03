# PokeathlonStatAffectingNatures

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Increase** | Pointer to [**[]NaturePokeathlonStatAffectSets**](NaturePokeathlonStatAffectSets.md) | A list of natures that positively affect this Pokéathlon stat | [optional] 
**Decrease** | Pointer to [**[]NaturePokeathlonStatAffectSets**](NaturePokeathlonStatAffectSets.md) | A list of natures that negatively affect this Pokéathlon stat | [optional] 

## Methods

### NewPokeathlonStatAffectingNatures

`func NewPokeathlonStatAffectingNatures() *PokeathlonStatAffectingNatures`

NewPokeathlonStatAffectingNatures instantiates a new PokeathlonStatAffectingNatures object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokeathlonStatAffectingNaturesWithDefaults

`func NewPokeathlonStatAffectingNaturesWithDefaults() *PokeathlonStatAffectingNatures`

NewPokeathlonStatAffectingNaturesWithDefaults instantiates a new PokeathlonStatAffectingNatures object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIncrease

`func (o *PokeathlonStatAffectingNatures) GetIncrease() []NaturePokeathlonStatAffectSets`

GetIncrease returns the Increase field if non-nil, zero value otherwise.

### GetIncreaseOk

`func (o *PokeathlonStatAffectingNatures) GetIncreaseOk() (*[]NaturePokeathlonStatAffectSets, bool)`

GetIncreaseOk returns a tuple with the Increase field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIncrease

`func (o *PokeathlonStatAffectingNatures) SetIncrease(v []NaturePokeathlonStatAffectSets)`

SetIncrease sets Increase field to given value.

### HasIncrease

`func (o *PokeathlonStatAffectingNatures) HasIncrease() bool`

HasIncrease returns a boolean if a field has been set.

### GetDecrease

`func (o *PokeathlonStatAffectingNatures) GetDecrease() []NaturePokeathlonStatAffectSets`

GetDecrease returns the Decrease field if non-nil, zero value otherwise.

### GetDecreaseOk

`func (o *PokeathlonStatAffectingNatures) GetDecreaseOk() (*[]NaturePokeathlonStatAffectSets, bool)`

GetDecreaseOk returns a tuple with the Decrease field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDecrease

`func (o *PokeathlonStatAffectingNatures) SetDecrease(v []NaturePokeathlonStatAffectSets)`

SetDecrease sets Decrease field to given value.

### HasDecrease

`func (o *PokeathlonStatAffectingNatures) HasDecrease() bool`

HasDecrease returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


