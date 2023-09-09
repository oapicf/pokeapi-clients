# GenerationList200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Count** | Pointer to **int32** | The total number of generations. | [optional] 
**Next** | Pointer to **NullableString** | URL to retrieve the next page of generations. | [optional] 
**Previous** | Pointer to **NullableString** | URL to retrieve the previous page of generations. | [optional] 
**Results** | Pointer to [**[]Generation**](Generation.md) |  | [optional] 

## Methods

### NewGenerationList200Response

`func NewGenerationList200Response() *GenerationList200Response`

NewGenerationList200Response instantiates a new GenerationList200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGenerationList200ResponseWithDefaults

`func NewGenerationList200ResponseWithDefaults() *GenerationList200Response`

NewGenerationList200ResponseWithDefaults instantiates a new GenerationList200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCount

`func (o *GenerationList200Response) GetCount() int32`

GetCount returns the Count field if non-nil, zero value otherwise.

### GetCountOk

`func (o *GenerationList200Response) GetCountOk() (*int32, bool)`

GetCountOk returns a tuple with the Count field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCount

`func (o *GenerationList200Response) SetCount(v int32)`

SetCount sets Count field to given value.

### HasCount

`func (o *GenerationList200Response) HasCount() bool`

HasCount returns a boolean if a field has been set.

### GetNext

`func (o *GenerationList200Response) GetNext() string`

GetNext returns the Next field if non-nil, zero value otherwise.

### GetNextOk

`func (o *GenerationList200Response) GetNextOk() (*string, bool)`

GetNextOk returns a tuple with the Next field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNext

`func (o *GenerationList200Response) SetNext(v string)`

SetNext sets Next field to given value.

### HasNext

`func (o *GenerationList200Response) HasNext() bool`

HasNext returns a boolean if a field has been set.

### SetNextNil

`func (o *GenerationList200Response) SetNextNil(b bool)`

 SetNextNil sets the value for Next to be an explicit nil

### UnsetNext
`func (o *GenerationList200Response) UnsetNext()`

UnsetNext ensures that no value is present for Next, not even an explicit nil
### GetPrevious

`func (o *GenerationList200Response) GetPrevious() string`

GetPrevious returns the Previous field if non-nil, zero value otherwise.

### GetPreviousOk

`func (o *GenerationList200Response) GetPreviousOk() (*string, bool)`

GetPreviousOk returns a tuple with the Previous field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrevious

`func (o *GenerationList200Response) SetPrevious(v string)`

SetPrevious sets Previous field to given value.

### HasPrevious

`func (o *GenerationList200Response) HasPrevious() bool`

HasPrevious returns a boolean if a field has been set.

### SetPreviousNil

`func (o *GenerationList200Response) SetPreviousNil(b bool)`

 SetPreviousNil sets the value for Previous to be an explicit nil

### UnsetPrevious
`func (o *GenerationList200Response) UnsetPrevious()`

UnsetPrevious ensures that no value is present for Previous, not even an explicit nil
### GetResults

`func (o *GenerationList200Response) GetResults() []Generation`

GetResults returns the Results field if non-nil, zero value otherwise.

### GetResultsOk

`func (o *GenerationList200Response) GetResultsOk() (*[]Generation, bool)`

GetResultsOk returns a tuple with the Results field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResults

`func (o *GenerationList200Response) SetResults(v []Generation)`

SetResults sets Results field to given value.

### HasResults

`func (o *GenerationList200Response) HasResults() bool`

HasResults returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


