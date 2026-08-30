require "json"

module OpenAPIClient
  module Api
  class Ability
    def initialize(@conn : Connection); end

    #  Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.
    def list(*, limit : Int32? = nil, offset : Int32? = nil, q : String? = nil) : Response(OpenAPIClient::PaginatedAbilitySummaryList)
      @conn.request(OpenAPIClient::PaginatedAbilitySummaryList,
        method: :GET,
        path: "/api/v2/ability/",
        query: { "limit" => limit, "offset" => offset, "q" => q },
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end

    #  Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.
    def retrieve(id : String) : Response(OpenAPIClient::AbilityDetail)
      @conn.request(OpenAPIClient::AbilityDetail,
        method: :GET,
        path: "/api/v2/ability/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end
  end
  end

end
