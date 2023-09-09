# EncounterMethodList200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Count** | Pointer to **int32** | The total number of encounter methods. | [optional] 
**Next** | Pointer to **NullableString** | URL to retrieve the next page of encounter methods. | [optional] 
**Previous** | Pointer to **NullableString** | URL to retrieve the previous page of encounter methods. | [optional] 
**Results** | Pointer to [**[]EncounterMethod**](EncounterMethod.md) |  | [optional] 

## Methods

### NewEncounterMethodList200Response

`func NewEncounterMethodList200Response() *EncounterMethodList200Response`

NewEncounterMethodList200Response instantiates a new EncounterMethodList200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEncounterMethodList200ResponseWithDefaults

`func NewEncounterMethodList200ResponseWithDefaults() *EncounterMethodList200Response`

NewEncounterMethodList200ResponseWithDefaults instantiates a new EncounterMethodList200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCount

`func (o *EncounterMethodList200Response) GetCount() int32`

GetCount returns the Count field if non-nil, zero value otherwise.

### GetCountOk

`func (o *EncounterMethodList200Response) GetCountOk() (*int32, bool)`

GetCountOk returns a tuple with the Count field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCount

`func (o *EncounterMethodList200Response) SetCount(v int32)`

SetCount sets Count field to given value.

### HasCount

`func (o *EncounterMethodList200Response) HasCount() bool`

HasCount returns a boolean if a field has been set.

### GetNext

`func (o *EncounterMethodList200Response) GetNext() string`

GetNext returns the Next field if non-nil, zero value otherwise.

### GetNextOk

`func (o *EncounterMethodList200Response) GetNextOk() (*string, bool)`

GetNextOk returns a tuple with the Next field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNext

`func (o *EncounterMethodList200Response) SetNext(v string)`

SetNext sets Next field to given value.

### HasNext

`func (o *EncounterMethodList200Response) HasNext() bool`

HasNext returns a boolean if a field has been set.

### SetNextNil

`func (o *EncounterMethodList200Response) SetNextNil(b bool)`

 SetNextNil sets the value for Next to be an explicit nil

### UnsetNext
`func (o *EncounterMethodList200Response) UnsetNext()`

UnsetNext ensures that no value is present for Next, not even an explicit nil
### GetPrevious

`func (o *EncounterMethodList200Response) GetPrevious() string`

GetPrevious returns the Previous field if non-nil, zero value otherwise.

### GetPreviousOk

`func (o *EncounterMethodList200Response) GetPreviousOk() (*string, bool)`

GetPreviousOk returns a tuple with the Previous field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrevious

`func (o *EncounterMethodList200Response) SetPrevious(v string)`

SetPrevious sets Previous field to given value.

### HasPrevious

`func (o *EncounterMethodList200Response) HasPrevious() bool`

HasPrevious returns a boolean if a field has been set.

### SetPreviousNil

`func (o *EncounterMethodList200Response) SetPreviousNil(b bool)`

 SetPreviousNil sets the value for Previous to be an explicit nil

### UnsetPrevious
`func (o *EncounterMethodList200Response) UnsetPrevious()`

UnsetPrevious ensures that no value is present for Previous, not even an explicit nil
### GetResults

`func (o *EncounterMethodList200Response) GetResults() []EncounterMethod`

GetResults returns the Results field if non-nil, zero value otherwise.

### GetResultsOk

`func (o *EncounterMethodList200Response) GetResultsOk() (*[]EncounterMethod, bool)`

GetResultsOk returns a tuple with the Results field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResults

`func (o *EncounterMethodList200Response) SetResults(v []EncounterMethod)`

SetResults sets Results field to given value.

### HasResults

`func (o *EncounterMethodList200Response) HasResults() bool`

HasResults returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


