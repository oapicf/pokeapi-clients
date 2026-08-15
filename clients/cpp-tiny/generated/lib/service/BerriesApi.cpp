#include "BerriesApi.h"

using namespace Tiny;



        Response<
            PaginatedBerryFirmnessSummaryList
        >
        BerriesApi::
        berryFirmnessList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
        )
        {
            std::string url = basepath + "/api/v2/berry-firmness/"; //


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




            PaginatedBerryFirmnessSummaryList obj(output_string);


            Response<PaginatedBerryFirmnessSummaryList> response(obj, httpCode);
            return response;
        }

        Response<
            BerryFirmnessDetail
        >
        BerriesApi::
        berryFirmnessRetrieve(
            
            std::string id
            
        )
        {
            std::string url = basepath + "/api/v2/berry-firmness/{id}/"; //id 


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




            BerryFirmnessDetail obj(output_string);


            Response<BerryFirmnessDetail> response(obj, httpCode);
            return response;
        }

        Response<
            PaginatedBerryFlavorSummaryList
        >
        BerriesApi::
        berryFlavorList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
        )
        {
            std::string url = basepath + "/api/v2/berry-flavor/"; //


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




            PaginatedBerryFlavorSummaryList obj(output_string);


            Response<PaginatedBerryFlavorSummaryList> response(obj, httpCode);
            return response;
        }

        Response<
            BerryFlavorDetail
        >
        BerriesApi::
        berryFlavorRetrieve(
            
            std::string id
            
        )
        {
            std::string url = basepath + "/api/v2/berry-flavor/{id}/"; //id 


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




            BerryFlavorDetail obj(output_string);


            Response<BerryFlavorDetail> response(obj, httpCode);
            return response;
        }

        Response<
            PaginatedBerrySummaryList
        >
        BerriesApi::
        berryList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
        )
        {
            std::string url = basepath + "/api/v2/berry/"; //


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




            PaginatedBerrySummaryList obj(output_string);


            Response<PaginatedBerrySummaryList> response(obj, httpCode);
            return response;
        }

        Response<
            BerryDetail
        >
        BerriesApi::
        berryRetrieve(
            
            std::string id
            
        )
        {
            std::string url = basepath + "/api/v2/berry/{id}/"; //id 


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




            BerryDetail obj(output_string);


            Response<BerryDetail> response(obj, httpCode);
            return response;
        }



