# LanguageDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | [readonly] 
**Name** | **string** |  | 
**Official** | Pointer to **bool** |  | [optional] 
**Iso639** | **string** |  | 
**Iso3166** | **string** |  | 
**Names** | [**[]LanguageName**](LanguageName.md) |  | 

## Methods

### NewLanguageDetail

`func NewLanguageDetail(id int32, name string, iso639 string, iso3166 string, names []LanguageName, ) *LanguageDetail`

NewLanguageDetail instantiates a new LanguageDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLanguageDetailWithDefaults

`func NewLanguageDetailWithDefaults() *LanguageDetail`

NewLanguageDetailWithDefaults instantiates a new LanguageDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *LanguageDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *LanguageDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *LanguageDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *LanguageDetail) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *LanguageDetail) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *LanguageDetail) SetName(v string)`

SetName sets Name field to given value.


### GetOfficial

`func (o *LanguageDetail) GetOfficial() bool`

GetOfficial returns the Official field if non-nil, zero value otherwise.

### GetOfficialOk

`func (o *LanguageDetail) GetOfficialOk() (*bool, bool)`

GetOfficialOk returns a tuple with the Official field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOfficial

`func (o *LanguageDetail) SetOfficial(v bool)`

SetOfficial sets Official field to given value.

### HasOfficial

`func (o *LanguageDetail) HasOfficial() bool`

HasOfficial returns a boolean if a field has been set.

### GetIso639

`func (o *LanguageDetail) GetIso639() string`

GetIso639 returns the Iso639 field if non-nil, zero value otherwise.

### GetIso639Ok

`func (o *LanguageDetail) GetIso639Ok() (*string, bool)`

GetIso639Ok returns a tuple with the Iso639 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIso639

`func (o *LanguageDetail) SetIso639(v string)`

SetIso639 sets Iso639 field to given value.


### GetIso3166

`func (o *LanguageDetail) GetIso3166() string`

GetIso3166 returns the Iso3166 field if non-nil, zero value otherwise.

### GetIso3166Ok

`func (o *LanguageDetail) GetIso3166Ok() (*string, bool)`

GetIso3166Ok returns a tuple with the Iso3166 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIso3166

`func (o *LanguageDetail) SetIso3166(v string)`

SetIso3166 sets Iso3166 field to given value.


### GetNames

`func (o *LanguageDetail) GetNames() []LanguageName`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *LanguageDetail) GetNamesOk() (*[]LanguageName, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *LanguageDetail) SetNames(v []LanguageName)`

SetNames sets Names field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


