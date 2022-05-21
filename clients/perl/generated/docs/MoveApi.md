# WWW::OpenAPIClient::MoveApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::MoveApi;
```

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**move_list**](MoveApi.md#move_list) | **GET** /api/v2/move/ | 
[**move_read**](MoveApi.md#move_read) | **GET** /api/v2/move/{id}/ | 


# **move_list**
> string move_list(limit => $limit, offset => $offset)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::MoveApi;
my $api_instance = WWW::OpenAPIClient::MoveApi->new(
);

my $limit = 56; # int | 
my $offset = 56; # int | 

eval {
    my $result = $api_instance->move_list(limit => $limit, offset => $offset);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling MoveApi->move_list: $@\n";
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

# **move_read**
> string move_read(id => $id)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::MoveApi;
my $api_instance = WWW::OpenAPIClient::MoveApi->new(
);

my $id = 56; # int | 

eval {
    my $result = $api_instance->move_read(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling MoveApi->move_read: $@\n";
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

