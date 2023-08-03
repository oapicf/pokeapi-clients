# PokeAthlon

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | 
**Name** | **string** |  | 
**Names** | [**[]PokeathlonStatName**](PokeathlonStatName.md) |  | 

## Methods

### NewPokeAthlon

`func NewPokeAthlon(id int32, name string, names []PokeathlonStatName, ) *PokeAthlon`

NewPokeAthlon instantiates a new PokeAthlon object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokeAthlonWithDefaults

`func NewPokeAthlonWithDefaults() *PokeAthlon`

NewPokeAthlonWithDefaults instantiates a new PokeAthlon object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *PokeAthlon) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *PokeAthlon) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *PokeAthlon) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *PokeAthlon) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *PokeAthlon) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *PokeAthlon) SetName(v string)`

SetName sets Name field to given value.


### GetNames

`func (o *PokeAthlon) GetNames() []PokeathlonStatName`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *PokeAthlon) GetNamesOk() (*[]PokeathlonStatName, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *PokeAthlon) SetNames(v []PokeathlonStatName)`

SetNames sets Names field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


