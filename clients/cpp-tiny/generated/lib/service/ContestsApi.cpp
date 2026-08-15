#include "ContestsApi.h"

using namespace Tiny;



        Response<
            PaginatedContestEffectSummaryList
        >
        ContestsApi::
        contestEffectList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
        )
        {
            std::string url = basepath + "/api/v2/contest-effect/"; //


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




            PaginatedContestEffectSummaryList obj(output_string);


            Response<PaginatedContestEffectSummaryList> response(obj, httpCode);
            return response;
        }

        Response<
            ContestEffectDetail
        >
        ContestsApi::
        contestEffectRetrieve(
            
            std::string id
            
        )
        {
            std::string url = basepath + "/api/v2/contest-effect/{id}/"; //id 


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




            ContestEffectDetail obj(output_string);


            Response<ContestEffectDetail> response(obj, httpCode);
            return response;
        }

        Response<
            PaginatedContestTypeSummaryList
        >
        ContestsApi::
        contestTypeList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
        )
        {
            std::string url = basepath + "/api/v2/contest-type/"; //


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




            PaginatedContestTypeSummaryList obj(output_string);


            Response<PaginatedContestTypeSummaryList> response(obj, httpCode);
            return response;
        }

        Response<
            ContestTypeDetail
        >
        ContestsApi::
        contestTypeRetrieve(
            
            std::string id
            
        )
        {
            std::string url = basepath + "/api/v2/contest-type/{id}/"; //id 


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




            ContestTypeDetail obj(output_string);


            Response<ContestTypeDetail> response(obj, httpCode);
            return response;
        }

        Response<
            PaginatedSuperContestEffectSummaryList
        >
        ContestsApi::
        superContestEffectList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
        )
        {
            std::string url = basepath + "/api/v2/super-contest-effect/"; //


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




            PaginatedSuperContestEffectSummaryList obj(output_string);


            Response<PaginatedSuperContestEffectSummaryList> response(obj, httpCode);
            return response;
        }

        Response<
            SuperContestEffectDetail
        >
        ContestsApi::
        superContestEffectRetrieve(
            
            std::string id
            
        )
        {
            std::string url = basepath + "/api/v2/super-contest-effect/{id}/"; //id 


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




            SuperContestEffectDetail obj(output_string);


            Response<SuperContestEffectDetail> response(obj, httpCode);
            return response;
        }



