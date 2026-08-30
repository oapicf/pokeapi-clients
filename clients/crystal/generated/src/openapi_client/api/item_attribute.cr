require "json"

module OpenAPIClient
  module Api
  class ItemAttribute
    def initialize(@conn : Connection); end

    # List item attributes Item attributes define particular aspects of items, e.g.\&quot;usable in battle\&quot; or \&quot;consumable\&quot;.
    def list(*, limit : Int32? = nil, offset : Int32? = nil, q : String? = nil) : Response(OpenAPIClient::PaginatedItemAttributeSummaryList)
      @conn.request(OpenAPIClient::PaginatedItemAttributeSummaryList,
        method: :GET,
        path: "/api/v2/item-attribute/",
        query: { "limit" => limit, "offset" => offset, "q" => q },
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end

    # Get item attribute Item attributes define particular aspects of items, e.g.\&quot;usable in battle\&quot; or \&quot;consumable\&quot;.
    def retrieve(id : String) : Response(OpenAPIClient::ItemAttributeDetail)
      @conn.request(OpenAPIClient::ItemAttributeDetail,
        method: :GET,
        path: "/api/v2/item-attribute/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end
  end
  end

end
