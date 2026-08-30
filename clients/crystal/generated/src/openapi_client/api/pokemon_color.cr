require "json"

module OpenAPIClient
  module Api
  class PokemonColor
    def initialize(@conn : Connection); end

    # List pokemon colors Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon&#39;s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
    def list(*, limit : Int32? = nil, offset : Int32? = nil, q : String? = nil) : Response(OpenAPIClient::PaginatedPokemonColorSummaryList)
      @conn.request(OpenAPIClient::PaginatedPokemonColorSummaryList,
        method: :GET,
        path: "/api/v2/pokemon-color/",
        query: { "limit" => limit, "offset" => offset, "q" => q },
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end

    # Get pokemon color Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon&#39;s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
    def retrieve(id : String) : Response(OpenAPIClient::PokemonColorDetail)
      @conn.request(OpenAPIClient::PokemonColorDetail,
        method: :GET,
        path: "/api/v2/pokemon-color/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end
  end
  end

end
