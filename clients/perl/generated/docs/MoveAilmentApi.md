# WWW::OpenAPIClient::MoveAilmentApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::MoveAilmentApi;
```

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**move_ailment_list**](MoveAilmentApi.md#move_ailment_list) | **GET** /api/v2/move-ailment/ | 
[**move_ailment_read**](MoveAilmentApi.md#move_ailment_read) | **GET** /api/v2/move-ailment/{id}/ | 


# **move_ailment_list**
> string move_ailment_list(limit => $limit, offset => $offset)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::MoveAilmentApi;
my $api_instance = WWW::OpenAPIClient::MoveAilmentApi->new(
);

my $limit = 56; # int | 
my $offset = 56; # int | 

eval {
    my $result = $api_instance->move_ailment_list(limit => $limit, offset => $offset);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling MoveAilmentApi->move_ailment_list: $@\n";
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

# **move_ailment_read**
> string move_ailment_read(id => $id)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::MoveAilmentApi;
my $api_instance = WWW::OpenAPIClient::MoveAilmentApi->new(
);

my $id = 56; # int | 

eval {
    my $result = $api_instance->move_ailment_read(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling MoveAilmentApi->move_ailment_read: $@\n";
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

