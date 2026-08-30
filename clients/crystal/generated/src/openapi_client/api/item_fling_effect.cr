require "json"

module OpenAPIClient
  module Api
  class ItemFlingEffect
    def initialize(@conn : Connection); end

    # List item fling effects The various effects of the move\&quot;Fling\&quot; when used with different items.
    def list(*, limit : Int32? = nil, offset : Int32? = nil, q : String? = nil) : Response(OpenAPIClient::PaginatedItemFlingEffectSummaryList)
      @conn.request(OpenAPIClient::PaginatedItemFlingEffectSummaryList,
        method: :GET,
        path: "/api/v2/item-fling-effect/",
        query: { "limit" => limit, "offset" => offset, "q" => q },
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end

    # Get item fling effect The various effects of the move\&quot;Fling\&quot; when used with different items.
    def retrieve(id : String) : Response(OpenAPIClient::ItemFlingEffectDetail)
      @conn.request(OpenAPIClient::ItemFlingEffectDetail,
        method: :GET,
        path: "/api/v2/item-fling-effect/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end
  end
  end

end
