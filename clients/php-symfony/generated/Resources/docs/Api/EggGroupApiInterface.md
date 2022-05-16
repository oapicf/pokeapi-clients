# OpenAPI\Server\Api\EggGroupApiInterface

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**eggGroupList**](EggGroupApiInterface.md#eggGroupList) | **GET** /api/v2/egg-group/ | 
[**eggGroupRead**](EggGroupApiInterface.md#eggGroupRead) | **GET** /api/v2/egg-group/{id}/ | 


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.eggGroup:
        class: Acme\MyBundle\Api\EggGroupApi
        tags:
            - { name: "open_api_server.api", api: "eggGroup" }
    # ...
```

## **eggGroupList**
> string eggGroupList($limit, $offset)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/EggGroupApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\EggGroupApiInterface;

class EggGroupApi implements EggGroupApiInterface
{

    // ...

    /**
     * Implementation of EggGroupApiInterface#eggGroupList
     */
    public function eggGroupList($limit = null, $offset = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**|  | [optional]
 **offset** | **int**|  | [optional]

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **eggGroupRead**
> string eggGroupRead($id)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/EggGroupApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\EggGroupApiInterface;

class EggGroupApi implements EggGroupApiInterface
{

    // ...

    /**
     * Implementation of EggGroupApiInterface#eggGroupRead
     */
    public function eggGroupRead($id)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**|  |

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

