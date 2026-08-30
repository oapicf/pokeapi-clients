<a name="__pageTop"></a>
# EncountersApi   { #EncountersApi }


All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**encounter_condition_list**](#encounter_condition_list) | **GET** `/api/v2/encounter-condition/` | List encounter conditions
[**encounter_condition_retrieve**](#encounter_condition_retrieve) | **GET** `/api/v2/encounter-condition/{id}/` | Get encounter condition
[**encounter_condition_value_list**](#encounter_condition_value_list) | **GET** `/api/v2/encounter-condition-value/` | List encounter condition values
[**encounter_condition_value_retrieve**](#encounter_condition_value_retrieve) | **GET** `/api/v2/encounter-condition-value/{id}/` | Get encounter condition value
[**encounter_method_list**](#encounter_method_list) | **GET** `/api/v2/encounter-method/` | List encounter methods
[**encounter_method_retrieve**](#encounter_method_retrieve) | **GET** `/api/v2/encounter-method/{id}/` | Get encounter method

# **encounter_condition_list**   { #encounter_condition_list }
<a name="encounter_condition_list"></a>

> `encounter_condition_list(limit = null,offset = null,q = null, on_success: Callable, on_failure: Callable)`

List encounter conditions

Conditions which affect what pokemon might appear in the wild, e.g., day or night.

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
var api = EncountersApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = EncountersApi.new(config, client)


# Invoke an endpoint
api.encounter_condition_list(
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
		prints("Success!", "encounter_condition_list", response)
		assert(response.data is PaginatedEncounterConditionSummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **encounter_condition_retrieve**   { #encounter_condition_retrieve }
<a name="encounter_condition_retrieve"></a>

> `encounter_condition_retrieve(id: String, on_success: Callable, on_failure: Callable)`

Get encounter condition

Conditions which affect what pokemon might appear in the wild, e.g., day or night.

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
var api = EncountersApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = EncountersApi.new(config, client)


# Invoke an endpoint
api.encounter_condition_retrieve(
	# id: String   Eg: id_example
	# This parameter can be a string or an integer.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "encounter_condition_retrieve", response)
		assert(response.data is EncounterConditionDetail)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **encounter_condition_value_list**   { #encounter_condition_value_list }
<a name="encounter_condition_value_list"></a>

> `encounter_condition_value_list(limit = null,offset = null,q = null, on_success: Callable, on_failure: Callable)`

List encounter condition values

Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.

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
var api = EncountersApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = EncountersApi.new(config, client)


# Invoke an endpoint
api.encounter_condition_value_list(
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
		prints("Success!", "encounter_condition_value_list", response)
		assert(response.data is PaginatedEncounterConditionValueSummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **encounter_condition_value_retrieve**   { #encounter_condition_value_retrieve }
<a name="encounter_condition_value_retrieve"></a>

> `encounter_condition_value_retrieve(id: String, on_success: Callable, on_failure: Callable)`

Get encounter condition value

Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.

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
var api = EncountersApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = EncountersApi.new(config, client)


# Invoke an endpoint
api.encounter_condition_value_retrieve(
	# id: String   Eg: id_example
	# This parameter can be a string or an integer.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "encounter_condition_value_retrieve", response)
		assert(response.data is EncounterConditionValueDetail)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **encounter_method_list**   { #encounter_method_list }
<a name="encounter_method_list"></a>

> `encounter_method_list(limit = null,offset = null,q = null, on_success: Callable, on_failure: Callable)`

List encounter methods

Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.

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
var api = EncountersApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = EncountersApi.new(config, client)


# Invoke an endpoint
api.encounter_method_list(
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
		prints("Success!", "encounter_method_list", response)
		assert(response.data is PaginatedEncounterMethodSummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **encounter_method_retrieve**   { #encounter_method_retrieve }
<a name="encounter_method_retrieve"></a>

> `encounter_method_retrieve(id: String, on_success: Callable, on_failure: Callable)`

Get encounter method

Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.

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
var api = EncountersApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = EncountersApi.new(config, client)


# Invoke an endpoint
api.encounter_method_retrieve(
	# id: String   Eg: id_example
	# This parameter can be a string or an integer.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "encounter_method_retrieve", response)
		assert(response.data is EncounterMethodDetail)
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

