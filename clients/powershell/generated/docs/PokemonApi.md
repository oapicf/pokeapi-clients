# PSOpenAPITools.PSOpenAPITools\Api.PokemonApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-AbilityList**](PokemonApi.md#Invoke-AbilityList) | **GET** /api/v2/ability/ | 
[**Invoke-AbilityRetrieve**](PokemonApi.md#Invoke-AbilityRetrieve) | **GET** /api/v2/ability/{id}/ | 
[**Invoke-CharacteristicList**](PokemonApi.md#Invoke-CharacteristicList) | **GET** /api/v2/characteristic/ | List charecterictics
[**Invoke-CharacteristicRetrieve**](PokemonApi.md#Invoke-CharacteristicRetrieve) | **GET** /api/v2/characteristic/{id}/ | Get characteristic
[**Invoke-EggGroupList**](PokemonApi.md#Invoke-EggGroupList) | **GET** /api/v2/egg-group/ | List egg groups
[**Invoke-EggGroupRetrieve**](PokemonApi.md#Invoke-EggGroupRetrieve) | **GET** /api/v2/egg-group/{id}/ | Get egg group
[**Invoke-GenderList**](PokemonApi.md#Invoke-GenderList) | **GET** /api/v2/gender/ | List genders
[**Invoke-GenderRetrieve**](PokemonApi.md#Invoke-GenderRetrieve) | **GET** /api/v2/gender/{id}/ | Get gender
[**Invoke-GrowthRateList**](PokemonApi.md#Invoke-GrowthRateList) | **GET** /api/v2/growth-rate/ | List growth rates
[**Invoke-GrowthRateRetrieve**](PokemonApi.md#Invoke-GrowthRateRetrieve) | **GET** /api/v2/growth-rate/{id}/ | Get growth rate
[**Move-DamageClassList**](PokemonApi.md#Move-DamageClassList) | **GET** /api/v2/move-damage-class/ | List move damage classes
[**Move-DamageClassRetrieve**](PokemonApi.md#Move-DamageClassRetrieve) | **GET** /api/v2/move-damage-class/{id}/ | Get move damage class
[**Invoke-NatureList**](PokemonApi.md#Invoke-NatureList) | **GET** /api/v2/nature/ | List natures
[**Invoke-NatureRetrieve**](PokemonApi.md#Invoke-NatureRetrieve) | **GET** /api/v2/nature/{id}/ | Get nature
[**Invoke-PokeathlonStatList**](PokemonApi.md#Invoke-PokeathlonStatList) | **GET** /api/v2/pokeathlon-stat/ | List pokeathlon stats
[**Invoke-PokeathlonStatRetrieve**](PokemonApi.md#Invoke-PokeathlonStatRetrieve) | **GET** /api/v2/pokeathlon-stat/{id}/ | Get pokeathlon stat
[**Invoke-PokemonColorList**](PokemonApi.md#Invoke-PokemonColorList) | **GET** /api/v2/pokemon-color/ | List pokemon colors
[**Invoke-PokemonColorRetrieve**](PokemonApi.md#Invoke-PokemonColorRetrieve) | **GET** /api/v2/pokemon-color/{id}/ | Get pokemon color
[**Invoke-PokemonFormList**](PokemonApi.md#Invoke-PokemonFormList) | **GET** /api/v2/pokemon-form/ | List pokemon forms
[**Invoke-PokemonFormRetrieve**](PokemonApi.md#Invoke-PokemonFormRetrieve) | **GET** /api/v2/pokemon-form/{id}/ | Get pokemon form
[**Invoke-PokemonHabitatList**](PokemonApi.md#Invoke-PokemonHabitatList) | **GET** /api/v2/pokemon-habitat/ | List pokemom habitas
[**Invoke-PokemonHabitatRetrieve**](PokemonApi.md#Invoke-PokemonHabitatRetrieve) | **GET** /api/v2/pokemon-habitat/{id}/ | Get pokemom habita
[**Invoke-PokemonList**](PokemonApi.md#Invoke-PokemonList) | **GET** /api/v2/pokemon/ | List pokemon
[**Invoke-PokemonRetrieve**](PokemonApi.md#Invoke-PokemonRetrieve) | **GET** /api/v2/pokemon/{id}/ | Get pokemon
[**Invoke-PokemonShapeList**](PokemonApi.md#Invoke-PokemonShapeList) | **GET** /api/v2/pokemon-shape/ | List pokemon shapes
[**Invoke-PokemonShapeRetrieve**](PokemonApi.md#Invoke-PokemonShapeRetrieve) | **GET** /api/v2/pokemon-shape/{id}/ | Get pokemon shape
[**Invoke-PokemonSpeciesList**](PokemonApi.md#Invoke-PokemonSpeciesList) | **GET** /api/v2/pokemon-species/ | List pokemon species
[**Invoke-PokemonSpeciesRetrieve**](PokemonApi.md#Invoke-PokemonSpeciesRetrieve) | **GET** /api/v2/pokemon-species/{id}/ | Get pokemon species
[**Invoke-StatList**](PokemonApi.md#Invoke-StatList) | **GET** /api/v2/stat/ | List stats
[**Invoke-StatRetrieve**](PokemonApi.md#Invoke-StatRetrieve) | **GET** /api/v2/stat/{id}/ | Get stat
[**Get-List**](PokemonApi.md#Get-List) | **GET** /api/v2/type/ | List types
[**Get-Retrieve**](PokemonApi.md#Get-Retrieve) | **GET** /api/v2/type/{id}/ | Get types


<a id="Invoke-AbilityList"></a>
# **Invoke-AbilityList**
> PaginatedAbilitySummaryList Invoke-AbilityList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Offset] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Q] <String><br>



Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: basicAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

# Configure API key authorization: cookieAuth
$Configuration.ApiKey.sessionid = "YOUR_API_KEY"
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
#$Configuration.ApiKeyPrefix.sessionid = "Bearer"

$Limit = 56 # Int32 | Number of results to return per page. (optional)
$Offset = 56 # Int32 | The initial index from which to return the results. (optional)
$Q = "MyQ" # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)

try {
    $Result = Invoke-AbilityList -Limit $Limit -Offset $Offset -Q $Q
} catch {
    Write-Host ("Exception occurred when calling Invoke-AbilityList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Limit** | **Int32**| Number of results to return per page. | [optional] 
 **Offset** | **Int32**| The initial index from which to return the results. | [optional] 
 **Q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedAbilitySummaryList**](PaginatedAbilitySummaryList.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-AbilityRetrieve"></a>
# **Invoke-AbilityRetrieve**
> AbilityDetail Invoke-AbilityRetrieve<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Id] <String><br>



Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: basicAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

# Configure API key authorization: cookieAuth
$Configuration.ApiKey.sessionid = "YOUR_API_KEY"
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
#$Configuration.ApiKeyPrefix.sessionid = "Bearer"

$Id = "MyId" # String | This parameter can be a string or an integer.

try {
    $Result = Invoke-AbilityRetrieve -Id $Id
} catch {
    Write-Host ("Exception occurred when calling Invoke-AbilityRetrieve: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Id** | **String**| This parameter can be a string or an integer. | 

### Return type

[**AbilityDetail**](AbilityDetail.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-CharacteristicList"></a>
# **Invoke-CharacteristicList**
> PaginatedCharacteristicSummaryList Invoke-CharacteristicList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Offset] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Q] <String><br>

List charecterictics

Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: basicAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

# Configure API key authorization: cookieAuth
$Configuration.ApiKey.sessionid = "YOUR_API_KEY"
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
#$Configuration.ApiKeyPrefix.sessionid = "Bearer"

$Limit = 56 # Int32 | Number of results to return per page. (optional)
$Offset = 56 # Int32 | The initial index from which to return the results. (optional)
$Q = "MyQ" # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)

# List charecterictics
try {
    $Result = Invoke-CharacteristicList -Limit $Limit -Offset $Offset -Q $Q
} catch {
    Write-Host ("Exception occurred when calling Invoke-CharacteristicList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Limit** | **Int32**| Number of results to return per page. | [optional] 
 **Offset** | **Int32**| The initial index from which to return the results. | [optional] 
 **Q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedCharacteristicSummaryList**](PaginatedCharacteristicSummaryList.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-CharacteristicRetrieve"></a>
# **Invoke-CharacteristicRetrieve**
> CharacteristicDetail Invoke-CharacteristicRetrieve<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Id] <String><br>

Get characteristic

Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: basicAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

# Configure API key authorization: cookieAuth
$Configuration.ApiKey.sessionid = "YOUR_API_KEY"
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
#$Configuration.ApiKeyPrefix.sessionid = "Bearer"

$Id = "MyId" # String | This parameter can be a string or an integer.

# Get characteristic
try {
    $Result = Invoke-CharacteristicRetrieve -Id $Id
} catch {
    Write-Host ("Exception occurred when calling Invoke-CharacteristicRetrieve: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Id** | **String**| This parameter can be a string or an integer. | 

### Return type

[**CharacteristicDetail**](CharacteristicDetail.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-EggGroupList"></a>
# **Invoke-EggGroupList**
> PaginatedEggGroupSummaryList Invoke-EggGroupList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Offset] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Q] <String><br>

List egg groups

Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: basicAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

# Configure API key authorization: cookieAuth
$Configuration.ApiKey.sessionid = "YOUR_API_KEY"
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
#$Configuration.ApiKeyPrefix.sessionid = "Bearer"

$Limit = 56 # Int32 | Number of results to return per page. (optional)
$Offset = 56 # Int32 | The initial index from which to return the results. (optional)
$Q = "MyQ" # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)

# List egg groups
try {
    $Result = Invoke-EggGroupList -Limit $Limit -Offset $Offset -Q $Q
} catch {
    Write-Host ("Exception occurred when calling Invoke-EggGroupList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Limit** | **Int32**| Number of results to return per page. | [optional] 
 **Offset** | **Int32**| The initial index from which to return the results. | [optional] 
 **Q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedEggGroupSummaryList**](PaginatedEggGroupSummaryList.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-EggGroupRetrieve"></a>
# **Invoke-EggGroupRetrieve**
> EggGroupDetail Invoke-EggGroupRetrieve<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Id] <String><br>

Get egg group

Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: basicAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

# Configure API key authorization: cookieAuth
$Configuration.ApiKey.sessionid = "YOUR_API_KEY"
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
#$Configuration.ApiKeyPrefix.sessionid = "Bearer"

$Id = "MyId" # String | This parameter can be a string or an integer.

# Get egg group
try {
    $Result = Invoke-EggGroupRetrieve -Id $Id
} catch {
    Write-Host ("Exception occurred when calling Invoke-EggGroupRetrieve: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Id** | **String**| This parameter can be a string or an integer. | 

### Return type

[**EggGroupDetail**](EggGroupDetail.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-GenderList"></a>
# **Invoke-GenderList**
> PaginatedGenderSummaryList Invoke-GenderList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Offset] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Q] <String><br>

List genders

Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: basicAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

# Configure API key authorization: cookieAuth
$Configuration.ApiKey.sessionid = "YOUR_API_KEY"
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
#$Configuration.ApiKeyPrefix.sessionid = "Bearer"

$Limit = 56 # Int32 | Number of results to return per page. (optional)
$Offset = 56 # Int32 | The initial index from which to return the results. (optional)
$Q = "MyQ" # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)

# List genders
try {
    $Result = Invoke-GenderList -Limit $Limit -Offset $Offset -Q $Q
} catch {
    Write-Host ("Exception occurred when calling Invoke-GenderList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Limit** | **Int32**| Number of results to return per page. | [optional] 
 **Offset** | **Int32**| The initial index from which to return the results. | [optional] 
 **Q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedGenderSummaryList**](PaginatedGenderSummaryList.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-GenderRetrieve"></a>
# **Invoke-GenderRetrieve**
> GenderDetail Invoke-GenderRetrieve<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Id] <String><br>

Get gender

Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: basicAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

# Configure API key authorization: cookieAuth
$Configuration.ApiKey.sessionid = "YOUR_API_KEY"
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
#$Configuration.ApiKeyPrefix.sessionid = "Bearer"

$Id = "MyId" # String | This parameter can be a string or an integer.

# Get gender
try {
    $Result = Invoke-GenderRetrieve -Id $Id
} catch {
    Write-Host ("Exception occurred when calling Invoke-GenderRetrieve: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Id** | **String**| This parameter can be a string or an integer. | 

### Return type

[**GenderDetail**](GenderDetail.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-GrowthRateList"></a>
# **Invoke-GrowthRateList**
> PaginatedGrowthRateSummaryList Invoke-GrowthRateList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Offset] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Q] <String><br>

List growth rates

Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: basicAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

# Configure API key authorization: cookieAuth
$Configuration.ApiKey.sessionid = "YOUR_API_KEY"
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
#$Configuration.ApiKeyPrefix.sessionid = "Bearer"

$Limit = 56 # Int32 | Number of results to return per page. (optional)
$Offset = 56 # Int32 | The initial index from which to return the results. (optional)
$Q = "MyQ" # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)

# List growth rates
try {
    $Result = Invoke-GrowthRateList -Limit $Limit -Offset $Offset -Q $Q
} catch {
    Write-Host ("Exception occurred when calling Invoke-GrowthRateList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Limit** | **Int32**| Number of results to return per page. | [optional] 
 **Offset** | **Int32**| The initial index from which to return the results. | [optional] 
 **Q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedGrowthRateSummaryList**](PaginatedGrowthRateSummaryList.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-GrowthRateRetrieve"></a>
# **Invoke-GrowthRateRetrieve**
> GrowthRateDetail Invoke-GrowthRateRetrieve<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Id] <String><br>

Get growth rate

Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: basicAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

# Configure API key authorization: cookieAuth
$Configuration.ApiKey.sessionid = "YOUR_API_KEY"
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
#$Configuration.ApiKeyPrefix.sessionid = "Bearer"

$Id = "MyId" # String | This parameter can be a string or an integer.

# Get growth rate
try {
    $Result = Invoke-GrowthRateRetrieve -Id $Id
} catch {
    Write-Host ("Exception occurred when calling Invoke-GrowthRateRetrieve: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Id** | **String**| This parameter can be a string or an integer. | 

### Return type

[**GrowthRateDetail**](GrowthRateDetail.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Move-DamageClassList"></a>
# **Move-DamageClassList**
> PaginatedMoveDamageClassSummaryList Move-DamageClassList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Offset] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Q] <String><br>

List move damage classes

Damage classes moves can have, e.g. physical, special, or non-damaging.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: basicAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

# Configure API key authorization: cookieAuth
$Configuration.ApiKey.sessionid = "YOUR_API_KEY"
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
#$Configuration.ApiKeyPrefix.sessionid = "Bearer"

$Limit = 56 # Int32 | Number of results to return per page. (optional)
$Offset = 56 # Int32 | The initial index from which to return the results. (optional)
$Q = "MyQ" # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)

# List move damage classes
try {
    $Result = Move-DamageClassList -Limit $Limit -Offset $Offset -Q $Q
} catch {
    Write-Host ("Exception occurred when calling Move-DamageClassList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Limit** | **Int32**| Number of results to return per page. | [optional] 
 **Offset** | **Int32**| The initial index from which to return the results. | [optional] 
 **Q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedMoveDamageClassSummaryList**](PaginatedMoveDamageClassSummaryList.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Move-DamageClassRetrieve"></a>
# **Move-DamageClassRetrieve**
> MoveDamageClassDetail Move-DamageClassRetrieve<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Id] <String><br>

Get move damage class

Damage classes moves can have, e.g. physical, special, or non-damaging.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: basicAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

# Configure API key authorization: cookieAuth
$Configuration.ApiKey.sessionid = "YOUR_API_KEY"
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
#$Configuration.ApiKeyPrefix.sessionid = "Bearer"

$Id = "MyId" # String | This parameter can be a string or an integer.

# Get move damage class
try {
    $Result = Move-DamageClassRetrieve -Id $Id
} catch {
    Write-Host ("Exception occurred when calling Move-DamageClassRetrieve: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Id** | **String**| This parameter can be a string or an integer. | 

### Return type

[**MoveDamageClassDetail**](MoveDamageClassDetail.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-NatureList"></a>
# **Invoke-NatureList**
> PaginatedNatureSummaryList Invoke-NatureList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Offset] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Q] <String><br>

List natures

Natures influence how a Pokémon's stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: basicAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

# Configure API key authorization: cookieAuth
$Configuration.ApiKey.sessionid = "YOUR_API_KEY"
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
#$Configuration.ApiKeyPrefix.sessionid = "Bearer"

$Limit = 56 # Int32 | Number of results to return per page. (optional)
$Offset = 56 # Int32 | The initial index from which to return the results. (optional)
$Q = "MyQ" # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)

# List natures
try {
    $Result = Invoke-NatureList -Limit $Limit -Offset $Offset -Q $Q
} catch {
    Write-Host ("Exception occurred when calling Invoke-NatureList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Limit** | **Int32**| Number of results to return per page. | [optional] 
 **Offset** | **Int32**| The initial index from which to return the results. | [optional] 
 **Q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedNatureSummaryList**](PaginatedNatureSummaryList.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-NatureRetrieve"></a>
# **Invoke-NatureRetrieve**
> NatureDetail Invoke-NatureRetrieve<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Id] <String><br>

Get nature

Natures influence how a Pokémon's stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: basicAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

# Configure API key authorization: cookieAuth
$Configuration.ApiKey.sessionid = "YOUR_API_KEY"
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
#$Configuration.ApiKeyPrefix.sessionid = "Bearer"

$Id = "MyId" # String | This parameter can be a string or an integer.

# Get nature
try {
    $Result = Invoke-NatureRetrieve -Id $Id
} catch {
    Write-Host ("Exception occurred when calling Invoke-NatureRetrieve: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Id** | **String**| This parameter can be a string or an integer. | 

### Return type

[**NatureDetail**](NatureDetail.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-PokeathlonStatList"></a>
# **Invoke-PokeathlonStatList**
> PaginatedPokeathlonStatSummaryList Invoke-PokeathlonStatList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Offset] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Q] <String><br>

List pokeathlon stats

Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: basicAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

# Configure API key authorization: cookieAuth
$Configuration.ApiKey.sessionid = "YOUR_API_KEY"
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
#$Configuration.ApiKeyPrefix.sessionid = "Bearer"

$Limit = 56 # Int32 | Number of results to return per page. (optional)
$Offset = 56 # Int32 | The initial index from which to return the results. (optional)
$Q = "MyQ" # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)

# List pokeathlon stats
try {
    $Result = Invoke-PokeathlonStatList -Limit $Limit -Offset $Offset -Q $Q
} catch {
    Write-Host ("Exception occurred when calling Invoke-PokeathlonStatList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Limit** | **Int32**| Number of results to return per page. | [optional] 
 **Offset** | **Int32**| The initial index from which to return the results. | [optional] 
 **Q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedPokeathlonStatSummaryList**](PaginatedPokeathlonStatSummaryList.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-PokeathlonStatRetrieve"></a>
# **Invoke-PokeathlonStatRetrieve**
> PokeathlonStatDetail Invoke-PokeathlonStatRetrieve<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Id] <String><br>

Get pokeathlon stat

Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: basicAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

# Configure API key authorization: cookieAuth
$Configuration.ApiKey.sessionid = "YOUR_API_KEY"
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
#$Configuration.ApiKeyPrefix.sessionid = "Bearer"

$Id = "MyId" # String | This parameter can be a string or an integer.

# Get pokeathlon stat
try {
    $Result = Invoke-PokeathlonStatRetrieve -Id $Id
} catch {
    Write-Host ("Exception occurred when calling Invoke-PokeathlonStatRetrieve: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Id** | **String**| This parameter can be a string or an integer. | 

### Return type

[**PokeathlonStatDetail**](PokeathlonStatDetail.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-PokemonColorList"></a>
# **Invoke-PokemonColorList**
> PaginatedPokemonColorSummaryList Invoke-PokemonColorList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Offset] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Q] <String><br>

List pokemon colors

Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: basicAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

# Configure API key authorization: cookieAuth
$Configuration.ApiKey.sessionid = "YOUR_API_KEY"
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
#$Configuration.ApiKeyPrefix.sessionid = "Bearer"

$Limit = 56 # Int32 | Number of results to return per page. (optional)
$Offset = 56 # Int32 | The initial index from which to return the results. (optional)
$Q = "MyQ" # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)

# List pokemon colors
try {
    $Result = Invoke-PokemonColorList -Limit $Limit -Offset $Offset -Q $Q
} catch {
    Write-Host ("Exception occurred when calling Invoke-PokemonColorList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Limit** | **Int32**| Number of results to return per page. | [optional] 
 **Offset** | **Int32**| The initial index from which to return the results. | [optional] 
 **Q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedPokemonColorSummaryList**](PaginatedPokemonColorSummaryList.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-PokemonColorRetrieve"></a>
# **Invoke-PokemonColorRetrieve**
> PokemonColorDetail Invoke-PokemonColorRetrieve<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Id] <String><br>

Get pokemon color

Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: basicAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

# Configure API key authorization: cookieAuth
$Configuration.ApiKey.sessionid = "YOUR_API_KEY"
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
#$Configuration.ApiKeyPrefix.sessionid = "Bearer"

$Id = "MyId" # String | This parameter can be a string or an integer.

# Get pokemon color
try {
    $Result = Invoke-PokemonColorRetrieve -Id $Id
} catch {
    Write-Host ("Exception occurred when calling Invoke-PokemonColorRetrieve: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Id** | **String**| This parameter can be a string or an integer. | 

### Return type

[**PokemonColorDetail**](PokemonColorDetail.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-PokemonFormList"></a>
# **Invoke-PokemonFormList**
> PaginatedPokemonFormSummaryList Invoke-PokemonFormList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Offset] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Q] <String><br>

List pokemon forms

Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: basicAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

# Configure API key authorization: cookieAuth
$Configuration.ApiKey.sessionid = "YOUR_API_KEY"
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
#$Configuration.ApiKeyPrefix.sessionid = "Bearer"

$Limit = 56 # Int32 | Number of results to return per page. (optional)
$Offset = 56 # Int32 | The initial index from which to return the results. (optional)
$Q = "MyQ" # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)

# List pokemon forms
try {
    $Result = Invoke-PokemonFormList -Limit $Limit -Offset $Offset -Q $Q
} catch {
    Write-Host ("Exception occurred when calling Invoke-PokemonFormList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Limit** | **Int32**| Number of results to return per page. | [optional] 
 **Offset** | **Int32**| The initial index from which to return the results. | [optional] 
 **Q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedPokemonFormSummaryList**](PaginatedPokemonFormSummaryList.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-PokemonFormRetrieve"></a>
# **Invoke-PokemonFormRetrieve**
> PokemonFormDetail Invoke-PokemonFormRetrieve<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Id] <String><br>

Get pokemon form

Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: basicAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

# Configure API key authorization: cookieAuth
$Configuration.ApiKey.sessionid = "YOUR_API_KEY"
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
#$Configuration.ApiKeyPrefix.sessionid = "Bearer"

$Id = "MyId" # String | This parameter can be a string or an integer.

# Get pokemon form
try {
    $Result = Invoke-PokemonFormRetrieve -Id $Id
} catch {
    Write-Host ("Exception occurred when calling Invoke-PokemonFormRetrieve: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Id** | **String**| This parameter can be a string or an integer. | 

### Return type

[**PokemonFormDetail**](PokemonFormDetail.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-PokemonHabitatList"></a>
# **Invoke-PokemonHabitatList**
> PaginatedPokemonHabitatSummaryList Invoke-PokemonHabitatList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Offset] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Q] <String><br>

List pokemom habitas

Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: basicAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

# Configure API key authorization: cookieAuth
$Configuration.ApiKey.sessionid = "YOUR_API_KEY"
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
#$Configuration.ApiKeyPrefix.sessionid = "Bearer"

$Limit = 56 # Int32 | Number of results to return per page. (optional)
$Offset = 56 # Int32 | The initial index from which to return the results. (optional)
$Q = "MyQ" # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)

# List pokemom habitas
try {
    $Result = Invoke-PokemonHabitatList -Limit $Limit -Offset $Offset -Q $Q
} catch {
    Write-Host ("Exception occurred when calling Invoke-PokemonHabitatList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Limit** | **Int32**| Number of results to return per page. | [optional] 
 **Offset** | **Int32**| The initial index from which to return the results. | [optional] 
 **Q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedPokemonHabitatSummaryList**](PaginatedPokemonHabitatSummaryList.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-PokemonHabitatRetrieve"></a>
# **Invoke-PokemonHabitatRetrieve**
> PokemonHabitatDetail Invoke-PokemonHabitatRetrieve<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Id] <String><br>

Get pokemom habita

Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: basicAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

# Configure API key authorization: cookieAuth
$Configuration.ApiKey.sessionid = "YOUR_API_KEY"
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
#$Configuration.ApiKeyPrefix.sessionid = "Bearer"

$Id = "MyId" # String | This parameter can be a string or an integer.

# Get pokemom habita
try {
    $Result = Invoke-PokemonHabitatRetrieve -Id $Id
} catch {
    Write-Host ("Exception occurred when calling Invoke-PokemonHabitatRetrieve: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Id** | **String**| This parameter can be a string or an integer. | 

### Return type

[**PokemonHabitatDetail**](PokemonHabitatDetail.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-PokemonList"></a>
# **Invoke-PokemonList**
> PaginatedPokemonSummaryList Invoke-PokemonList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Offset] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Q] <String><br>

List pokemon

Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: basicAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

# Configure API key authorization: cookieAuth
$Configuration.ApiKey.sessionid = "YOUR_API_KEY"
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
#$Configuration.ApiKeyPrefix.sessionid = "Bearer"

$Limit = 56 # Int32 | Number of results to return per page. (optional)
$Offset = 56 # Int32 | The initial index from which to return the results. (optional)
$Q = "MyQ" # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)

# List pokemon
try {
    $Result = Invoke-PokemonList -Limit $Limit -Offset $Offset -Q $Q
} catch {
    Write-Host ("Exception occurred when calling Invoke-PokemonList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Limit** | **Int32**| Number of results to return per page. | [optional] 
 **Offset** | **Int32**| The initial index from which to return the results. | [optional] 
 **Q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedPokemonSummaryList**](PaginatedPokemonSummaryList.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-PokemonRetrieve"></a>
# **Invoke-PokemonRetrieve**
> PokemonDetail Invoke-PokemonRetrieve<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Id] <String><br>

Get pokemon

Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: basicAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

# Configure API key authorization: cookieAuth
$Configuration.ApiKey.sessionid = "YOUR_API_KEY"
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
#$Configuration.ApiKeyPrefix.sessionid = "Bearer"

$Id = "MyId" # String | This parameter can be a string or an integer.

# Get pokemon
try {
    $Result = Invoke-PokemonRetrieve -Id $Id
} catch {
    Write-Host ("Exception occurred when calling Invoke-PokemonRetrieve: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Id** | **String**| This parameter can be a string or an integer. | 

### Return type

[**PokemonDetail**](PokemonDetail.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-PokemonShapeList"></a>
# **Invoke-PokemonShapeList**
> PaginatedPokemonShapeSummaryList Invoke-PokemonShapeList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Offset] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Q] <String><br>

List pokemon shapes

Shapes used for sorting Pokémon in a Pokédex.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: basicAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

# Configure API key authorization: cookieAuth
$Configuration.ApiKey.sessionid = "YOUR_API_KEY"
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
#$Configuration.ApiKeyPrefix.sessionid = "Bearer"

$Limit = 56 # Int32 | Number of results to return per page. (optional)
$Offset = 56 # Int32 | The initial index from which to return the results. (optional)
$Q = "MyQ" # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)

# List pokemon shapes
try {
    $Result = Invoke-PokemonShapeList -Limit $Limit -Offset $Offset -Q $Q
} catch {
    Write-Host ("Exception occurred when calling Invoke-PokemonShapeList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Limit** | **Int32**| Number of results to return per page. | [optional] 
 **Offset** | **Int32**| The initial index from which to return the results. | [optional] 
 **Q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedPokemonShapeSummaryList**](PaginatedPokemonShapeSummaryList.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-PokemonShapeRetrieve"></a>
# **Invoke-PokemonShapeRetrieve**
> PokemonShapeDetail Invoke-PokemonShapeRetrieve<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Id] <String><br>

Get pokemon shape

Shapes used for sorting Pokémon in a Pokédex.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: basicAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

# Configure API key authorization: cookieAuth
$Configuration.ApiKey.sessionid = "YOUR_API_KEY"
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
#$Configuration.ApiKeyPrefix.sessionid = "Bearer"

$Id = "MyId" # String | This parameter can be a string or an integer.

# Get pokemon shape
try {
    $Result = Invoke-PokemonShapeRetrieve -Id $Id
} catch {
    Write-Host ("Exception occurred when calling Invoke-PokemonShapeRetrieve: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Id** | **String**| This parameter can be a string or an integer. | 

### Return type

[**PokemonShapeDetail**](PokemonShapeDetail.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-PokemonSpeciesList"></a>
# **Invoke-PokemonSpeciesList**
> PaginatedPokemonSpeciesSummaryList Invoke-PokemonSpeciesList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Offset] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Q] <String><br>

List pokemon species

A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: basicAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

# Configure API key authorization: cookieAuth
$Configuration.ApiKey.sessionid = "YOUR_API_KEY"
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
#$Configuration.ApiKeyPrefix.sessionid = "Bearer"

$Limit = 56 # Int32 | Number of results to return per page. (optional)
$Offset = 56 # Int32 | The initial index from which to return the results. (optional)
$Q = "MyQ" # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)

# List pokemon species
try {
    $Result = Invoke-PokemonSpeciesList -Limit $Limit -Offset $Offset -Q $Q
} catch {
    Write-Host ("Exception occurred when calling Invoke-PokemonSpeciesList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Limit** | **Int32**| Number of results to return per page. | [optional] 
 **Offset** | **Int32**| The initial index from which to return the results. | [optional] 
 **Q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedPokemonSpeciesSummaryList**](PaginatedPokemonSpeciesSummaryList.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-PokemonSpeciesRetrieve"></a>
# **Invoke-PokemonSpeciesRetrieve**
> PokemonSpeciesDetail Invoke-PokemonSpeciesRetrieve<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Id] <String><br>

Get pokemon species

A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: basicAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

# Configure API key authorization: cookieAuth
$Configuration.ApiKey.sessionid = "YOUR_API_KEY"
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
#$Configuration.ApiKeyPrefix.sessionid = "Bearer"

$Id = "MyId" # String | This parameter can be a string or an integer.

# Get pokemon species
try {
    $Result = Invoke-PokemonSpeciesRetrieve -Id $Id
} catch {
    Write-Host ("Exception occurred when calling Invoke-PokemonSpeciesRetrieve: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Id** | **String**| This parameter can be a string or an integer. | 

### Return type

[**PokemonSpeciesDetail**](PokemonSpeciesDetail.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-StatList"></a>
# **Invoke-StatList**
> PaginatedStatSummaryList Invoke-StatList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Offset] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Q] <String><br>

List stats

Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: basicAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

# Configure API key authorization: cookieAuth
$Configuration.ApiKey.sessionid = "YOUR_API_KEY"
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
#$Configuration.ApiKeyPrefix.sessionid = "Bearer"

$Limit = 56 # Int32 | Number of results to return per page. (optional)
$Offset = 56 # Int32 | The initial index from which to return the results. (optional)
$Q = "MyQ" # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)

# List stats
try {
    $Result = Invoke-StatList -Limit $Limit -Offset $Offset -Q $Q
} catch {
    Write-Host ("Exception occurred when calling Invoke-StatList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Limit** | **Int32**| Number of results to return per page. | [optional] 
 **Offset** | **Int32**| The initial index from which to return the results. | [optional] 
 **Q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedStatSummaryList**](PaginatedStatSummaryList.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-StatRetrieve"></a>
# **Invoke-StatRetrieve**
> StatDetail Invoke-StatRetrieve<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Id] <String><br>

Get stat

Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: basicAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

# Configure API key authorization: cookieAuth
$Configuration.ApiKey.sessionid = "YOUR_API_KEY"
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
#$Configuration.ApiKeyPrefix.sessionid = "Bearer"

$Id = "MyId" # String | This parameter can be a string or an integer.

# Get stat
try {
    $Result = Invoke-StatRetrieve -Id $Id
} catch {
    Write-Host ("Exception occurred when calling Invoke-StatRetrieve: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Id** | **String**| This parameter can be a string or an integer. | 

### Return type

[**StatDetail**](StatDetail.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Get-List"></a>
# **Get-List**
> PaginatedTypeSummaryList Get-List<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Offset] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Q] <String><br>

List types

Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: basicAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

# Configure API key authorization: cookieAuth
$Configuration.ApiKey.sessionid = "YOUR_API_KEY"
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
#$Configuration.ApiKeyPrefix.sessionid = "Bearer"

$Limit = 56 # Int32 | Number of results to return per page. (optional)
$Offset = 56 # Int32 | The initial index from which to return the results. (optional)
$Q = "MyQ" # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)

# List types
try {
    $Result = Get-List -Limit $Limit -Offset $Offset -Q $Q
} catch {
    Write-Host ("Exception occurred when calling Get-List: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Limit** | **Int32**| Number of results to return per page. | [optional] 
 **Offset** | **Int32**| The initial index from which to return the results. | [optional] 
 **Q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedTypeSummaryList**](PaginatedTypeSummaryList.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Get-Retrieve"></a>
# **Get-Retrieve**
> TypeDetail Get-Retrieve<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Id] <String><br>

Get types

Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure HTTP basic authorization: basicAuth
$Configuration.Username = "YOUR_USERNAME"
$Configuration.Password = "YOUR_PASSWORD"

# Configure API key authorization: cookieAuth
$Configuration.ApiKey.sessionid = "YOUR_API_KEY"
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
#$Configuration.ApiKeyPrefix.sessionid = "Bearer"

$Id = "MyId" # String | This parameter can be a string or an integer.

# Get types
try {
    $Result = Get-Retrieve -Id $Id
} catch {
    Write-Host ("Exception occurred when calling Get-Retrieve: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Id** | **String**| This parameter can be a string or an integer. | 

### Return type

[**TypeDetail**](TypeDetail.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

