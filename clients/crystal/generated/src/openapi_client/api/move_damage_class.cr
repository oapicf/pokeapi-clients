require "json"

module OpenAPIClient
  module Api
  class MoveDamageClass
    def initialize(@conn : Connection); end

    # List move damage classes Damage classes moves can have, e.g. physical, special, or non-damaging.
    def list(*, limit : Int32? = nil, offset : Int32? = nil, q : String? = nil) : Response(OpenAPIClient::PaginatedMoveDamageClassSummaryList)
      @conn.request(OpenAPIClient::PaginatedMoveDamageClassSummaryList,
        method: :GET,
        path: "/api/v2/move-damage-class/",
        query: { "limit" => limit, "offset" => offset, "q" => q },
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end

    # Get move damage class Damage classes moves can have, e.g. physical, special, or non-damaging.
    def retrieve(id : String) : Response(OpenAPIClient::MoveDamageClassDetail)
      @conn.request(OpenAPIClient::MoveDamageClassDetail,
        method: :GET,
        path: "/api/v2/move-damage-class/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end
  end
  end

end
