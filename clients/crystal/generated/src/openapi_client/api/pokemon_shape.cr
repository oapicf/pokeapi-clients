require "json"

module OpenAPIClient
  module Api
  class PokemonShape
    def initialize(@conn : Connection); end

    # List pokemon shapes Shapes used for sorting Pokémon in a Pokédex.
    def list(*, limit : Int32? = nil, offset : Int32? = nil, q : String? = nil) : Response(OpenAPIClient::PaginatedPokemonShapeSummaryList)
      @conn.request(OpenAPIClient::PaginatedPokemonShapeSummaryList,
        method: :GET,
        path: "/api/v2/pokemon-shape/",
        query: { "limit" => limit, "offset" => offset, "q" => q },
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end

    # Get pokemon shape Shapes used for sorting Pokémon in a Pokédex.
    def retrieve(id : String) : Response(OpenAPIClient::PokemonShapeDetail)
      @conn.request(OpenAPIClient::PokemonShapeDetail,
        method: :GET,
        path: "/api/v2/pokemon-shape/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end
  end
  end

end
