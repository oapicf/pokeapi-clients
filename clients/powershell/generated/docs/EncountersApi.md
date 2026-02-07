# PSOpenAPITools.PSOpenAPITools\Api.EncountersApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-EncounterConditionList**](EncountersApi.md#Invoke-EncounterConditionList) | **GET** /api/v2/encounter-condition/ | List encounter conditions
[**Invoke-EncounterConditionRetrieve**](EncountersApi.md#Invoke-EncounterConditionRetrieve) | **GET** /api/v2/encounter-condition/{id}/ | Get encounter condition
[**Invoke-EncounterConditionValueList**](EncountersApi.md#Invoke-EncounterConditionValueList) | **GET** /api/v2/encounter-condition-value/ | List encounter condition values
[**Invoke-EncounterConditionValueRetrieve**](EncountersApi.md#Invoke-EncounterConditionValueRetrieve) | **GET** /api/v2/encounter-condition-value/{id}/ | Get encounter condition value
[**Invoke-EncounterMethodList**](EncountersApi.md#Invoke-EncounterMethodList) | **GET** /api/v2/encounter-method/ | List encounter methods
[**Invoke-EncounterMethodRetrieve**](EncountersApi.md#Invoke-EncounterMethodRetrieve) | **GET** /api/v2/encounter-method/{id}/ | Get encounter method
[**Invoke-PokemonEncountersRetrieve**](EncountersApi.md#Invoke-PokemonEncountersRetrieve) | **GET** /api/v2/pokemon/{pokemon_id}/encounters | Get pokemon encounter


<a id="Invoke-EncounterConditionList"></a>
# **Invoke-EncounterConditionList**
> PaginatedEncounterConditionSummaryList Invoke-EncounterConditionList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Offset] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Q] <String><br>

List encounter conditions

Conditions which affect what pokemon might appear in the wild, e.g., day or night.

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

# List encounter conditions
try {
    $Result = Invoke-EncounterConditionList -Limit $Limit -Offset $Offset -Q $Q
} catch {
    Write-Host ("Exception occurred when calling Invoke-EncounterConditionList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
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

[**PaginatedEncounterConditionSummaryList**](PaginatedEncounterConditionSummaryList.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-EncounterConditionRetrieve"></a>
# **Invoke-EncounterConditionRetrieve**
> EncounterConditionDetail Invoke-EncounterConditionRetrieve<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Id] <String><br>

Get encounter condition

Conditions which affect what pokemon might appear in the wild, e.g., day or night.

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

# Get encounter condition
try {
    $Result = Invoke-EncounterConditionRetrieve -Id $Id
} catch {
    Write-Host ("Exception occurred when calling Invoke-EncounterConditionRetrieve: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Id** | **String**| This parameter can be a string or an integer. | 

### Return type

[**EncounterConditionDetail**](EncounterConditionDetail.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-EncounterConditionValueList"></a>
# **Invoke-EncounterConditionValueList**
> PaginatedEncounterConditionValueSummaryList Invoke-EncounterConditionValueList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Offset] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Q] <String><br>

List encounter condition values

Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.

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

# List encounter condition values
try {
    $Result = Invoke-EncounterConditionValueList -Limit $Limit -Offset $Offset -Q $Q
} catch {
    Write-Host ("Exception occurred when calling Invoke-EncounterConditionValueList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
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

[**PaginatedEncounterConditionValueSummaryList**](PaginatedEncounterConditionValueSummaryList.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-EncounterConditionValueRetrieve"></a>
# **Invoke-EncounterConditionValueRetrieve**
> EncounterConditionValueDetail Invoke-EncounterConditionValueRetrieve<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Id] <String><br>

Get encounter condition value

Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.

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

# Get encounter condition value
try {
    $Result = Invoke-EncounterConditionValueRetrieve -Id $Id
} catch {
    Write-Host ("Exception occurred when calling Invoke-EncounterConditionValueRetrieve: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Id** | **String**| This parameter can be a string or an integer. | 

### Return type

[**EncounterConditionValueDetail**](EncounterConditionValueDetail.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-EncounterMethodList"></a>
# **Invoke-EncounterMethodList**
> PaginatedEncounterMethodSummaryList Invoke-EncounterMethodList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Offset] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Q] <String><br>

List encounter methods

Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.

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

# List encounter methods
try {
    $Result = Invoke-EncounterMethodList -Limit $Limit -Offset $Offset -Q $Q
} catch {
    Write-Host ("Exception occurred when calling Invoke-EncounterMethodList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
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

[**PaginatedEncounterMethodSummaryList**](PaginatedEncounterMethodSummaryList.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-EncounterMethodRetrieve"></a>
# **Invoke-EncounterMethodRetrieve**
> EncounterMethodDetail Invoke-EncounterMethodRetrieve<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Id] <String><br>

Get encounter method

Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.

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

# Get encounter method
try {
    $Result = Invoke-EncounterMethodRetrieve -Id $Id
} catch {
    Write-Host ("Exception occurred when calling Invoke-EncounterMethodRetrieve: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Id** | **String**| This parameter can be a string or an integer. | 

### Return type

[**EncounterMethodDetail**](EncounterMethodDetail.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-PokemonEncountersRetrieve"></a>
# **Invoke-PokemonEncountersRetrieve**
> PokemonEncountersRetrieve200ResponseInner[] Invoke-PokemonEncountersRetrieve<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PokemonId] <String><br>

Get pokemon encounter

Handles Pokemon Encounters as a sub-resource.

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

$PokemonId = "MyPokemonId" # String | 

# Get pokemon encounter
try {
    $Result = Invoke-PokemonEncountersRetrieve -PokemonId $PokemonId
} catch {
    Write-Host ("Exception occurred when calling Invoke-PokemonEncountersRetrieve: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **PokemonId** | **String**|  | 

### Return type

[**PokemonEncountersRetrieve200ResponseInner[]**](PokemonEncountersRetrieve200ResponseInner.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

