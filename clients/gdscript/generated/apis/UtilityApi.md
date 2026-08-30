<a name="__pageTop"></a>
# UtilityApi   { #UtilityApi }


All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**language_list**](#language_list) | **GET** `/api/v2/language/` | List languages
[**language_retrieve**](#language_retrieve) | **GET** `/api/v2/language/{id}/` | Get language

# **language_list**   { #language_list }
<a name="language_list"></a>

> `language_list(limit = null,offset = null,q = null, on_success: Callable, on_failure: Callable)`

List languages

Languages for translations of API resource information.

### Example

* Basic Authentication (`basicAuth`)
* Api Key Authentication (`cookieAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = UtilityApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = UtilityApi.new(config, client)


# Invoke an endpoint
api.language_list(
	# limit: int   Eg: 56
	# Number of results to return per page.
	limit,
	# offset: int   Eg: 56
	# The initial index from which to return the results.
	offset,
	# q: String   Eg: q_example
	# > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
	q,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "language_list", response)
		assert(response.data is PaginatedLanguageSummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **language_retrieve**   { #language_retrieve }
<a name="language_retrieve"></a>

> `language_retrieve(id: String, on_success: Callable, on_failure: Callable)`

Get language

Languages for translations of API resource information.

### Example

* Basic Authentication (`basicAuth`)
* Api Key Authentication (`cookieAuth`)

```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = UtilityApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = UtilityApi.new(config, client)


# Invoke an endpoint
api.language_retrieve(
	# id: String   Eg: id_example
	# This parameter can be a string or an integer.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "language_retrieve", response)
		assert(response.data is LanguageDetail)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```


### Authorization

[basicAuth](../README.md#basicAuth), 
[cookieAuth](../README.md#cookieAuth)

[[Back to top]](#__pageTop) \
[[Back to API list]](../README.md#documentation-for-api-endpoints) \
[[Back to Model list]](../README.md#documentation-for-models) \
[[Back to README]](../README.md) \

