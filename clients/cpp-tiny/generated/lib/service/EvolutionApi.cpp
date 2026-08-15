#include "EvolutionApi.h"

using namespace Tiny;



        Response<
            PaginatedEvolutionChainSummaryList
        >
        EvolutionApi::
        evolutionChainList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
        )
        {
            std::string url = basepath + "/api/v2/evolution-chain/"; //


            // Headers  | 

            // Query    | limit offset q 
            addQueryParam("limit",limit);
            addQueryParam("offset",offset);
            addQueryParam("q",q);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            PaginatedEvolutionChainSummaryList obj(output_string);


            Response<PaginatedEvolutionChainSummaryList> response(obj, httpCode);
            return response;
        }

        Response<
            EvolutionChainDetail
        >
        EvolutionApi::
        evolutionChainRetrieve(
            
            std::string id
            
        )
        {
            std::string url = basepath + "/api/v2/evolution-chain/{id}/"; //id 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_id("{");
                s_id.append("id");
                s_id.append("}");

                int pos = url.find(s_id);

                url.erase(pos, s_id.length());
                url.insert(pos, stringify(id));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            EvolutionChainDetail obj(output_string);


            Response<EvolutionChainDetail> response(obj, httpCode);
            return response;
        }

        Response<
            PaginatedEvolutionTriggerSummaryList
        >
        EvolutionApi::
        evolutionTriggerList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
        )
        {
            std::string url = basepath + "/api/v2/evolution-trigger/"; //


            // Headers  | 

            // Query    | limit offset q 
            addQueryParam("limit",limit);
            addQueryParam("offset",offset);
            addQueryParam("q",q);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            PaginatedEvolutionTriggerSummaryList obj(output_string);


            Response<PaginatedEvolutionTriggerSummaryList> response(obj, httpCode);
            return response;
        }

        Response<
            EvolutionTriggerDetail
        >
        EvolutionApi::
        evolutionTriggerRetrieve(
            
            std::string id
            
        )
        {
            std::string url = basepath + "/api/v2/evolution-trigger/{id}/"; //id 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_id("{");
                s_id.append("id");
                s_id.append("}");

                int pos = url.find(s_id);

                url.erase(pos, s_id.length());
                url.insert(pos, stringify(id));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            EvolutionTriggerDetail obj(output_string);


            Response<EvolutionTriggerDetail> response(obj, httpCode);
            return response;
        }



