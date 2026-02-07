# LocationApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**locationAreaList**](LocationApi.md#locationAreaList) | **GET** /api/v2/location-area/ | List location areas |
| [**locationAreaRetrieve**](LocationApi.md#locationAreaRetrieve) | **GET** /api/v2/location-area/{id}/ | Get location area |
| [**locationList**](LocationApi.md#locationList) | **GET** /api/v2/location/ | List locations |
| [**locationRetrieve**](LocationApi.md#locationRetrieve) | **GET** /api/v2/location/{id}/ | Get location |
| [**palParkAreaList**](LocationApi.md#palParkAreaList) | **GET** /api/v2/pal-park-area/ | List pal park areas |
| [**palParkAreaRetrieve**](LocationApi.md#palParkAreaRetrieve) | **GET** /api/v2/pal-park-area/{id}/ | Get pal park area |
| [**regionList**](LocationApi.md#regionList) | **GET** /api/v2/region/ | List regions |
| [**regionRetrieve**](LocationApi.md#regionRetrieve) | **GET** /api/v2/region/{id}/ | Get region |


<a id="locationAreaList"></a>
# **locationAreaList**
> PaginatedLocationAreaSummaryList locationAreaList(limit, offset)

List location areas

Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.

### Example
```java
// Import classes:
import com.github.oapicf.pokeapiclient.ApiClient;
import com.github.oapicf.pokeapiclient.ApiException;
import com.github.oapicf.pokeapiclient.Configuration;
import com.github.oapicf.pokeapiclient.auth.*;
import com.github.oapicf.pokeapiclient.models.*;
import com.github.oapicf.pokeapiclient.api.LocationApi;

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

    LocationApi apiInstance = new LocationApi(defaultClient);
    Integer limit = 56; // Integer | Number of results to return per page.
    Integer offset = 56; // Integer | The initial index from which to return the results.
    try {
      PaginatedLocationAreaSummaryList result = apiInstance.locationAreaList(limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationApi#locationAreaList");
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

### Return type

[**PaginatedLocationAreaSummaryList**](PaginatedLocationAreaSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="locationAreaRetrieve"></a>
# **locationAreaRetrieve**
> LocationAreaDetail locationAreaRetrieve(id)

Get location area

Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.

### Example
```java
// Import classes:
import com.github.oapicf.pokeapiclient.ApiClient;
import com.github.oapicf.pokeapiclient.ApiException;
import com.github.oapicf.pokeapiclient.Configuration;
import com.github.oapicf.pokeapiclient.auth.*;
import com.github.oapicf.pokeapiclient.models.*;
import com.github.oapicf.pokeapiclient.api.LocationApi;

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

    LocationApi apiInstance = new LocationApi(defaultClient);
    Integer id = 56; // Integer | A unique integer value identifying this location area.
    try {
      LocationAreaDetail result = apiInstance.locationAreaRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationApi#locationAreaRetrieve");
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
| **id** | **Integer**| A unique integer value identifying this location area. | |

### Return type

[**LocationAreaDetail**](LocationAreaDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="locationList"></a>
# **locationList**
> PaginatedLocationSummaryList locationList(limit, offset, q)

List locations

Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.

### Example
```java
// Import classes:
import com.github.oapicf.pokeapiclient.ApiClient;
import com.github.oapicf.pokeapiclient.ApiException;
import com.github.oapicf.pokeapiclient.Configuration;
import com.github.oapicf.pokeapiclient.auth.*;
import com.github.oapicf.pokeapiclient.models.*;
import com.github.oapicf.pokeapiclient.api.LocationApi;

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

    LocationApi apiInstance = new LocationApi(defaultClient);
    Integer limit = 56; // Integer | Number of results to return per page.
    Integer offset = 56; // Integer | The initial index from which to return the results.
    String q = "q_example"; // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    try {
      PaginatedLocationSummaryList result = apiInstance.locationList(limit, offset, q);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationApi#locationList");
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

[**PaginatedLocationSummaryList**](PaginatedLocationSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="locationRetrieve"></a>
# **locationRetrieve**
> LocationDetail locationRetrieve(id)

Get location

Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.

### Example
```java
// Import classes:
import com.github.oapicf.pokeapiclient.ApiClient;
import com.github.oapicf.pokeapiclient.ApiException;
import com.github.oapicf.pokeapiclient.Configuration;
import com.github.oapicf.pokeapiclient.auth.*;
import com.github.oapicf.pokeapiclient.models.*;
import com.github.oapicf.pokeapiclient.api.LocationApi;

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

    LocationApi apiInstance = new LocationApi(defaultClient);
    String id = "id_example"; // String | This parameter can be a string or an integer.
    try {
      LocationDetail result = apiInstance.locationRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationApi#locationRetrieve");
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

[**LocationDetail**](LocationDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="palParkAreaList"></a>
# **palParkAreaList**
> PaginatedPalParkAreaSummaryList palParkAreaList(limit, offset, q)

List pal park areas

Areas used for grouping Pokémon encounters in Pal Park. They&#39;re like habitats that are specific to Pal Park.

### Example
```java
// Import classes:
import com.github.oapicf.pokeapiclient.ApiClient;
import com.github.oapicf.pokeapiclient.ApiException;
import com.github.oapicf.pokeapiclient.Configuration;
import com.github.oapicf.pokeapiclient.auth.*;
import com.github.oapicf.pokeapiclient.models.*;
import com.github.oapicf.pokeapiclient.api.LocationApi;

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

    LocationApi apiInstance = new LocationApi(defaultClient);
    Integer limit = 56; // Integer | Number of results to return per page.
    Integer offset = 56; // Integer | The initial index from which to return the results.
    String q = "q_example"; // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    try {
      PaginatedPalParkAreaSummaryList result = apiInstance.palParkAreaList(limit, offset, q);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationApi#palParkAreaList");
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

[**PaginatedPalParkAreaSummaryList**](PaginatedPalParkAreaSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="palParkAreaRetrieve"></a>
# **palParkAreaRetrieve**
> PalParkAreaDetail palParkAreaRetrieve(id)

Get pal park area

Areas used for grouping Pokémon encounters in Pal Park. They&#39;re like habitats that are specific to Pal Park.

### Example
```java
// Import classes:
import com.github.oapicf.pokeapiclient.ApiClient;
import com.github.oapicf.pokeapiclient.ApiException;
import com.github.oapicf.pokeapiclient.Configuration;
import com.github.oapicf.pokeapiclient.auth.*;
import com.github.oapicf.pokeapiclient.models.*;
import com.github.oapicf.pokeapiclient.api.LocationApi;

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

    LocationApi apiInstance = new LocationApi(defaultClient);
    String id = "id_example"; // String | This parameter can be a string or an integer.
    try {
      PalParkAreaDetail result = apiInstance.palParkAreaRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationApi#palParkAreaRetrieve");
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

[**PalParkAreaDetail**](PalParkAreaDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="regionList"></a>
# **regionList**
> PaginatedRegionSummaryList regionList(limit, offset, q)

List regions

A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.

### Example
```java
// Import classes:
import com.github.oapicf.pokeapiclient.ApiClient;
import com.github.oapicf.pokeapiclient.ApiException;
import com.github.oapicf.pokeapiclient.Configuration;
import com.github.oapicf.pokeapiclient.auth.*;
import com.github.oapicf.pokeapiclient.models.*;
import com.github.oapicf.pokeapiclient.api.LocationApi;

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

    LocationApi apiInstance = new LocationApi(defaultClient);
    Integer limit = 56; // Integer | Number of results to return per page.
    Integer offset = 56; // Integer | The initial index from which to return the results.
    String q = "q_example"; // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    try {
      PaginatedRegionSummaryList result = apiInstance.regionList(limit, offset, q);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationApi#regionList");
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

[**PaginatedRegionSummaryList**](PaginatedRegionSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="regionRetrieve"></a>
# **regionRetrieve**
> RegionDetail regionRetrieve(id)

Get region

A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.

### Example
```java
// Import classes:
import com.github.oapicf.pokeapiclient.ApiClient;
import com.github.oapicf.pokeapiclient.ApiException;
import com.github.oapicf.pokeapiclient.Configuration;
import com.github.oapicf.pokeapiclient.auth.*;
import com.github.oapicf.pokeapiclient.models.*;
import com.github.oapicf.pokeapiclient.api.LocationApi;

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

    LocationApi apiInstance = new LocationApi(defaultClient);
    String id = "id_example"; // String | This parameter can be a string or an integer.
    try {
      RegionDetail result = apiInstance.regionRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationApi#regionRetrieve");
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

[**RegionDetail**](RegionDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

