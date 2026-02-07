# MoveTargetDescription

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Description** | Pointer to **string** |  | [optional] 
**Language** | [**LanguageSummary**](LanguageSummary.md) |  | 

## Methods

### NewMoveTargetDescription

`func NewMoveTargetDescription(language LanguageSummary, ) *MoveTargetDescription`

NewMoveTargetDescription instantiates a new MoveTargetDescription object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMoveTargetDescriptionWithDefaults

`func NewMoveTargetDescriptionWithDefaults() *MoveTargetDescription`

NewMoveTargetDescriptionWithDefaults instantiates a new MoveTargetDescription object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDescription

`func (o *MoveTargetDescription) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *MoveTargetDescription) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *MoveTargetDescription) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *MoveTargetDescription) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetLanguage

`func (o *MoveTargetDescription) GetLanguage() LanguageSummary`

GetLanguage returns the Language field if non-nil, zero value otherwise.

### GetLanguageOk

`func (o *MoveTargetDescription) GetLanguageOk() (*LanguageSummary, bool)`

GetLanguageOk returns a tuple with the Language field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLanguage

`func (o *MoveTargetDescription) SetLanguage(v LanguageSummary)`

SetLanguage sets Language field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


