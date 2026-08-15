#include "EncountersApi.h"

using namespace Tiny;



        Response<
            PaginatedEncounterConditionSummaryList
        >
        EncountersApi::
        encounterConditionList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
        )
        {
            std::string url = basepath + "/api/v2/encounter-condition/"; //


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




            PaginatedEncounterConditionSummaryList obj(output_string);


            Response<PaginatedEncounterConditionSummaryList> response(obj, httpCode);
            return response;
        }

        Response<
            EncounterConditionDetail
        >
        EncountersApi::
        encounterConditionRetrieve(
            
            std::string id
            
        )
        {
            std::string url = basepath + "/api/v2/encounter-condition/{id}/"; //id 


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




            EncounterConditionDetail obj(output_string);


            Response<EncounterConditionDetail> response(obj, httpCode);
            return response;
        }

        Response<
            PaginatedEncounterConditionValueSummaryList
        >
        EncountersApi::
        encounterConditionValueList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
        )
        {
            std::string url = basepath + "/api/v2/encounter-condition-value/"; //


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




            PaginatedEncounterConditionValueSummaryList obj(output_string);


            Response<PaginatedEncounterConditionValueSummaryList> response(obj, httpCode);
            return response;
        }

        Response<
            EncounterConditionValueDetail
        >
        EncountersApi::
        encounterConditionValueRetrieve(
            
            std::string id
            
        )
        {
            std::string url = basepath + "/api/v2/encounter-condition-value/{id}/"; //id 


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




            EncounterConditionValueDetail obj(output_string);


            Response<EncounterConditionValueDetail> response(obj, httpCode);
            return response;
        }

        Response<
            PaginatedEncounterMethodSummaryList
        >
        EncountersApi::
        encounterMethodList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
        )
        {
            std::string url = basepath + "/api/v2/encounter-method/"; //


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




            PaginatedEncounterMethodSummaryList obj(output_string);


            Response<PaginatedEncounterMethodSummaryList> response(obj, httpCode);
            return response;
        }

        Response<
            EncounterMethodDetail
        >
        EncountersApi::
        encounterMethodRetrieve(
            
            std::string id
            
        )
        {
            std::string url = basepath + "/api/v2/encounter-method/{id}/"; //id 


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




            EncounterMethodDetail obj(output_string);


            Response<EncounterMethodDetail> response(obj, httpCode);
            return response;
        }



