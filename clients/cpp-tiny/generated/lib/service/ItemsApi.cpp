#include "ItemsApi.h"

using namespace Tiny;



        Response<
            PaginatedItemAttributeSummaryList
        >
        ItemsApi::
        itemAttributeList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
        )
        {
            std::string url = basepath + "/api/v2/item-attribute/"; //


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




            PaginatedItemAttributeSummaryList obj(output_string);


            Response<PaginatedItemAttributeSummaryList> response(obj, httpCode);
            return response;
        }

        Response<
            ItemAttributeDetail
        >
        ItemsApi::
        itemAttributeRetrieve(
            
            std::string id
            
        )
        {
            std::string url = basepath + "/api/v2/item-attribute/{id}/"; //id 


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




            ItemAttributeDetail obj(output_string);


            Response<ItemAttributeDetail> response(obj, httpCode);
            return response;
        }

        Response<
            PaginatedItemCategorySummaryList
        >
        ItemsApi::
        itemCategoryList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
        )
        {
            std::string url = basepath + "/api/v2/item-category/"; //


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




            PaginatedItemCategorySummaryList obj(output_string);


            Response<PaginatedItemCategorySummaryList> response(obj, httpCode);
            return response;
        }

        Response<
            ItemCategoryDetail
        >
        ItemsApi::
        itemCategoryRetrieve(
            
            std::string id
            
        )
        {
            std::string url = basepath + "/api/v2/item-category/{id}/"; //id 


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




            ItemCategoryDetail obj(output_string);


            Response<ItemCategoryDetail> response(obj, httpCode);
            return response;
        }

        Response<
            PaginatedItemFlingEffectSummaryList
        >
        ItemsApi::
        itemFlingEffectList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
        )
        {
            std::string url = basepath + "/api/v2/item-fling-effect/"; //


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




            PaginatedItemFlingEffectSummaryList obj(output_string);


            Response<PaginatedItemFlingEffectSummaryList> response(obj, httpCode);
            return response;
        }

        Response<
            ItemFlingEffectDetail
        >
        ItemsApi::
        itemFlingEffectRetrieve(
            
            std::string id
            
        )
        {
            std::string url = basepath + "/api/v2/item-fling-effect/{id}/"; //id 


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




            ItemFlingEffectDetail obj(output_string);


            Response<ItemFlingEffectDetail> response(obj, httpCode);
            return response;
        }

        Response<
            PaginatedItemSummaryList
        >
        ItemsApi::
        itemList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
        )
        {
            std::string url = basepath + "/api/v2/item/"; //


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




            PaginatedItemSummaryList obj(output_string);


            Response<PaginatedItemSummaryList> response(obj, httpCode);
            return response;
        }

        Response<
            PaginatedItemPocketSummaryList
        >
        ItemsApi::
        itemPocketList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
        )
        {
            std::string url = basepath + "/api/v2/item-pocket/"; //


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




            PaginatedItemPocketSummaryList obj(output_string);


            Response<PaginatedItemPocketSummaryList> response(obj, httpCode);
            return response;
        }

        Response<
            ItemPocketDetail
        >
        ItemsApi::
        itemPocketRetrieve(
            
            std::string id
            
        )
        {
            std::string url = basepath + "/api/v2/item-pocket/{id}/"; //id 


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




            ItemPocketDetail obj(output_string);


            Response<ItemPocketDetail> response(obj, httpCode);
            return response;
        }

        Response<
            ItemDetail
        >
        ItemsApi::
        itemRetrieve(
            
            std::string id
            
        )
        {
            std::string url = basepath + "/api/v2/item/{id}/"; //id 


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




            ItemDetail obj(output_string);


            Response<ItemDetail> response(obj, httpCode);
            return response;
        }



