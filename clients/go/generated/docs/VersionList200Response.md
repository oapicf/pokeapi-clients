# VersionList200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Count** | Pointer to **int32** | The total number of versions. | [optional] 
**Next** | Pointer to **NullableString** | URL to retrieve the next page of versions. | [optional] 
**Previous** | Pointer to **NullableString** | URL to retrieve the previous page of versions. | [optional] 
**Results** | Pointer to [**[]Version**](Version.md) |  | [optional] 

## Methods

### NewVersionList200Response

`func NewVersionList200Response() *VersionList200Response`

NewVersionList200Response instantiates a new VersionList200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewVersionList200ResponseWithDefaults

`func NewVersionList200ResponseWithDefaults() *VersionList200Response`

NewVersionList200ResponseWithDefaults instantiates a new VersionList200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCount

`func (o *VersionList200Response) GetCount() int32`

GetCount returns the Count field if non-nil, zero value otherwise.

### GetCountOk

`func (o *VersionList200Response) GetCountOk() (*int32, bool)`

GetCountOk returns a tuple with the Count field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCount

`func (o *VersionList200Response) SetCount(v int32)`

SetCount sets Count field to given value.

### HasCount

`func (o *VersionList200Response) HasCount() bool`

HasCount returns a boolean if a field has been set.

### GetNext

`func (o *VersionList200Response) GetNext() string`

GetNext returns the Next field if non-nil, zero value otherwise.

### GetNextOk

`func (o *VersionList200Response) GetNextOk() (*string, bool)`

GetNextOk returns a tuple with the Next field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNext

`func (o *VersionList200Response) SetNext(v string)`

SetNext sets Next field to given value.

### HasNext

`func (o *VersionList200Response) HasNext() bool`

HasNext returns a boolean if a field has been set.

### SetNextNil

`func (o *VersionList200Response) SetNextNil(b bool)`

 SetNextNil sets the value for Next to be an explicit nil

### UnsetNext
`func (o *VersionList200Response) UnsetNext()`

UnsetNext ensures that no value is present for Next, not even an explicit nil
### GetPrevious

`func (o *VersionList200Response) GetPrevious() string`

GetPrevious returns the Previous field if non-nil, zero value otherwise.

### GetPreviousOk

`func (o *VersionList200Response) GetPreviousOk() (*string, bool)`

GetPreviousOk returns a tuple with the Previous field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrevious

`func (o *VersionList200Response) SetPrevious(v string)`

SetPrevious sets Previous field to given value.

### HasPrevious

`func (o *VersionList200Response) HasPrevious() bool`

HasPrevious returns a boolean if a field has been set.

### SetPreviousNil

`func (o *VersionList200Response) SetPreviousNil(b bool)`

 SetPreviousNil sets the value for Previous to be an explicit nil

### UnsetPrevious
`func (o *VersionList200Response) UnsetPrevious()`

UnsetPrevious ensures that no value is present for Previous, not even an explicit nil
### GetResults

`func (o *VersionList200Response) GetResults() []Version`

GetResults returns the Results field if non-nil, zero value otherwise.

### GetResultsOk

`func (o *VersionList200Response) GetResultsOk() (*[]Version, bool)`

GetResultsOk returns a tuple with the Results field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResults

`func (o *VersionList200Response) SetResults(v []Version)`

SetResults sets Results field to given value.

### HasResults

`func (o *VersionList200Response) HasResults() bool`

HasResults returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


