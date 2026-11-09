# frozen_string_literal: true

module OpenapiClient
  module Api
    class Region
      def initialize(connection)
        @connection = connection
      end

      def list(limit: nil, offset: nil, q: nil)
        @connection.call(
          :GET,
          '/api/v2/region/',
          type: OpenapiClient::Models::PaginatedRegionSummaryList,
          auth: [],
          query: { 'limit' => limit, 'offset' => offset, 'q' => q }
        )
      end

      def retrieve(id:)
        raise ArgumentError, 'id is required' if id.nil?

        @connection.call(
          :GET,
          '/api/v2/region/{id}/'
            .gsub('{id}', ERB::Util.url_encode(id.to_s)),
          type: OpenapiClient::Models::RegionDetail,
          auth: []
        )
      end
    end
  end
end
