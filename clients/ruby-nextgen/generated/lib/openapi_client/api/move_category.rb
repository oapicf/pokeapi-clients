# frozen_string_literal: true

module OpenapiClient
  module Api
    class MoveCategory
      def initialize(connection)
        @connection = connection
      end

      def list(limit: nil, offset: nil, q: nil)
        @connection.call(
          :GET,
          '/api/v2/move-category/',
          type: OpenapiClient::Models::PaginatedMoveMetaCategorySummaryList,
          auth: ['basicAuth', 'cookieAuth'],
          query: { 'limit' => limit, 'offset' => offset, 'q' => q }
        )
      end

      def retrieve(id:)
        raise ArgumentError, 'id is required' if id.nil?

        @connection.call(
          :GET,
          '/api/v2/move-category/{id}/'
            .gsub('{id}', ERB::Util.url_encode(id.to_s)),
          type: OpenapiClient::Models::MoveMetaCategoryDetail,
          auth: ['basicAuth', 'cookieAuth']
        )
      end
    end
  end
end
