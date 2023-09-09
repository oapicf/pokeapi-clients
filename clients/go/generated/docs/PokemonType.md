# PokemonType

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Slot** | Pointer to **int32** | The order the Pokémon&#39;s types are listed in. | [optional] 
**Type** | Pointer to [**NamedAPIResource**](NamedAPIResource.md) |  | [optional] 

## Methods

### NewPokemonType

`func NewPokemonType() *PokemonType`

NewPokemonType instantiates a new PokemonType object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokemonTypeWithDefaults

`func NewPokemonTypeWithDefaults() *PokemonType`

NewPokemonTypeWithDefaults instantiates a new PokemonType object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSlot

`func (o *PokemonType) GetSlot() int32`

GetSlot returns the Slot field if non-nil, zero value otherwise.

### GetSlotOk

`func (o *PokemonType) GetSlotOk() (*int32, bool)`

GetSlotOk returns a tuple with the Slot field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSlot

`func (o *PokemonType) SetSlot(v int32)`

SetSlot sets Slot field to given value.

### HasSlot

`func (o *PokemonType) HasSlot() bool`

HasSlot returns a boolean if a field has been set.

### GetType

`func (o *PokemonType) GetType() NamedAPIResource`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *PokemonType) GetTypeOk() (*NamedAPIResource, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *PokemonType) SetType(v NamedAPIResource)`

SetType sets Type field to given value.

### HasType

`func (o *PokemonType) HasType() bool`

HasType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


