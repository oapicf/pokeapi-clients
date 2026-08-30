require "json"

module OpenAPIClient
  module Api
  class VersionGroup
    def initialize(@conn : Connection); end

    # List version groups Version groups categorize highly similar versions of the games.
    def list(*, limit : Int32? = nil, offset : Int32? = nil, q : String? = nil) : Response(OpenAPIClient::PaginatedVersionGroupSummaryList)
      @conn.request(OpenAPIClient::PaginatedVersionGroupSummaryList,
        method: :GET,
        path: "/api/v2/version-group/",
        query: { "limit" => limit, "offset" => offset, "q" => q },
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end

    # Get version group Version groups categorize highly similar versions of the games.
    def retrieve(id : String) : Response(OpenAPIClient::VersionGroupDetail)
      @conn.request(OpenAPIClient::VersionGroupDetail,
        method: :GET,
        path: "/api/v2/version-group/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end
  end
  end

end
