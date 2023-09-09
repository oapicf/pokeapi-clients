# PokemonForm

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int32** | The identifier for this Pokemon form resource | [optional] 
**Name** | Pointer to **string** | The name for this Pokemon form resource | [optional] 

## Methods

### NewPokemonForm

`func NewPokemonForm() *PokemonForm`

NewPokemonForm instantiates a new PokemonForm object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokemonFormWithDefaults

`func NewPokemonFormWithDefaults() *PokemonForm`

NewPokemonFormWithDefaults instantiates a new PokemonForm object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *PokemonForm) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *PokemonForm) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *PokemonForm) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *PokemonForm) HasId() bool`

HasId returns a boolean if a field has been set.

### GetName

`func (o *PokemonForm) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *PokemonForm) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *PokemonForm) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *PokemonForm) HasName() bool`

HasName returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


