# PokemonShapeList200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Count** | Pointer to **int32** | The total number of pokemon shapes. | [optional] 
**Next** | Pointer to **NullableString** | URL to retrieve the next page of pokemon shapes. | [optional] 
**Previous** | Pointer to **NullableString** | URL to retrieve the previous page of pokemon shapes. | [optional] 
**Results** | Pointer to [**[]PokemonShape**](PokemonShape.md) |  | [optional] 

## Methods

### NewPokemonShapeList200Response

`func NewPokemonShapeList200Response() *PokemonShapeList200Response`

NewPokemonShapeList200Response instantiates a new PokemonShapeList200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokemonShapeList200ResponseWithDefaults

`func NewPokemonShapeList200ResponseWithDefaults() *PokemonShapeList200Response`

NewPokemonShapeList200ResponseWithDefaults instantiates a new PokemonShapeList200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCount

`func (o *PokemonShapeList200Response) GetCount() int32`

GetCount returns the Count field if non-nil, zero value otherwise.

### GetCountOk

`func (o *PokemonShapeList200Response) GetCountOk() (*int32, bool)`

GetCountOk returns a tuple with the Count field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCount

`func (o *PokemonShapeList200Response) SetCount(v int32)`

SetCount sets Count field to given value.

### HasCount

`func (o *PokemonShapeList200Response) HasCount() bool`

HasCount returns a boolean if a field has been set.

### GetNext

`func (o *PokemonShapeList200Response) GetNext() string`

GetNext returns the Next field if non-nil, zero value otherwise.

### GetNextOk

`func (o *PokemonShapeList200Response) GetNextOk() (*string, bool)`

GetNextOk returns a tuple with the Next field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNext

`func (o *PokemonShapeList200Response) SetNext(v string)`

SetNext sets Next field to given value.

### HasNext

`func (o *PokemonShapeList200Response) HasNext() bool`

HasNext returns a boolean if a field has been set.

### SetNextNil

`func (o *PokemonShapeList200Response) SetNextNil(b bool)`

 SetNextNil sets the value for Next to be an explicit nil

### UnsetNext
`func (o *PokemonShapeList200Response) UnsetNext()`

UnsetNext ensures that no value is present for Next, not even an explicit nil
### GetPrevious

`func (o *PokemonShapeList200Response) GetPrevious() string`

GetPrevious returns the Previous field if non-nil, zero value otherwise.

### GetPreviousOk

`func (o *PokemonShapeList200Response) GetPreviousOk() (*string, bool)`

GetPreviousOk returns a tuple with the Previous field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrevious

`func (o *PokemonShapeList200Response) SetPrevious(v string)`

SetPrevious sets Previous field to given value.

### HasPrevious

`func (o *PokemonShapeList200Response) HasPrevious() bool`

HasPrevious returns a boolean if a field has been set.

### SetPreviousNil

`func (o *PokemonShapeList200Response) SetPreviousNil(b bool)`

 SetPreviousNil sets the value for Previous to be an explicit nil

### UnsetPrevious
`func (o *PokemonShapeList200Response) UnsetPrevious()`

UnsetPrevious ensures that no value is present for Previous, not even an explicit nil
### GetResults

`func (o *PokemonShapeList200Response) GetResults() []PokemonShape`

GetResults returns the Results field if non-nil, zero value otherwise.

### GetResultsOk

`func (o *PokemonShapeList200Response) GetResultsOk() (*[]PokemonShape, bool)`

GetResultsOk returns a tuple with the Results field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResults

`func (o *PokemonShapeList200Response) SetResults(v []PokemonShape)`

SetResults sets Results field to given value.

### HasResults

`func (o *PokemonShapeList200Response) HasResults() bool`

HasResults returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


