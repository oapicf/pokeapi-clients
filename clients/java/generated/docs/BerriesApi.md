# BerriesApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**berryFirmnessList**](BerriesApi.md#berryFirmnessList) | **GET** /api/v2/berry-firmness/ | List berry firmness |
| [**berryFirmnessRetrieve**](BerriesApi.md#berryFirmnessRetrieve) | **GET** /api/v2/berry-firmness/{id}/ | Get berry by firmness |
| [**berryFlavorList**](BerriesApi.md#berryFlavorList) | **GET** /api/v2/berry-flavor/ | List berry flavors |
| [**berryFlavorRetrieve**](BerriesApi.md#berryFlavorRetrieve) | **GET** /api/v2/berry-flavor/{id}/ | Get berries by flavor |
| [**berryList**](BerriesApi.md#berryList) | **GET** /api/v2/berry/ | List berries |
| [**berryRetrieve**](BerriesApi.md#berryRetrieve) | **GET** /api/v2/berry/{id}/ | Get a berry |


<a id="berryFirmnessList"></a>
# **berryFirmnessList**
> PaginatedBerryFirmnessSummaryList berryFirmnessList(limit, offset, q)

List berry firmness

Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.

### Example
```java
// Import classes:
import com.github.oapicf.pokeapiclient.ApiClient;
import com.github.oapicf.pokeapiclient.ApiException;
import com.github.oapicf.pokeapiclient.Configuration;
import com.github.oapicf.pokeapiclient.auth.*;
import com.github.oapicf.pokeapiclient.models.*;
import com.github.oapicf.pokeapiclient.api.BerriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://pokeapi.co");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: cookieAuth
    ApiKeyAuth cookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("cookieAuth");
    cookieAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //cookieAuth.setApiKeyPrefix("Token");

    BerriesApi apiInstance = new BerriesApi(defaultClient);
    Integer limit = 56; // Integer | Number of results to return per page.
    Integer offset = 56; // Integer | The initial index from which to return the results.
    String q = "q_example"; // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    try {
      PaginatedBerryFirmnessSummaryList result = apiInstance.berryFirmnessList(limit, offset, q);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BerriesApi#berryFirmnessList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Number of results to return per page. | [optional] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] |
| **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedBerryFirmnessSummaryList**](PaginatedBerryFirmnessSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="berryFirmnessRetrieve"></a>
# **berryFirmnessRetrieve**
> BerryFirmnessDetail berryFirmnessRetrieve(id)

Get berry by firmness

Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.

### Example
```java
// Import classes:
import com.github.oapicf.pokeapiclient.ApiClient;
import com.github.oapicf.pokeapiclient.ApiException;
import com.github.oapicf.pokeapiclient.Configuration;
import com.github.oapicf.pokeapiclient.auth.*;
import com.github.oapicf.pokeapiclient.models.*;
import com.github.oapicf.pokeapiclient.api.BerriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://pokeapi.co");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: cookieAuth
    ApiKeyAuth cookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("cookieAuth");
    cookieAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //cookieAuth.setApiKeyPrefix("Token");

    BerriesApi apiInstance = new BerriesApi(defaultClient);
    String id = "id_example"; // String | This parameter can be a string or an integer.
    try {
      BerryFirmnessDetail result = apiInstance.berryFirmnessRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BerriesApi#berryFirmnessRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| This parameter can be a string or an integer. | |

### Return type

[**BerryFirmnessDetail**](BerryFirmnessDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="berryFlavorList"></a>
# **berryFlavorList**
> PaginatedBerryFlavorSummaryList berryFlavorList(limit, offset, q)

List berry flavors

Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.

### Example
```java
// Import classes:
import com.github.oapicf.pokeapiclient.ApiClient;
import com.github.oapicf.pokeapiclient.ApiException;
import com.github.oapicf.pokeapiclient.Configuration;
import com.github.oapicf.pokeapiclient.auth.*;
import com.github.oapicf.pokeapiclient.models.*;
import com.github.oapicf.pokeapiclient.api.BerriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://pokeapi.co");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: cookieAuth
    ApiKeyAuth cookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("cookieAuth");
    cookieAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //cookieAuth.setApiKeyPrefix("Token");

    BerriesApi apiInstance = new BerriesApi(defaultClient);
    Integer limit = 56; // Integer | Number of results to return per page.
    Integer offset = 56; // Integer | The initial index from which to return the results.
    String q = "q_example"; // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    try {
      PaginatedBerryFlavorSummaryList result = apiInstance.berryFlavorList(limit, offset, q);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BerriesApi#berryFlavorList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Number of results to return per page. | [optional] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] |
| **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedBerryFlavorSummaryList**](PaginatedBerryFlavorSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="berryFlavorRetrieve"></a>
# **berryFlavorRetrieve**
> BerryFlavorDetail berryFlavorRetrieve(id)

Get berries by flavor

Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.

### Example
```java
// Import classes:
import com.github.oapicf.pokeapiclient.ApiClient;
import com.github.oapicf.pokeapiclient.ApiException;
import com.github.oapicf.pokeapiclient.Configuration;
import com.github.oapicf.pokeapiclient.auth.*;
import com.github.oapicf.pokeapiclient.models.*;
import com.github.oapicf.pokeapiclient.api.BerriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://pokeapi.co");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: cookieAuth
    ApiKeyAuth cookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("cookieAuth");
    cookieAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //cookieAuth.setApiKeyPrefix("Token");

    BerriesApi apiInstance = new BerriesApi(defaultClient);
    String id = "id_example"; // String | This parameter can be a string or an integer.
    try {
      BerryFlavorDetail result = apiInstance.berryFlavorRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BerriesApi#berryFlavorRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| This parameter can be a string or an integer. | |

### Return type

[**BerryFlavorDetail**](BerryFlavorDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="berryList"></a>
# **berryList**
> PaginatedBerrySummaryList berryList(limit, offset, q)

List berries

Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.

### Example
```java
// Import classes:
import com.github.oapicf.pokeapiclient.ApiClient;
import com.github.oapicf.pokeapiclient.ApiException;
import com.github.oapicf.pokeapiclient.Configuration;
import com.github.oapicf.pokeapiclient.auth.*;
import com.github.oapicf.pokeapiclient.models.*;
import com.github.oapicf.pokeapiclient.api.BerriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://pokeapi.co");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: cookieAuth
    ApiKeyAuth cookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("cookieAuth");
    cookieAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //cookieAuth.setApiKeyPrefix("Token");

    BerriesApi apiInstance = new BerriesApi(defaultClient);
    Integer limit = 56; // Integer | Number of results to return per page.
    Integer offset = 56; // Integer | The initial index from which to return the results.
    String q = "q_example"; // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    try {
      PaginatedBerrySummaryList result = apiInstance.berryList(limit, offset, q);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BerriesApi#berryList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Number of results to return per page. | [optional] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] |
| **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedBerrySummaryList**](PaginatedBerrySummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="berryRetrieve"></a>
# **berryRetrieve**
> BerryDetail berryRetrieve(id)

Get a berry

Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.

### Example
```java
// Import classes:
import com.github.oapicf.pokeapiclient.ApiClient;
import com.github.oapicf.pokeapiclient.ApiException;
import com.github.oapicf.pokeapiclient.Configuration;
import com.github.oapicf.pokeapiclient.auth.*;
import com.github.oapicf.pokeapiclient.models.*;
import com.github.oapicf.pokeapiclient.api.BerriesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://pokeapi.co");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: cookieAuth
    ApiKeyAuth cookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("cookieAuth");
    cookieAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //cookieAuth.setApiKeyPrefix("Token");

    BerriesApi apiInstance = new BerriesApi(defaultClient);
    String id = "id_example"; // String | This parameter can be a string or an integer.
    try {
      BerryDetail result = apiInstance.berryRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BerriesApi#berryRetrieve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| This parameter can be a string or an integer. | |

### Return type

[**BerryDetail**](BerryDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

