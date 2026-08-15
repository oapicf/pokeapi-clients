#include "LocationApi.h"

using namespace Tiny;



        Response<
            PaginatedLocationAreaSummaryList
        >
        LocationApi::
        locationAreaList(
            
            int limit
            , 
            
            int offset
            
        )
        {
            std::string url = basepath + "/api/v2/location-area/"; //


            // Headers  | 

            // Query    | limit offset 
            addQueryParam("limit",limit);
            addQueryParam("offset",offset);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            PaginatedLocationAreaSummaryList obj(output_string);


            Response<PaginatedLocationAreaSummaryList> response(obj, httpCode);
            return response;
        }

        Response<
            LocationAreaDetail
        >
        LocationApi::
        locationAreaRetrieve(
            
            int id
            
        )
        {
            std::string url = basepath + "/api/v2/location-area/{id}/"; //id 


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




            LocationAreaDetail obj(output_string);


            Response<LocationAreaDetail> response(obj, httpCode);
            return response;
        }

        Response<
            PaginatedLocationSummaryList
        >
        LocationApi::
        locationList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
        )
        {
            std::string url = basepath + "/api/v2/location/"; //


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




            PaginatedLocationSummaryList obj(output_string);


            Response<PaginatedLocationSummaryList> response(obj, httpCode);
            return response;
        }

        Response<
            LocationDetail
        >
        LocationApi::
        locationRetrieve(
            
            std::string id
            
        )
        {
            std::string url = basepath + "/api/v2/location/{id}/"; //id 


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




            LocationDetail obj(output_string);


            Response<LocationDetail> response(obj, httpCode);
            return response;
        }

        Response<
            PaginatedPalParkAreaSummaryList
        >
        LocationApi::
        palParkAreaList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
        )
        {
            std::string url = basepath + "/api/v2/pal-park-area/"; //


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




            PaginatedPalParkAreaSummaryList obj(output_string);


            Response<PaginatedPalParkAreaSummaryList> response(obj, httpCode);
            return response;
        }

        Response<
            PalParkAreaDetail
        >
        LocationApi::
        palParkAreaRetrieve(
            
            std::string id
            
        )
        {
            std::string url = basepath + "/api/v2/pal-park-area/{id}/"; //id 


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




            PalParkAreaDetail obj(output_string);


            Response<PalParkAreaDetail> response(obj, httpCode);
            return response;
        }

        Response<
            PaginatedRegionSummaryList
        >
        LocationApi::
        regionList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
        )
        {
            std::string url = basepath + "/api/v2/region/"; //


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




            PaginatedRegionSummaryList obj(output_string);


            Response<PaginatedRegionSummaryList> response(obj, httpCode);
            return response;
        }

        Response<
            RegionDetail
        >
        LocationApi::
        regionRetrieve(
            
            std::string id
            
        )
        {
            std::string url = basepath + "/api/v2/region/{id}/"; //id 


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




            RegionDetail obj(output_string);


            Response<RegionDetail> response(obj, httpCode);
            return response;
        }



