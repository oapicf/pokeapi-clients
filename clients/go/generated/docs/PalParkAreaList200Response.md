# PalParkAreaList200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Count** | Pointer to **int32** | The total number of pal park areas. | [optional] 
**Next** | Pointer to **NullableString** | URL to retrieve the next page of pal park areas. | [optional] 
**Previous** | Pointer to **NullableString** | URL to retrieve the previous page of pal park areas. | [optional] 
**Results** | Pointer to [**[]PalParkArea**](PalParkArea.md) |  | [optional] 

## Methods

### NewPalParkAreaList200Response

`func NewPalParkAreaList200Response() *PalParkAreaList200Response`

NewPalParkAreaList200Response instantiates a new PalParkAreaList200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPalParkAreaList200ResponseWithDefaults

`func NewPalParkAreaList200ResponseWithDefaults() *PalParkAreaList200Response`

NewPalParkAreaList200ResponseWithDefaults instantiates a new PalParkAreaList200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCount

`func (o *PalParkAreaList200Response) GetCount() int32`

GetCount returns the Count field if non-nil, zero value otherwise.

### GetCountOk

`func (o *PalParkAreaList200Response) GetCountOk() (*int32, bool)`

GetCountOk returns a tuple with the Count field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCount

`func (o *PalParkAreaList200Response) SetCount(v int32)`

SetCount sets Count field to given value.

### HasCount

`func (o *PalParkAreaList200Response) HasCount() bool`

HasCount returns a boolean if a field has been set.

### GetNext

`func (o *PalParkAreaList200Response) GetNext() string`

GetNext returns the Next field if non-nil, zero value otherwise.

### GetNextOk

`func (o *PalParkAreaList200Response) GetNextOk() (*string, bool)`

GetNextOk returns a tuple with the Next field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNext

`func (o *PalParkAreaList200Response) SetNext(v string)`

SetNext sets Next field to given value.

### HasNext

`func (o *PalParkAreaList200Response) HasNext() bool`

HasNext returns a boolean if a field has been set.

### SetNextNil

`func (o *PalParkAreaList200Response) SetNextNil(b bool)`

 SetNextNil sets the value for Next to be an explicit nil

### UnsetNext
`func (o *PalParkAreaList200Response) UnsetNext()`

UnsetNext ensures that no value is present for Next, not even an explicit nil
### GetPrevious

`func (o *PalParkAreaList200Response) GetPrevious() string`

GetPrevious returns the Previous field if non-nil, zero value otherwise.

### GetPreviousOk

`func (o *PalParkAreaList200Response) GetPreviousOk() (*string, bool)`

GetPreviousOk returns a tuple with the Previous field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrevious

`func (o *PalParkAreaList200Response) SetPrevious(v string)`

SetPrevious sets Previous field to given value.

### HasPrevious

`func (o *PalParkAreaList200Response) HasPrevious() bool`

HasPrevious returns a boolean if a field has been set.

### SetPreviousNil

`func (o *PalParkAreaList200Response) SetPreviousNil(b bool)`

 SetPreviousNil sets the value for Previous to be an explicit nil

### UnsetPrevious
`func (o *PalParkAreaList200Response) UnsetPrevious()`

UnsetPrevious ensures that no value is present for Previous, not even an explicit nil
### GetResults

`func (o *PalParkAreaList200Response) GetResults() []PalParkArea`

GetResults returns the Results field if non-nil, zero value otherwise.

### GetResultsOk

`func (o *PalParkAreaList200Response) GetResultsOk() (*[]PalParkArea, bool)`

GetResultsOk returns a tuple with the Results field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResults

`func (o *PalParkAreaList200Response) SetResults(v []PalParkArea)`

SetResults sets Results field to given value.

### HasResults

`func (o *PalParkAreaList200Response) HasResults() bool`

HasResults returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


