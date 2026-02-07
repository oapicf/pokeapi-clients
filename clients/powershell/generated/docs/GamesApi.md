# PSOpenAPITools.PSOpenAPITools\Api.GamesApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-GenerationList**](GamesApi.md#Invoke-GenerationList) | **GET** /api/v2/generation/ | List genrations
[**Invoke-GenerationRetrieve**](GamesApi.md#Invoke-GenerationRetrieve) | **GET** /api/v2/generation/{id}/ | Get genration
[**Invoke-PokedexList**](GamesApi.md#Invoke-PokedexList) | **GET** /api/v2/pokedex/ | List pokedex
[**Invoke-PokedexRetrieve**](GamesApi.md#Invoke-PokedexRetrieve) | **GET** /api/v2/pokedex/{id}/ | Get pokedex
[**Invoke-VersionGroupList**](GamesApi.md#Invoke-VersionGroupList) | **GET** /api/v2/version-group/ | List version groups
[**Invoke-VersionGroupRetrieve**](GamesApi.md#Invoke-VersionGroupRetrieve) | **GET** /api/v2/version-group/{id}/ | Get version group
[**Invoke-VersionList**](GamesApi.md#Invoke-VersionList) | **GET** /api/v2/version/ | List versions
[**Invoke-VersionRetrieve**](GamesApi.md#Invoke-VersionRetrieve) | **GET** /api/v2/version/{id}/ | Get version


<a id="Invoke-GenerationList"></a>
# **Invoke-GenerationList**
> PaginatedGenerationSummaryList Invoke-GenerationList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Offset] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Q] <String><br>

List genrations

A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.

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

# List genrations
try {
    $Result = Invoke-GenerationList -Limit $Limit -Offset $Offset -Q $Q
} catch {
    Write-Host ("Exception occurred when calling Invoke-GenerationList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
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

[**PaginatedGenerationSummaryList**](PaginatedGenerationSummaryList.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-GenerationRetrieve"></a>
# **Invoke-GenerationRetrieve**
> GenerationDetail Invoke-GenerationRetrieve<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Id] <String><br>

Get genration

A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.

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

# Get genration
try {
    $Result = Invoke-GenerationRetrieve -Id $Id
} catch {
    Write-Host ("Exception occurred when calling Invoke-GenerationRetrieve: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Id** | **String**| This parameter can be a string or an integer. | 

### Return type

[**GenerationDetail**](GenerationDetail.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-PokedexList"></a>
# **Invoke-PokedexList**
> PaginatedPokedexSummaryList Invoke-PokedexList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Offset] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Q] <String><br>

List pokedex

A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.

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

# List pokedex
try {
    $Result = Invoke-PokedexList -Limit $Limit -Offset $Offset -Q $Q
} catch {
    Write-Host ("Exception occurred when calling Invoke-PokedexList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
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

[**PaginatedPokedexSummaryList**](PaginatedPokedexSummaryList.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-PokedexRetrieve"></a>
# **Invoke-PokedexRetrieve**
> PokedexDetail Invoke-PokedexRetrieve<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Id] <String><br>

Get pokedex

A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.

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

# Get pokedex
try {
    $Result = Invoke-PokedexRetrieve -Id $Id
} catch {
    Write-Host ("Exception occurred when calling Invoke-PokedexRetrieve: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Id** | **String**| This parameter can be a string or an integer. | 

### Return type

[**PokedexDetail**](PokedexDetail.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-VersionGroupList"></a>
# **Invoke-VersionGroupList**
> PaginatedVersionGroupSummaryList Invoke-VersionGroupList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Offset] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Q] <String><br>

List version groups

Version groups categorize highly similar versions of the games.

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

# List version groups
try {
    $Result = Invoke-VersionGroupList -Limit $Limit -Offset $Offset -Q $Q
} catch {
    Write-Host ("Exception occurred when calling Invoke-VersionGroupList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
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

[**PaginatedVersionGroupSummaryList**](PaginatedVersionGroupSummaryList.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-VersionGroupRetrieve"></a>
# **Invoke-VersionGroupRetrieve**
> VersionGroupDetail Invoke-VersionGroupRetrieve<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Id] <String><br>

Get version group

Version groups categorize highly similar versions of the games.

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

# Get version group
try {
    $Result = Invoke-VersionGroupRetrieve -Id $Id
} catch {
    Write-Host ("Exception occurred when calling Invoke-VersionGroupRetrieve: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Id** | **String**| This parameter can be a string or an integer. | 

### Return type

[**VersionGroupDetail**](VersionGroupDetail.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-VersionList"></a>
# **Invoke-VersionList**
> PaginatedVersionSummaryList Invoke-VersionList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Offset] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Q] <String><br>

List versions

Versions of the games, e.g., Red, Blue or Yellow.

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

# List versions
try {
    $Result = Invoke-VersionList -Limit $Limit -Offset $Offset -Q $Q
} catch {
    Write-Host ("Exception occurred when calling Invoke-VersionList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
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

[**PaginatedVersionSummaryList**](PaginatedVersionSummaryList.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-VersionRetrieve"></a>
# **Invoke-VersionRetrieve**
> VersionDetail Invoke-VersionRetrieve<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Id] <String><br>

Get version

Versions of the games, e.g., Red, Blue or Yellow.

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

# Get version
try {
    $Result = Invoke-VersionRetrieve -Id $Id
} catch {
    Write-Host ("Exception occurred when calling Invoke-VersionRetrieve: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Id** | **String**| This parameter can be a string or an integer. | 

### Return type

[**VersionDetail**](VersionDetail.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

