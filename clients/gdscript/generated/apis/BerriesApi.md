<a name="__pageTop"></a>
# BerriesApi   { #BerriesApi }


All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**berry_firmness_list**](#berry_firmness_list) | **GET** `/api/v2/berry-firmness/` | List berry firmness
[**berry_firmness_retrieve**](#berry_firmness_retrieve) | **GET** `/api/v2/berry-firmness/{id}/` | Get berry by firmness
[**berry_flavor_list**](#berry_flavor_list) | **GET** `/api/v2/berry-flavor/` | List berry flavors
[**berry_flavor_retrieve**](#berry_flavor_retrieve) | **GET** `/api/v2/berry-flavor/{id}/` | Get berries by flavor
[**berry_list**](#berry_list) | **GET** `/api/v2/berry/` | List berries
[**berry_retrieve**](#berry_retrieve) | **GET** `/api/v2/berry/{id}/` | Get a berry

# **berry_firmness_list**   { #berry_firmness_list }
<a name="berry_firmness_list"></a>

> `berry_firmness_list(limit = null,offset = null,q = null, on_success: Callable, on_failure: Callable)`

List berry firmness

Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.

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
var api = BerriesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BerriesApi.new(config, client)


# Invoke an endpoint
api.berry_firmness_list(
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
		prints("Success!", "berry_firmness_list", response)
		assert(response.data is PaginatedBerryFirmnessSummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **berry_firmness_retrieve**   { #berry_firmness_retrieve }
<a name="berry_firmness_retrieve"></a>

> `berry_firmness_retrieve(id: String, on_success: Callable, on_failure: Callable)`

Get berry by firmness

Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.

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
var api = BerriesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BerriesApi.new(config, client)


# Invoke an endpoint
api.berry_firmness_retrieve(
	# id: String   Eg: id_example
	# This parameter can be a string or an integer.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "berry_firmness_retrieve", response)
		assert(response.data is BerryFirmnessDetail)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **berry_flavor_list**   { #berry_flavor_list }
<a name="berry_flavor_list"></a>

> `berry_flavor_list(limit = null,offset = null,q = null, on_success: Callable, on_failure: Callable)`

List berry flavors

Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.

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
var api = BerriesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BerriesApi.new(config, client)


# Invoke an endpoint
api.berry_flavor_list(
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
		prints("Success!", "berry_flavor_list", response)
		assert(response.data is PaginatedBerryFlavorSummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **berry_flavor_retrieve**   { #berry_flavor_retrieve }
<a name="berry_flavor_retrieve"></a>

> `berry_flavor_retrieve(id: String, on_success: Callable, on_failure: Callable)`

Get berries by flavor

Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.

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
var api = BerriesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BerriesApi.new(config, client)


# Invoke an endpoint
api.berry_flavor_retrieve(
	# id: String   Eg: id_example
	# This parameter can be a string or an integer.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "berry_flavor_retrieve", response)
		assert(response.data is BerryFlavorDetail)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **berry_list**   { #berry_list }
<a name="berry_list"></a>

> `berry_list(limit = null,offset = null,q = null, on_success: Callable, on_failure: Callable)`

List berries

Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.

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
var api = BerriesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BerriesApi.new(config, client)


# Invoke an endpoint
api.berry_list(
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
		prints("Success!", "berry_list", response)
		assert(response.data is PaginatedBerrySummaryList)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```

# **berry_retrieve**   { #berry_retrieve }
<a name="berry_retrieve"></a>

> `berry_retrieve(id: String, on_success: Callable, on_failure: Callable)`

Get a berry

Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.

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
var api = BerriesApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = BerriesApi.new(config, client)


# Invoke an endpoint
api.berry_retrieve(
	# id: String   Eg: id_example
	# This parameter can be a string or an integer.
	id,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "berry_retrieve", response)
		assert(response.data is BerryDetail)
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

