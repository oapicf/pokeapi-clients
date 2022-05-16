# OAIPokeathlonStatApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pokeathlonStatList**](OAIPokeathlonStatApi.md#pokeathlonstatlist) | **GET** /api/v2/pokeathlon-stat/ | 
[**pokeathlonStatRead**](OAIPokeathlonStatApi.md#pokeathlonstatread) | **GET** /api/v2/pokeathlon-stat/{id}/ | 


# **pokeathlonStatList**
```objc
-(NSURLSessionTask*) pokeathlonStatListWithLimit: (NSNumber*) limit
    offset: (NSNumber*) offset
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```



### Example
```objc

NSNumber* limit = @56; //  (optional)
NSNumber* offset = @56; //  (optional)

OAIPokeathlonStatApi*apiInstance = [[OAIPokeathlonStatApi alloc] init];

[apiInstance pokeathlonStatListWithLimit:limit
              offset:offset
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIPokeathlonStatApi->pokeathlonStatList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **NSNumber***|  | [optional] 
 **offset** | **NSNumber***|  | [optional] 

### Return type

**NSString***

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pokeathlonStatRead**
```objc
-(NSURLSessionTask*) pokeathlonStatReadWithId: (NSNumber*) _id
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```



### Example
```objc

NSNumber* _id = @56; // 

OAIPokeathlonStatApi*apiInstance = [[OAIPokeathlonStatApi alloc] init];

[apiInstance pokeathlonStatReadWithId:_id
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIPokeathlonStatApi->pokeathlonStatRead: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSNumber***|  | 

### Return type

**NSString***

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

