require "json"

module OpenAPIClient
  module Api
  class Item
    def initialize(@conn : Connection); end

    # List items An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
    def list(*, limit : Int32? = nil, offset : Int32? = nil, q : String? = nil) : Response(OpenAPIClient::PaginatedItemSummaryList)
      @conn.request(OpenAPIClient::PaginatedItemSummaryList,
        method: :GET,
        path: "/api/v2/item/",
        query: { "limit" => limit, "offset" => offset, "q" => q },
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end

    # Get item An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
    def retrieve(id : String) : Response(OpenAPIClient::ItemDetail)
      @conn.request(OpenAPIClient::ItemDetail,
        method: :GET,
        path: "/api/v2/item/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[basicAuth cookieAuth])
    end
  end
  end

end
