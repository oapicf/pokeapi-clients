# PSOpenAPITools.PSOpenAPITools\Api.BerriesApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-BerryFirmnessList**](BerriesApi.md#Invoke-BerryFirmnessList) | **GET** /api/v2/berry-firmness/ | List berry firmness
[**Invoke-BerryFirmnessRetrieve**](BerriesApi.md#Invoke-BerryFirmnessRetrieve) | **GET** /api/v2/berry-firmness/{id}/ | Get berry by firmness
[**Invoke-BerryFlavorList**](BerriesApi.md#Invoke-BerryFlavorList) | **GET** /api/v2/berry-flavor/ | List berry flavors
[**Invoke-BerryFlavorRetrieve**](BerriesApi.md#Invoke-BerryFlavorRetrieve) | **GET** /api/v2/berry-flavor/{id}/ | Get berries by flavor
[**Invoke-BerryList**](BerriesApi.md#Invoke-BerryList) | **GET** /api/v2/berry/ | List berries
[**Invoke-BerryRetrieve**](BerriesApi.md#Invoke-BerryRetrieve) | **GET** /api/v2/berry/{id}/ | Get a berry


<a id="Invoke-BerryFirmnessList"></a>
# **Invoke-BerryFirmnessList**
> PaginatedBerryFirmnessSummaryList Invoke-BerryFirmnessList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Offset] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Q] <String><br>

List berry firmness

Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.

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

# List berry firmness
try {
    $Result = Invoke-BerryFirmnessList -Limit $Limit -Offset $Offset -Q $Q
} catch {
    Write-Host ("Exception occurred when calling Invoke-BerryFirmnessList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
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

[**PaginatedBerryFirmnessSummaryList**](PaginatedBerryFirmnessSummaryList.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-BerryFirmnessRetrieve"></a>
# **Invoke-BerryFirmnessRetrieve**
> BerryFirmnessDetail Invoke-BerryFirmnessRetrieve<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Id] <String><br>

Get berry by firmness

Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.

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

# Get berry by firmness
try {
    $Result = Invoke-BerryFirmnessRetrieve -Id $Id
} catch {
    Write-Host ("Exception occurred when calling Invoke-BerryFirmnessRetrieve: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Id** | **String**| This parameter can be a string or an integer. | 

### Return type

[**BerryFirmnessDetail**](BerryFirmnessDetail.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-BerryFlavorList"></a>
# **Invoke-BerryFlavorList**
> PaginatedBerryFlavorSummaryList Invoke-BerryFlavorList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Offset] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Q] <String><br>

List berry flavors

Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.

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

# List berry flavors
try {
    $Result = Invoke-BerryFlavorList -Limit $Limit -Offset $Offset -Q $Q
} catch {
    Write-Host ("Exception occurred when calling Invoke-BerryFlavorList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
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

[**PaginatedBerryFlavorSummaryList**](PaginatedBerryFlavorSummaryList.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-BerryFlavorRetrieve"></a>
# **Invoke-BerryFlavorRetrieve**
> BerryFlavorDetail Invoke-BerryFlavorRetrieve<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Id] <String><br>

Get berries by flavor

Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.

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

# Get berries by flavor
try {
    $Result = Invoke-BerryFlavorRetrieve -Id $Id
} catch {
    Write-Host ("Exception occurred when calling Invoke-BerryFlavorRetrieve: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Id** | **String**| This parameter can be a string or an integer. | 

### Return type

[**BerryFlavorDetail**](BerryFlavorDetail.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-BerryList"></a>
# **Invoke-BerryList**
> PaginatedBerrySummaryList Invoke-BerryList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Offset] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Q] <String><br>

List berries

Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.

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

# List berries
try {
    $Result = Invoke-BerryList -Limit $Limit -Offset $Offset -Q $Q
} catch {
    Write-Host ("Exception occurred when calling Invoke-BerryList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
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

[**PaginatedBerrySummaryList**](PaginatedBerrySummaryList.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-BerryRetrieve"></a>
# **Invoke-BerryRetrieve**
> BerryDetail Invoke-BerryRetrieve<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Id] <String><br>

Get a berry

Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.

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

# Get a berry
try {
    $Result = Invoke-BerryRetrieve -Id $Id
} catch {
    Write-Host ("Exception occurred when calling Invoke-BerryRetrieve: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Id** | **String**| This parameter can be a string or an integer. | 

### Return type

[**BerryDetail**](BerryDetail.md) (PSCustomObject)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

