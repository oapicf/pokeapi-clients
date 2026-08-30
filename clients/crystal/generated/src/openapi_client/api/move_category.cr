require "json"

module OpenAPIClient
  module Api
  class MoveCategory
    def initialize(@conn : Connection); end

    # List move meta categories Very general categories that loosely group move effects.
    def list(*, limit : Int32? = nil, offset : Int32? = nil, q : String? = nil) : Response(OpenAPIClient::PaginatedMoveMetaCategorySummaryList)
      @conn.request(OpenAPIClient::PaginatedMoveMetaCategorySummaryList,
        method: :GET,
        path: "/api/v2/move-category/",
        query: { "limit" => limit, "offset" => offset, "q" => q },
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end

    # Get move meta category Very general categories that loosely group move effects.
    def retrieve(id : String) : Response(OpenAPIClient::MoveMetaCategoryDetail)
      @conn.request(OpenAPIClient::MoveMetaCategoryDetail,
        method: :GET,
        path: "/api/v2/move-category/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end
  end
  end

end
