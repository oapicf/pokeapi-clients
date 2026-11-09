# PokeapiMetaResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DeployDate** | **NullableString** | The deployment time as a Unix timestamp string. | 
**Hash** | **NullableString** | The source commit hash used for this deployment. | 
**Tag** | **NullableString** | The deployment tag, or null if the deployment has no tag. | 

## Methods

### NewPokeapiMetaResponse

`func NewPokeapiMetaResponse(deployDate NullableString, hash NullableString, tag NullableString, ) *PokeapiMetaResponse`

NewPokeapiMetaResponse instantiates a new PokeapiMetaResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokeapiMetaResponseWithDefaults

`func NewPokeapiMetaResponseWithDefaults() *PokeapiMetaResponse`

NewPokeapiMetaResponseWithDefaults instantiates a new PokeapiMetaResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDeployDate

`func (o *PokeapiMetaResponse) GetDeployDate() string`

GetDeployDate returns the DeployDate field if non-nil, zero value otherwise.

### GetDeployDateOk

`func (o *PokeapiMetaResponse) GetDeployDateOk() (*string, bool)`

GetDeployDateOk returns a tuple with the DeployDate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeployDate

`func (o *PokeapiMetaResponse) SetDeployDate(v string)`

SetDeployDate sets DeployDate field to given value.


### SetDeployDateNil

`func (o *PokeapiMetaResponse) SetDeployDateNil(b bool)`

 SetDeployDateNil sets the value for DeployDate to be an explicit nil

### UnsetDeployDate
`func (o *PokeapiMetaResponse) UnsetDeployDate()`

UnsetDeployDate ensures that no value is present for DeployDate, not even an explicit nil
### GetHash

`func (o *PokeapiMetaResponse) GetHash() string`

GetHash returns the Hash field if non-nil, zero value otherwise.

### GetHashOk

`func (o *PokeapiMetaResponse) GetHashOk() (*string, bool)`

GetHashOk returns a tuple with the Hash field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHash

`func (o *PokeapiMetaResponse) SetHash(v string)`

SetHash sets Hash field to given value.


### SetHashNil

`func (o *PokeapiMetaResponse) SetHashNil(b bool)`

 SetHashNil sets the value for Hash to be an explicit nil

### UnsetHash
`func (o *PokeapiMetaResponse) UnsetHash()`

UnsetHash ensures that no value is present for Hash, not even an explicit nil
### GetTag

`func (o *PokeapiMetaResponse) GetTag() string`

GetTag returns the Tag field if non-nil, zero value otherwise.

### GetTagOk

`func (o *PokeapiMetaResponse) GetTagOk() (*string, bool)`

GetTagOk returns a tuple with the Tag field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTag

`func (o *PokeapiMetaResponse) SetTag(v string)`

SetTag sets Tag field to given value.


### SetTagNil

`func (o *PokeapiMetaResponse) SetTagNil(b bool)`

 SetTagNil sets the value for Tag to be an explicit nil

### UnsetTag
`func (o *PokeapiMetaResponse) UnsetTag()`

UnsetTag ensures that no value is present for Tag, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


