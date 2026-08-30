require "json"

module OpenAPIClient
  module Api
  class PokeathlonStat
    def initialize(@conn : Connection); end

    # List pokeathlon stats Pokeathlon Stats are different attributes of a Pokémon&#39;s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
    def list(*, limit : Int32? = nil, offset : Int32? = nil, q : String? = nil) : Response(OpenAPIClient::PaginatedPokeathlonStatSummaryList)
      @conn.request(OpenAPIClient::PaginatedPokeathlonStatSummaryList,
        method: :GET,
        path: "/api/v2/pokeathlon-stat/",
        query: { "limit" => limit, "offset" => offset, "q" => q },
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end

    # Get pokeathlon stat Pokeathlon Stats are different attributes of a Pokémon&#39;s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
    def retrieve(id : String) : Response(OpenAPIClient::PokeathlonStatDetail)
      @conn.request(OpenAPIClient::PokeathlonStatDetail,
        method: :GET,
        path: "/api/v2/pokeathlon-stat/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end
  end
  end

end
