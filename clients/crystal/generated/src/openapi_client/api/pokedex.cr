require "json"

module OpenAPIClient
  module Api
  class Pokedex
    def initialize(@conn : Connection); end

    # List pokedex A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
    def list(*, limit : Int32? = nil, offset : Int32? = nil, q : String? = nil) : Response(OpenAPIClient::PaginatedPokedexSummaryList)
      @conn.request(OpenAPIClient::PaginatedPokedexSummaryList,
        method: :GET,
        path: "/api/v2/pokedex/",
        query: { "limit" => limit, "offset" => offset, "q" => q },
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end

    # Get pokedex A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
    def retrieve(id : String) : Response(OpenAPIClient::PokedexDetail)
      @conn.request(OpenAPIClient::PokedexDetail,
        method: :GET,
        path: "/api/v2/pokedex/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end
  end
  end

end
