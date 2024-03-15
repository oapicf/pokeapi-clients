# MoveBattleStyleApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**moveBattleStyleList**](MoveBattleStyleApi.md#moveBattleStyleList) | **GET** /api/v2/move-battle-style/ |  |
| [**moveBattleStyleRead**](MoveBattleStyleApi.md#moveBattleStyleRead) | **GET** /api/v2/move-battle-style/{id}/ |  |


<a id="moveBattleStyleList"></a>
# **moveBattleStyleList**
> String moveBattleStyleList(limit, offset)



### Example
```java
// Import classes:
import com.github.oapicf.pokeapiclient.ApiClient;
import com.github.oapicf.pokeapiclient.ApiException;
import com.github.oapicf.pokeapiclient.Configuration;
import com.github.oapicf.pokeapiclient.models.*;
import com.github.oapicf.pokeapiclient.api.MoveBattleStyleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://pokeapi.co");

    MoveBattleStyleApi apiInstance = new MoveBattleStyleApi(defaultClient);
    Integer limit = 56; // Integer | 
    Integer offset = 56; // Integer | 
    try {
      String result = apiInstance.moveBattleStyleList(limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MoveBattleStyleApi#moveBattleStyleList");
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

<a id="moveBattleStyleRead"></a>
# **moveBattleStyleRead**
> String moveBattleStyleRead(id)



### Example
```java
// Import classes:
import com.github.oapicf.pokeapiclient.ApiClient;
import com.github.oapicf.pokeapiclient.ApiException;
import com.github.oapicf.pokeapiclient.Configuration;
import com.github.oapicf.pokeapiclient.models.*;
import com.github.oapicf.pokeapiclient.api.MoveBattleStyleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://pokeapi.co");

    MoveBattleStyleApi apiInstance = new MoveBattleStyleApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      String result = apiInstance.moveBattleStyleRead(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MoveBattleStyleApi#moveBattleStyleRead");
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

