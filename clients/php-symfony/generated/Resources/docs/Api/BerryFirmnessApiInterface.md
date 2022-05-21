# OpenAPI\Server\Api\BerryFirmnessApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**berryFirmnessList**](BerryFirmnessApiInterface.md#berryFirmnessList) | **GET** /api/v2/berry-firmness/ | 
[**berryFirmnessRead**](BerryFirmnessApiInterface.md#berryFirmnessRead) | **GET** /api/v2/berry-firmness/{id}/ | 


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.berryFirmness:
        class: Acme\MyBundle\Api\BerryFirmnessApi
        tags:
            - { name: "open_api_server.api", api: "berryFirmness" }
    # ...
```

## **berryFirmnessList**
> string berryFirmnessList($limit, $offset)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BerryFirmnessApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BerryFirmnessApiInterface;

class BerryFirmnessApi implements BerryFirmnessApiInterface
{

    // ...

    /**
     * Implementation of BerryFirmnessApiInterface#berryFirmnessList
     */
    public function berryFirmnessList($limit = null, $offset = null)
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

## **berryFirmnessRead**
> string berryFirmnessRead($id)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BerryFirmnessApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BerryFirmnessApiInterface;

class BerryFirmnessApi implements BerryFirmnessApiInterface
{

    // ...

    /**
     * Implementation of BerryFirmnessApiInterface#berryFirmnessRead
     */
    public function berryFirmnessRead($id)
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

