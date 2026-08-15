#include "MovesApi.h"

using namespace Tiny;



        Response<
            PaginatedMoveMetaAilmentSummaryList
        >
        MovesApi::
        moveAilmentList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
        )
        {
            std::string url = basepath + "/api/v2/move-ailment/"; //


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




            PaginatedMoveMetaAilmentSummaryList obj(output_string);


            Response<PaginatedMoveMetaAilmentSummaryList> response(obj, httpCode);
            return response;
        }

        Response<
            MoveMetaAilmentDetail
        >
        MovesApi::
        moveAilmentRetrieve(
            
            std::string id
            
        )
        {
            std::string url = basepath + "/api/v2/move-ailment/{id}/"; //id 


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




            MoveMetaAilmentDetail obj(output_string);


            Response<MoveMetaAilmentDetail> response(obj, httpCode);
            return response;
        }

        Response<
            PaginatedMoveBattleStyleSummaryList
        >
        MovesApi::
        moveBattleStyleList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
        )
        {
            std::string url = basepath + "/api/v2/move-battle-style/"; //


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




            PaginatedMoveBattleStyleSummaryList obj(output_string);


            Response<PaginatedMoveBattleStyleSummaryList> response(obj, httpCode);
            return response;
        }

        Response<
            MoveBattleStyleDetail
        >
        MovesApi::
        moveBattleStyleRetrieve(
            
            std::string id
            
        )
        {
            std::string url = basepath + "/api/v2/move-battle-style/{id}/"; //id 


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




            MoveBattleStyleDetail obj(output_string);


            Response<MoveBattleStyleDetail> response(obj, httpCode);
            return response;
        }

        Response<
            PaginatedMoveMetaCategorySummaryList
        >
        MovesApi::
        moveCategoryList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
        )
        {
            std::string url = basepath + "/api/v2/move-category/"; //


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




            PaginatedMoveMetaCategorySummaryList obj(output_string);


            Response<PaginatedMoveMetaCategorySummaryList> response(obj, httpCode);
            return response;
        }

        Response<
            MoveMetaCategoryDetail
        >
        MovesApi::
        moveCategoryRetrieve(
            
            std::string id
            
        )
        {
            std::string url = basepath + "/api/v2/move-category/{id}/"; //id 


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




            MoveMetaCategoryDetail obj(output_string);


            Response<MoveMetaCategoryDetail> response(obj, httpCode);
            return response;
        }

        Response<
            PaginatedMoveLearnMethodSummaryList
        >
        MovesApi::
        moveLearnMethodList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
        )
        {
            std::string url = basepath + "/api/v2/move-learn-method/"; //


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




            PaginatedMoveLearnMethodSummaryList obj(output_string);


            Response<PaginatedMoveLearnMethodSummaryList> response(obj, httpCode);
            return response;
        }

        Response<
            MoveLearnMethodDetail
        >
        MovesApi::
        moveLearnMethodRetrieve(
            
            std::string id
            
        )
        {
            std::string url = basepath + "/api/v2/move-learn-method/{id}/"; //id 


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




            MoveLearnMethodDetail obj(output_string);


            Response<MoveLearnMethodDetail> response(obj, httpCode);
            return response;
        }

        Response<
            PaginatedMoveSummaryList
        >
        MovesApi::
        moveList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
        )
        {
            std::string url = basepath + "/api/v2/move/"; //


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




            PaginatedMoveSummaryList obj(output_string);


            Response<PaginatedMoveSummaryList> response(obj, httpCode);
            return response;
        }

        Response<
            MoveDetail
        >
        MovesApi::
        moveRetrieve(
            
            std::string id
            
        )
        {
            std::string url = basepath + "/api/v2/move/{id}/"; //id 


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




            MoveDetail obj(output_string);


            Response<MoveDetail> response(obj, httpCode);
            return response;
        }

        Response<
            PaginatedMoveTargetSummaryList
        >
        MovesApi::
        moveTargetList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
        )
        {
            std::string url = basepath + "/api/v2/move-target/"; //


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




            PaginatedMoveTargetSummaryList obj(output_string);


            Response<PaginatedMoveTargetSummaryList> response(obj, httpCode);
            return response;
        }

        Response<
            MoveTargetDetail
        >
        MovesApi::
        moveTargetRetrieve(
            
            std::string id
            
        )
        {
            std::string url = basepath + "/api/v2/move-target/{id}/"; //id 


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




            MoveTargetDetail obj(output_string);


            Response<MoveTargetDetail> response(obj, httpCode);
            return response;
        }



