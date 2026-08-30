require "json"

module OpenAPIClient
  module Api
  class PokemonSpecies
    def initialize(@conn : Connection); end

    # List pokemon species A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
    def list(*, limit : Int32? = nil, offset : Int32? = nil, q : String? = nil) : Response(OpenAPIClient::PaginatedPokemonSpeciesSummaryList)
      @conn.request(OpenAPIClient::PaginatedPokemonSpeciesSummaryList,
        method: :GET,
        path: "/api/v2/pokemon-species/",
        query: { "limit" => limit, "offset" => offset, "q" => q },
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end

    # Get pokemon species A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
    def retrieve(id : String) : Response(OpenAPIClient::PokemonSpeciesDetail)
      @conn.request(OpenAPIClient::PokemonSpeciesDetail,
        method: :GET,
        path: "/api/v2/pokemon-species/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end
  end
  end

end
