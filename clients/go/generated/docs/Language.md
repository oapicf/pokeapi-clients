# Language

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int32** |  | [optional] 
**Name** | Pointer to **string** |  | [optional] 
**Official** | Pointer to **bool** |  | [optional] 
**Iso639** | Pointer to **string** |  | [optional] 
**Iso3166** | Pointer to **string** |  | [optional] 
**Names** | Pointer to [**[]Name**](Name.md) |  | [optional] 

## Methods

### NewLanguage

`func NewLanguage() *Language`

NewLanguage instantiates a new Language object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLanguageWithDefaults

`func NewLanguageWithDefaults() *Language`

NewLanguageWithDefaults instantiates a new Language object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *Language) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Language) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Language) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *Language) HasId() bool`

HasId returns a boolean if a field has been set.

### GetName

`func (o *Language) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *Language) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *Language) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *Language) HasName() bool`

HasName returns a boolean if a field has been set.

### GetOfficial

`func (o *Language) GetOfficial() bool`

GetOfficial returns the Official field if non-nil, zero value otherwise.

### GetOfficialOk

`func (o *Language) GetOfficialOk() (*bool, bool)`

GetOfficialOk returns a tuple with the Official field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOfficial

`func (o *Language) SetOfficial(v bool)`

SetOfficial sets Official field to given value.

### HasOfficial

`func (o *Language) HasOfficial() bool`

HasOfficial returns a boolean if a field has been set.

### GetIso639

`func (o *Language) GetIso639() string`

GetIso639 returns the Iso639 field if non-nil, zero value otherwise.

### GetIso639Ok

`func (o *Language) GetIso639Ok() (*string, bool)`

GetIso639Ok returns a tuple with the Iso639 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIso639

`func (o *Language) SetIso639(v string)`

SetIso639 sets Iso639 field to given value.

### HasIso639

`func (o *Language) HasIso639() bool`

HasIso639 returns a boolean if a field has been set.

### GetIso3166

`func (o *Language) GetIso3166() string`

GetIso3166 returns the Iso3166 field if non-nil, zero value otherwise.

### GetIso3166Ok

`func (o *Language) GetIso3166Ok() (*string, bool)`

GetIso3166Ok returns a tuple with the Iso3166 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIso3166

`func (o *Language) SetIso3166(v string)`

SetIso3166 sets Iso3166 field to given value.

### HasIso3166

`func (o *Language) HasIso3166() bool`

HasIso3166 returns a boolean if a field has been set.

### GetNames

`func (o *Language) GetNames() []Name`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *Language) GetNamesOk() (*[]Name, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *Language) SetNames(v []Name)`

SetNames sets Names field to given value.

### HasNames

`func (o *Language) HasNames() bool`

HasNames returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


