require "json"

module OpenAPIClient
  module Api
  class PokemonHabitat
    def initialize(@conn : Connection); end

    # List pokemom habitas Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
    def list(*, limit : Int32? = nil, offset : Int32? = nil, q : String? = nil) : Response(OpenAPIClient::PaginatedPokemonHabitatSummaryList)
      @conn.request(OpenAPIClient::PaginatedPokemonHabitatSummaryList,
        method: :GET,
        path: "/api/v2/pokemon-habitat/",
        query: { "limit" => limit, "offset" => offset, "q" => q },
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end

    # Get pokemom habita Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
    def retrieve(id : String) : Response(OpenAPIClient::PokemonHabitatDetail)
      @conn.request(OpenAPIClient::PokemonHabitatDetail,
        method: :GET,
        path: "/api/v2/pokemon-habitat/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end
  end
  end

end
