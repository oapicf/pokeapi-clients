# WWW::OpenAPIClient::ItemCategoryApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::ItemCategoryApi;
```

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**item_category_list**](ItemCategoryApi.md#item_category_list) | **GET** /api/v2/item-category/ | 
[**item_category_read**](ItemCategoryApi.md#item_category_read) | **GET** /api/v2/item-category/{id}/ | 


# **item_category_list**
> string item_category_list(limit => $limit, offset => $offset)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ItemCategoryApi;
my $api_instance = WWW::OpenAPIClient::ItemCategoryApi->new(
);

my $limit = 56; # int | 
my $offset = 56; # int | 

eval {
    my $result = $api_instance->item_category_list(limit => $limit, offset => $offset);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ItemCategoryApi->item_category_list: $@\n";
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **item_category_read**
> string item_category_read(id => $id)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ItemCategoryApi;
my $api_instance = WWW::OpenAPIClient::ItemCategoryApi->new(
);

my $id = 56; # int | 

eval {
    my $result = $api_instance->item_category_read(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ItemCategoryApi->item_category_read: $@\n";
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

