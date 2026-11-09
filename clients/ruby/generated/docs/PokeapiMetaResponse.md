# PokeApiClient::PokeapiMetaResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **deploy_date** | **String** | The deployment time as a Unix timestamp string. |  |
| **hash** | **String** | The source commit hash used for this deployment. |  |
| **tag** | **String** | The deployment tag, or null if the deployment has no tag. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::PokeapiMetaResponse.new(
  deploy_date: null,
  hash: null,
  tag: null
)
```

