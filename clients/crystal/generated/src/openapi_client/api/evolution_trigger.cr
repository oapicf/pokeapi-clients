require "json"

module OpenAPIClient
  module Api
  class EvolutionTrigger
    def initialize(@conn : Connection); end

    # List evolution triggers Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
    def list(*, limit : Int32? = nil, offset : Int32? = nil, q : String? = nil) : Response(OpenAPIClient::PaginatedEvolutionTriggerSummaryList)
      @conn.request(OpenAPIClient::PaginatedEvolutionTriggerSummaryList,
        method: :GET,
        path: "/api/v2/evolution-trigger/",
        query: { "limit" => limit, "offset" => offset, "q" => q },
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end

    # Get evolution trigger Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
    def retrieve(id : String) : Response(OpenAPIClient::EvolutionTriggerDetail)
      @conn.request(OpenAPIClient::EvolutionTriggerDetail,
        method: :GET,
        path: "/api/v2/evolution-trigger/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end
  end
  end

end
