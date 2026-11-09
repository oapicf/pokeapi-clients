# frozen_string_literal: true

module OpenapiClient
  module Api
    class Characteristic
      def initialize(connection)
        @connection = connection
      end

      def list(limit: nil, offset: nil)
        @connection.call(
          :GET,
          '/api/v2/characteristic/',
          type: OpenapiClient::Models::PaginatedCharacteristicSummaryList,
          auth: [],
          query: { 'limit' => limit, 'offset' => offset }
        )
      end

      def retrieve(id:)
        raise ArgumentError, 'id is required' if id.nil?

        @connection.call(
          :GET,
          '/api/v2/characteristic/{id}/'
            .gsub('{id}', ERB::Util.url_encode(id.to_s)),
          type: OpenapiClient::Models::CharacteristicDetail,
          auth: []
        )
      end
    end
  end
end
