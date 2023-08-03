# Generation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int32** | The identifier for this generation resource | [optional] 
**Name** | Pointer to **string** | The name for this generation resource | [optional] 
**Abilities** | Pointer to [**[]GenerationAbilitiesInner**](GenerationAbilitiesInner.md) |  | [optional] 
**Names** | Pointer to [**[]GenerationNamesInner**](GenerationNamesInner.md) |  | [optional] 

## Methods

### NewGeneration

`func NewGeneration() *Generation`

NewGeneration instantiates a new Generation object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGenerationWithDefaults

`func NewGenerationWithDefaults() *Generation`

NewGenerationWithDefaults instantiates a new Generation object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *Generation) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Generation) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Generation) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *Generation) HasId() bool`

HasId returns a boolean if a field has been set.

### GetName

`func (o *Generation) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *Generation) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *Generation) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *Generation) HasName() bool`

HasName returns a boolean if a field has been set.

### GetAbilities

`func (o *Generation) GetAbilities() []GenerationAbilitiesInner`

GetAbilities returns the Abilities field if non-nil, zero value otherwise.

### GetAbilitiesOk

`func (o *Generation) GetAbilitiesOk() (*[]GenerationAbilitiesInner, bool)`

GetAbilitiesOk returns a tuple with the Abilities field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAbilities

`func (o *Generation) SetAbilities(v []GenerationAbilitiesInner)`

SetAbilities sets Abilities field to given value.

### HasAbilities

`func (o *Generation) HasAbilities() bool`

HasAbilities returns a boolean if a field has been set.

### GetNames

`func (o *Generation) GetNames() []GenerationNamesInner`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *Generation) GetNamesOk() (*[]GenerationNamesInner, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *Generation) SetNames(v []GenerationNamesInner)`

SetNames sets Names field to given value.

### HasNames

`func (o *Generation) HasNames() bool`

HasNames returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


