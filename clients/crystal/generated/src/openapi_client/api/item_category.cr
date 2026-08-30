require "json"

module OpenAPIClient
  module Api
  class ItemCategory
    def initialize(@conn : Connection); end

    # List item categories Item categories determine where items will be placed in the players bag.
    def list(*, limit : Int32? = nil, offset : Int32? = nil, q : String? = nil) : Response(OpenAPIClient::PaginatedItemCategorySummaryList)
      @conn.request(OpenAPIClient::PaginatedItemCategorySummaryList,
        method: :GET,
        path: "/api/v2/item-category/",
        query: { "limit" => limit, "offset" => offset, "q" => q },
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end

    # Get item category Item categories determine where items will be placed in the players bag.
    def retrieve(id : String) : Response(OpenAPIClient::ItemCategoryDetail)
      @conn.request(OpenAPIClient::ItemCategoryDetail,
        method: :GET,
        path: "/api/v2/item-category/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end
  end
  end

end
