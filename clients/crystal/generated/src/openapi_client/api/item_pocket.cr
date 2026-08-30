require "json"

module OpenAPIClient
  module Api
  class ItemPocket
    def initialize(@conn : Connection); end

    # List item pockets Pockets within the players bag used for storing items by category.
    def list(*, limit : Int32? = nil, offset : Int32? = nil, q : String? = nil) : Response(OpenAPIClient::PaginatedItemPocketSummaryList)
      @conn.request(OpenAPIClient::PaginatedItemPocketSummaryList,
        method: :GET,
        path: "/api/v2/item-pocket/",
        query: { "limit" => limit, "offset" => offset, "q" => q },
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end

    # Get item pocket Pockets within the players bag used for storing items by category.
    def retrieve(id : String) : Response(OpenAPIClient::ItemPocketDetail)
      @conn.request(OpenAPIClient::ItemPocketDetail,
        method: :GET,
        path: "/api/v2/item-pocket/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end
  end
  end

end
