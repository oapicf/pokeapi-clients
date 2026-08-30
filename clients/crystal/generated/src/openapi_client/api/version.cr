require "json"

module OpenAPIClient
  module Api
  class Version
    def initialize(@conn : Connection); end

    # List versions Versions of the games, e.g., Red, Blue or Yellow.
    def list(*, limit : Int32? = nil, offset : Int32? = nil, q : String? = nil) : Response(OpenAPIClient::PaginatedVersionSummaryList)
      @conn.request(OpenAPIClient::PaginatedVersionSummaryList,
        method: :GET,
        path: "/api/v2/version/",
        query: { "limit" => limit, "offset" => offset, "q" => q },
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end

    # Get version Versions of the games, e.g., Red, Blue or Yellow.
    def retrieve(id : String) : Response(OpenAPIClient::VersionDetail)
      @conn.request(OpenAPIClient::VersionDetail,
        method: :GET,
        path: "/api/v2/version/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end
  end
  end

end
