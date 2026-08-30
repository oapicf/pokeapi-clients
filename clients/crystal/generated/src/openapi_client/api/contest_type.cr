require "json"

module OpenAPIClient
  module Api
  class ContestType
    def initialize(@conn : Connection); end

    # List contest types Contest types are categories judges used to weigh a Pokémon&#39;s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
    def list(*, limit : Int32? = nil, offset : Int32? = nil, q : String? = nil) : Response(OpenAPIClient::PaginatedContestTypeSummaryList)
      @conn.request(OpenAPIClient::PaginatedContestTypeSummaryList,
        method: :GET,
        path: "/api/v2/contest-type/",
        query: { "limit" => limit, "offset" => offset, "q" => q },
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end

    # Get contest type Contest types are categories judges used to weigh a Pokémon&#39;s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
    def retrieve(id : String) : Response(OpenAPIClient::ContestTypeDetail)
      @conn.request(OpenAPIClient::ContestTypeDetail,
        method: :GET,
        path: "/api/v2/contest-type/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end
  end
  end

end
