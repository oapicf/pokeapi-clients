# MoveApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**moveList**](MoveApi.md#moveList) | **GET** /api/v2/move/ |  |
| [**moveRead**](MoveApi.md#moveRead) | **GET** /api/v2/move/{id}/ |  |


<a id="moveList"></a>
# **moveList**
> String moveList(limit, offset)



### Example
```java
// Import classes:
import com.cliffano.pokeapiclient.ApiClient;
import com.cliffano.pokeapiclient.ApiException;
import com.cliffano.pokeapiclient.Configuration;
import com.cliffano.pokeapiclient.models.*;
import com.cliffano.pokeapiclient.api.MoveApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://pokeapi.co");

    MoveApi apiInstance = new MoveApi(defaultClient);
    Integer limit = 56; // Integer | 
    Integer offset = 56; // Integer | 
    try {
      String result = apiInstance.moveList(limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MoveApi#moveList");
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
| **limit** | **Integer**|  | [optional] |
| **offset** | **Integer**|  | [optional] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

<a id="moveRead"></a>
# **moveRead**
> String moveRead(id)



### Example
```java
// Import classes:
import com.cliffano.pokeapiclient.ApiClient;
import com.cliffano.pokeapiclient.ApiException;
import com.cliffano.pokeapiclient.Configuration;
import com.cliffano.pokeapiclient.models.*;
import com.cliffano.pokeapiclient.api.MoveApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://pokeapi.co");

    MoveApi apiInstance = new MoveApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      String result = apiInstance.moveRead(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MoveApi#moveRead");
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
| **id** | **Integer**|  | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

