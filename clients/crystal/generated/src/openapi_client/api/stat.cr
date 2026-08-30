require "json"

module OpenAPIClient
  module Api
  class Stat
    def initialize(@conn : Connection); end

    # List stats Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
    def list(*, limit : Int32? = nil, offset : Int32? = nil, q : String? = nil) : Response(OpenAPIClient::PaginatedStatSummaryList)
      @conn.request(OpenAPIClient::PaginatedStatSummaryList,
        method: :GET,
        path: "/api/v2/stat/",
        query: { "limit" => limit, "offset" => offset, "q" => q },
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end

    # Get stat Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
    def retrieve(id : String) : Response(OpenAPIClient::StatDetail)
      @conn.request(OpenAPIClient::StatDetail,
        method: :GET,
        path: "/api/v2/stat/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end
  end
  end

end
