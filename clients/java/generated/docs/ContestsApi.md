# ContestsApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**contestEffectList**](ContestsApi.md#contestEffectList) | **GET** /api/v2/contest-effect/ | List contest effects |
| [**contestEffectRetrieve**](ContestsApi.md#contestEffectRetrieve) | **GET** /api/v2/contest-effect/{id}/ | Get contest effect |
| [**contestTypeList**](ContestsApi.md#contestTypeList) | **GET** /api/v2/contest-type/ | List contest types |
| [**contestTypeRetrieve**](ContestsApi.md#contestTypeRetrieve) | **GET** /api/v2/contest-type/{id}/ | Get contest type |
| [**superContestEffectList**](ContestsApi.md#superContestEffectList) | **GET** /api/v2/super-contest-effect/ | List super contest effects |
| [**superContestEffectRetrieve**](ContestsApi.md#superContestEffectRetrieve) | **GET** /api/v2/super-contest-effect/{id}/ | Get super contest effect |


<a id="contestEffectList"></a>
# **contestEffectList**
> PaginatedContestEffectSummaryList contestEffectList(limit, offset, q)

List contest effects

Contest effects refer to the effects of moves when used in contests.

### Example
```java
// Import classes:
import com.github.oapicf.pokeapiclient.ApiClient;
import com.github.oapicf.pokeapiclient.ApiException;
import com.github.oapicf.pokeapiclient.Configuration;
import com.github.oapicf.pokeapiclient.auth.*;
import com.github.oapicf.pokeapiclient.models.*;
import com.github.oapicf.pokeapiclient.api.ContestsApi;

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

    ContestsApi apiInstance = new ContestsApi(defaultClient);
    Integer limit = 56; // Integer | Number of results to return per page.
    Integer offset = 56; // Integer | The initial index from which to return the results.
    String q = "q_example"; // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    try {
      PaginatedContestEffectSummaryList result = apiInstance.contestEffectList(limit, offset, q);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContestsApi#contestEffectList");
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

[**PaginatedContestEffectSummaryList**](PaginatedContestEffectSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="contestEffectRetrieve"></a>
# **contestEffectRetrieve**
> ContestEffectDetail contestEffectRetrieve(id)

Get contest effect

Contest effects refer to the effects of moves when used in contests.

### Example
```java
// Import classes:
import com.github.oapicf.pokeapiclient.ApiClient;
import com.github.oapicf.pokeapiclient.ApiException;
import com.github.oapicf.pokeapiclient.Configuration;
import com.github.oapicf.pokeapiclient.auth.*;
import com.github.oapicf.pokeapiclient.models.*;
import com.github.oapicf.pokeapiclient.api.ContestsApi;

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

    ContestsApi apiInstance = new ContestsApi(defaultClient);
    String id = "id_example"; // String | This parameter can be a string or an integer.
    try {
      ContestEffectDetail result = apiInstance.contestEffectRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContestsApi#contestEffectRetrieve");
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

[**ContestEffectDetail**](ContestEffectDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="contestTypeList"></a>
# **contestTypeList**
> PaginatedContestTypeSummaryList contestTypeList(limit, offset, q)

List contest types

Contest types are categories judges used to weigh a Pokémon&#39;s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.

### Example
```java
// Import classes:
import com.github.oapicf.pokeapiclient.ApiClient;
import com.github.oapicf.pokeapiclient.ApiException;
import com.github.oapicf.pokeapiclient.Configuration;
import com.github.oapicf.pokeapiclient.auth.*;
import com.github.oapicf.pokeapiclient.models.*;
import com.github.oapicf.pokeapiclient.api.ContestsApi;

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

    ContestsApi apiInstance = new ContestsApi(defaultClient);
    Integer limit = 56; // Integer | Number of results to return per page.
    Integer offset = 56; // Integer | The initial index from which to return the results.
    String q = "q_example"; // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    try {
      PaginatedContestTypeSummaryList result = apiInstance.contestTypeList(limit, offset, q);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContestsApi#contestTypeList");
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

[**PaginatedContestTypeSummaryList**](PaginatedContestTypeSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="contestTypeRetrieve"></a>
# **contestTypeRetrieve**
> ContestTypeDetail contestTypeRetrieve(id)

Get contest type

Contest types are categories judges used to weigh a Pokémon&#39;s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.

### Example
```java
// Import classes:
import com.github.oapicf.pokeapiclient.ApiClient;
import com.github.oapicf.pokeapiclient.ApiException;
import com.github.oapicf.pokeapiclient.Configuration;
import com.github.oapicf.pokeapiclient.auth.*;
import com.github.oapicf.pokeapiclient.models.*;
import com.github.oapicf.pokeapiclient.api.ContestsApi;

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

    ContestsApi apiInstance = new ContestsApi(defaultClient);
    String id = "id_example"; // String | This parameter can be a string or an integer.
    try {
      ContestTypeDetail result = apiInstance.contestTypeRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContestsApi#contestTypeRetrieve");
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

[**ContestTypeDetail**](ContestTypeDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="superContestEffectList"></a>
# **superContestEffectList**
> PaginatedSuperContestEffectSummaryList superContestEffectList(limit, offset, q)

List super contest effects

Super contest effects refer to the effects of moves when used in super contests.

### Example
```java
// Import classes:
import com.github.oapicf.pokeapiclient.ApiClient;
import com.github.oapicf.pokeapiclient.ApiException;
import com.github.oapicf.pokeapiclient.Configuration;
import com.github.oapicf.pokeapiclient.auth.*;
import com.github.oapicf.pokeapiclient.models.*;
import com.github.oapicf.pokeapiclient.api.ContestsApi;

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

    ContestsApi apiInstance = new ContestsApi(defaultClient);
    Integer limit = 56; // Integer | Number of results to return per page.
    Integer offset = 56; // Integer | The initial index from which to return the results.
    String q = "q_example"; // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
    try {
      PaginatedSuperContestEffectSummaryList result = apiInstance.superContestEffectList(limit, offset, q);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContestsApi#superContestEffectList");
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

[**PaginatedSuperContestEffectSummaryList**](PaginatedSuperContestEffectSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="superContestEffectRetrieve"></a>
# **superContestEffectRetrieve**
> SuperContestEffectDetail superContestEffectRetrieve(id)

Get super contest effect

Super contest effects refer to the effects of moves when used in super contests.

### Example
```java
// Import classes:
import com.github.oapicf.pokeapiclient.ApiClient;
import com.github.oapicf.pokeapiclient.ApiException;
import com.github.oapicf.pokeapiclient.Configuration;
import com.github.oapicf.pokeapiclient.auth.*;
import com.github.oapicf.pokeapiclient.models.*;
import com.github.oapicf.pokeapiclient.api.ContestsApi;

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

    ContestsApi apiInstance = new ContestsApi(defaultClient);
    String id = "id_example"; // String | This parameter can be a string or an integer.
    try {
      SuperContestEffectDetail result = apiInstance.superContestEffectRetrieve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContestsApi#superContestEffectRetrieve");
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

[**SuperContestEffectDetail**](SuperContestEffectDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

