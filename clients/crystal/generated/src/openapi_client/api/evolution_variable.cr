require "json"

module OpenAPIClient
  module Api
  class EvolutionVariable
    def initialize(@conn : Connection); end

    # List evolution variables Evolution variables represent parameters (such as Encryption Constant and Personality Value) used in boolean expressions for form-branching evolutions. Check out [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Personality_value) for greater detail.
    def list(*, limit : Int32? = nil, offset : Int32? = nil, q : String? = nil) : Response(OpenAPIClient::PaginatedEvolutionVariableSummaryList)
      @conn.request(OpenAPIClient::PaginatedEvolutionVariableSummaryList,
        method: :GET,
        path: "/api/v2/evolution-variable/",
        query: { "limit" => limit, "offset" => offset, "q" => q },
        accept: %w[application/json],
        auth: %w[])
    end

    # Get evolution variable Evolution variables represent parameters (such as Encryption Constant and Personality Value) used in boolean expressions for form-branching evolutions. Check out [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Personality_value) for greater detail.
    def retrieve(id : String) : Response(OpenAPIClient::EvolutionVariableDetail)
      @conn.request(OpenAPIClient::EvolutionVariableDetail,
        method: :GET,
        path: "/api/v2/evolution-variable/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[])
    end
  end
  end

end
