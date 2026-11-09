# frozen_string_literal: true

module OpenapiClient
  module Api
    class Meta
      def initialize(connection)
        @connection = connection
      end

      def retrieve
        @connection.call(
          :GET,
          '/api/v2/meta/',
          type: OpenapiClient::Models::PokeapiMetaResponse,
          auth: []
        )
      end
    end
  end
end
