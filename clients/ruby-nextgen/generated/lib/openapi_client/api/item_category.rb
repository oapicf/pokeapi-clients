# frozen_string_literal: true

module OpenapiClient
  module Api
    class ItemCategory
      def initialize(connection)
        @connection = connection
      end

      def list(limit: nil, offset: nil, q: nil)
        @connection.call(
          :GET,
          '/api/v2/item-category/',
          type: OpenapiClient::Models::PaginatedItemCategorySummaryList,
          auth: ['basicAuth', 'cookieAuth'],
          query: { 'limit' => limit, 'offset' => offset, 'q' => q }
        )
      end

      def retrieve(id:)
        raise ArgumentError, 'id is required' if id.nil?

        @connection.call(
          :GET,
          '/api/v2/item-category/{id}/'
            .gsub('{id}', ERB::Util.url_encode(id.to_s)),
          type: OpenapiClient::Models::ItemCategoryDetail,
          auth: ['basicAuth', 'cookieAuth']
        )
      end
    end
  end
end
