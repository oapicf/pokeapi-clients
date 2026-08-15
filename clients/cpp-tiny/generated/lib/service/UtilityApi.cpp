#include "UtilityApi.h"

using namespace Tiny;



        Response<
            PaginatedLanguageSummaryList
        >
        UtilityApi::
        languageList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
        )
        {
            std::string url = basepath + "/api/v2/language/"; //


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




            PaginatedLanguageSummaryList obj(output_string);


            Response<PaginatedLanguageSummaryList> response(obj, httpCode);
            return response;
        }

        Response<
            LanguageDetail
        >
        UtilityApi::
        languageRetrieve(
            
            std::string id
            
        )
        {
            std::string url = basepath + "/api/v2/language/{id}/"; //id 


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




            LanguageDetail obj(output_string);


            Response<LanguageDetail> response(obj, httpCode);
            return response;
        }



