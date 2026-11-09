require "json"

module OpenAPIClient
  module Api
  class Currency
    def initialize(@conn : Connection); end

    # List currencies Currencies used to buy items.
    def list(*, limit : Int32? = nil, offset : Int32? = nil, q : String? = nil) : Response(OpenAPIClient::PaginatedCurrencySummaryList)
      @conn.request(OpenAPIClient::PaginatedCurrencySummaryList,
        method: :GET,
        path: "/api/v2/currency/",
        query: { "limit" => limit, "offset" => offset, "q" => q },
        accept: %w[application/json],
        auth: %w[])
    end

    # Get currency Currencies used to buy items.
    def retrieve(id : String) : Response(OpenAPIClient::CurrencyDetail)
      @conn.request(OpenAPIClient::CurrencyDetail,
        method: :GET,
        path: "/api/v2/currency/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[])
    end
  end
  end

end
