# frozen_string_literal: true

module OpenapiClient
  module Api
    class LocationArea
      def initialize(connection)
        @connection = connection
      end

      def list(limit: nil, offset: nil)
        @connection.call(
          :GET,
          '/api/v2/location-area/',
          type: OpenapiClient::Models::PaginatedLocationAreaSummaryList,
          auth: ['basicAuth', 'cookieAuth'],
          query: { 'limit' => limit, 'offset' => offset }
        )
      end

      def retrieve(id:)
        raise ArgumentError, 'id is required' if id.nil?

        @connection.call(
          :GET,
          '/api/v2/location-area/{id}/'
            .gsub('{id}', ERB::Util.url_encode(id.to_s)),
          type: OpenapiClient::Models::LocationAreaDetail,
          auth: ['basicAuth', 'cookieAuth']
        )
      end
    end
  end
end
