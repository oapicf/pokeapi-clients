require "json"

module OpenAPIClient
  module Api
  class PokemonForm
    def initialize(@conn : Connection); end

    # List pokemon forms Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the &#39;Pokémon&#39; entity is used to represent such a variety.
    def list(*, limit : Int32? = nil, offset : Int32? = nil, q : String? = nil) : Response(OpenAPIClient::PaginatedPokemonFormSummaryList)
      @conn.request(OpenAPIClient::PaginatedPokemonFormSummaryList,
        method: :GET,
        path: "/api/v2/pokemon-form/",
        query: { "limit" => limit, "offset" => offset, "q" => q },
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end

    # Get pokemon form Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the &#39;Pokémon&#39; entity is used to represent such a variety.
    def retrieve(id : String) : Response(OpenAPIClient::PokemonFormDetail)
      @conn.request(OpenAPIClient::PokemonFormDetail,
        method: :GET,
        path: "/api/v2/pokemon-form/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end
  end
  end

end
