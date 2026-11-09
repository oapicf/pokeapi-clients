require "json"

module OpenAPIClient
  module Api
  class Machine
    def initialize(@conn : Connection); end

    # List machines Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
    def list(*, limit : Int32? = nil, offset : Int32? = nil) : Response(OpenAPIClient::PaginatedMachineSummaryList)
      @conn.request(OpenAPIClient::PaginatedMachineSummaryList,
        method: :GET,
        path: "/api/v2/machine/",
        query: { "limit" => limit, "offset" => offset },
        accept: %w[application/json],
        auth: %w[])
    end

    # Get machine Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
    def retrieve(id : String) : Response(OpenAPIClient::MachineDetail)
      @conn.request(OpenAPIClient::MachineDetail,
        method: :GET,
        path: "/api/v2/machine/{id}/".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[])
    end
  end
  end

end
