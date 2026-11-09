# frozen_string_literal: true

module OpenapiClient
  module Api
    class Currency
      def initialize(connection)
        @connection = connection
      end

      def list(limit: nil, offset: nil, q: nil)
        @connection.call(
          :GET,
          '/api/v2/currency/',
          type: OpenapiClient::Models::PaginatedCurrencySummaryList,
          auth: [],
          query: { 'limit' => limit, 'offset' => offset, 'q' => q }
        )
      end

      def retrieve(id:)
        raise ArgumentError, 'id is required' if id.nil?

        @connection.call(
          :GET,
          '/api/v2/currency/{id}/'
            .gsub('{id}', ERB::Util.url_encode(id.to_s)),
          type: OpenapiClient::Models::CurrencyDetail,
          auth: []
        )
      end
    end
  end
end
