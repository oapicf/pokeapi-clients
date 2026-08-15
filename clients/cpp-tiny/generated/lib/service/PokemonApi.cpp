#include "PokemonApi.h"

using namespace Tiny;



        Response<
            PaginatedAbilitySummaryList
        >
        PokemonApi::
        abilityList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
        )
        {
            std::string url = basepath + "/api/v2/ability/"; //


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




            PaginatedAbilitySummaryList obj(output_string);


            Response<PaginatedAbilitySummaryList> response(obj, httpCode);
            return response;
        }

        Response<
            AbilityDetail
        >
        PokemonApi::
        abilityRetrieve(
            
            std::string id
            
        )
        {
            std::string url = basepath + "/api/v2/ability/{id}/"; //id 


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




            AbilityDetail obj(output_string);


            Response<AbilityDetail> response(obj, httpCode);
            return response;
        }

        Response<
            PaginatedCharacteristicSummaryList
        >
        PokemonApi::
        characteristicList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
        )
        {
            std::string url = basepath + "/api/v2/characteristic/"; //


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




            PaginatedCharacteristicSummaryList obj(output_string);


            Response<PaginatedCharacteristicSummaryList> response(obj, httpCode);
            return response;
        }

        Response<
            CharacteristicDetail
        >
        PokemonApi::
        characteristicRetrieve(
            
            std::string id
            
        )
        {
            std::string url = basepath + "/api/v2/characteristic/{id}/"; //id 


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




            CharacteristicDetail obj(output_string);


            Response<CharacteristicDetail> response(obj, httpCode);
            return response;
        }

        Response<
            PaginatedEggGroupSummaryList
        >
        PokemonApi::
        eggGroupList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
        )
        {
            std::string url = basepath + "/api/v2/egg-group/"; //


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




            PaginatedEggGroupSummaryList obj(output_string);


            Response<PaginatedEggGroupSummaryList> response(obj, httpCode);
            return response;
        }

        Response<
            EggGroupDetail
        >
        PokemonApi::
        eggGroupRetrieve(
            
            std::string id
            
        )
        {
            std::string url = basepath + "/api/v2/egg-group/{id}/"; //id 


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




            EggGroupDetail obj(output_string);


            Response<EggGroupDetail> response(obj, httpCode);
            return response;
        }

        Response<
            PaginatedGenderSummaryList
        >
        PokemonApi::
        genderList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
        )
        {
            std::string url = basepath + "/api/v2/gender/"; //


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




            PaginatedGenderSummaryList obj(output_string);


            Response<PaginatedGenderSummaryList> response(obj, httpCode);
            return response;
        }

        Response<
            GenderDetail
        >
        PokemonApi::
        genderRetrieve(
            
            std::string id
            
        )
        {
            std::string url = basepath + "/api/v2/gender/{id}/"; //id 


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




            GenderDetail obj(output_string);


            Response<GenderDetail> response(obj, httpCode);
            return response;
        }

        Response<
            PaginatedGrowthRateSummaryList
        >
        PokemonApi::
        growthRateList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
        )
        {
            std::string url = basepath + "/api/v2/growth-rate/"; //


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




            PaginatedGrowthRateSummaryList obj(output_string);


            Response<PaginatedGrowthRateSummaryList> response(obj, httpCode);
            return response;
        }

        Response<
            GrowthRateDetail
        >
        PokemonApi::
        growthRateRetrieve(
            
            std::string id
            
        )
        {
            std::string url = basepath + "/api/v2/growth-rate/{id}/"; //id 


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




            GrowthRateDetail obj(output_string);


            Response<GrowthRateDetail> response(obj, httpCode);
            return response;
        }

        Response<
            PaginatedMoveDamageClassSummaryList
        >
        PokemonApi::
        moveDamageClassList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
        )
        {
            std::string url = basepath + "/api/v2/move-damage-class/"; //


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




            PaginatedMoveDamageClassSummaryList obj(output_string);


            Response<PaginatedMoveDamageClassSummaryList> response(obj, httpCode);
            return response;
        }

        Response<
            MoveDamageClassDetail
        >
        PokemonApi::
        moveDamageClassRetrieve(
            
            std::string id
            
        )
        {
            std::string url = basepath + "/api/v2/move-damage-class/{id}/"; //id 


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




            MoveDamageClassDetail obj(output_string);


            Response<MoveDamageClassDetail> response(obj, httpCode);
            return response;
        }

        Response<
            PaginatedNatureSummaryList
        >
        PokemonApi::
        natureList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
        )
        {
            std::string url = basepath + "/api/v2/nature/"; //


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




            PaginatedNatureSummaryList obj(output_string);


            Response<PaginatedNatureSummaryList> response(obj, httpCode);
            return response;
        }

        Response<
            NatureDetail
        >
        PokemonApi::
        natureRetrieve(
            
            std::string id
            
        )
        {
            std::string url = basepath + "/api/v2/nature/{id}/"; //id 


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




            NatureDetail obj(output_string);


            Response<NatureDetail> response(obj, httpCode);
            return response;
        }

        Response<
            PaginatedPokeathlonStatSummaryList
        >
        PokemonApi::
        pokeathlonStatList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
        )
        {
            std::string url = basepath + "/api/v2/pokeathlon-stat/"; //


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




            PaginatedPokeathlonStatSummaryList obj(output_string);


            Response<PaginatedPokeathlonStatSummaryList> response(obj, httpCode);
            return response;
        }

        Response<
            PokeathlonStatDetail
        >
        PokemonApi::
        pokeathlonStatRetrieve(
            
            std::string id
            
        )
        {
            std::string url = basepath + "/api/v2/pokeathlon-stat/{id}/"; //id 


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




            PokeathlonStatDetail obj(output_string);


            Response<PokeathlonStatDetail> response(obj, httpCode);
            return response;
        }

        Response<
            PaginatedPokemonColorSummaryList
        >
        PokemonApi::
        pokemonColorList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
        )
        {
            std::string url = basepath + "/api/v2/pokemon-color/"; //


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




            PaginatedPokemonColorSummaryList obj(output_string);


            Response<PaginatedPokemonColorSummaryList> response(obj, httpCode);
            return response;
        }

        Response<
            PokemonColorDetail
        >
        PokemonApi::
        pokemonColorRetrieve(
            
            std::string id
            
        )
        {
            std::string url = basepath + "/api/v2/pokemon-color/{id}/"; //id 


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




            PokemonColorDetail obj(output_string);


            Response<PokemonColorDetail> response(obj, httpCode);
            return response;
        }

        Response<
            PaginatedPokemonFormSummaryList
        >
        PokemonApi::
        pokemonFormList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
        )
        {
            std::string url = basepath + "/api/v2/pokemon-form/"; //


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




            PaginatedPokemonFormSummaryList obj(output_string);


            Response<PaginatedPokemonFormSummaryList> response(obj, httpCode);
            return response;
        }

        Response<
            PokemonFormDetail
        >
        PokemonApi::
        pokemonFormRetrieve(
            
            std::string id
            
        )
        {
            std::string url = basepath + "/api/v2/pokemon-form/{id}/"; //id 


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




            PokemonFormDetail obj(output_string);


            Response<PokemonFormDetail> response(obj, httpCode);
            return response;
        }

        Response<
            PaginatedPokemonHabitatSummaryList
        >
        PokemonApi::
        pokemonHabitatList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
        )
        {
            std::string url = basepath + "/api/v2/pokemon-habitat/"; //


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




            PaginatedPokemonHabitatSummaryList obj(output_string);


            Response<PaginatedPokemonHabitatSummaryList> response(obj, httpCode);
            return response;
        }

        Response<
            PokemonHabitatDetail
        >
        PokemonApi::
        pokemonHabitatRetrieve(
            
            std::string id
            
        )
        {
            std::string url = basepath + "/api/v2/pokemon-habitat/{id}/"; //id 


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




            PokemonHabitatDetail obj(output_string);


            Response<PokemonHabitatDetail> response(obj, httpCode);
            return response;
        }

        Response<
            PaginatedPokemonSummaryList
        >
        PokemonApi::
        pokemonList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
        )
        {
            std::string url = basepath + "/api/v2/pokemon/"; //


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




            PaginatedPokemonSummaryList obj(output_string);


            Response<PaginatedPokemonSummaryList> response(obj, httpCode);
            return response;
        }

        Response<
            PokemonDetail
        >
        PokemonApi::
        pokemonRetrieve(
            
            std::string id
            
        )
        {
            std::string url = basepath + "/api/v2/pokemon/{id}/"; //id 


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




            PokemonDetail obj(output_string);


            Response<PokemonDetail> response(obj, httpCode);
            return response;
        }

        Response<
            PaginatedPokemonShapeSummaryList
        >
        PokemonApi::
        pokemonShapeList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
        )
        {
            std::string url = basepath + "/api/v2/pokemon-shape/"; //


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




            PaginatedPokemonShapeSummaryList obj(output_string);


            Response<PaginatedPokemonShapeSummaryList> response(obj, httpCode);
            return response;
        }

        Response<
            PokemonShapeDetail
        >
        PokemonApi::
        pokemonShapeRetrieve(
            
            std::string id
            
        )
        {
            std::string url = basepath + "/api/v2/pokemon-shape/{id}/"; //id 


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




            PokemonShapeDetail obj(output_string);


            Response<PokemonShapeDetail> response(obj, httpCode);
            return response;
        }

        Response<
            PaginatedPokemonSpeciesSummaryList
        >
        PokemonApi::
        pokemonSpeciesList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
        )
        {
            std::string url = basepath + "/api/v2/pokemon-species/"; //


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




            PaginatedPokemonSpeciesSummaryList obj(output_string);


            Response<PaginatedPokemonSpeciesSummaryList> response(obj, httpCode);
            return response;
        }

        Response<
            PokemonSpeciesDetail
        >
        PokemonApi::
        pokemonSpeciesRetrieve(
            
            std::string id
            
        )
        {
            std::string url = basepath + "/api/v2/pokemon-species/{id}/"; //id 


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




            PokemonSpeciesDetail obj(output_string);


            Response<PokemonSpeciesDetail> response(obj, httpCode);
            return response;
        }

        Response<
            PaginatedStatSummaryList
        >
        PokemonApi::
        statList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
        )
        {
            std::string url = basepath + "/api/v2/stat/"; //


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




            PaginatedStatSummaryList obj(output_string);


            Response<PaginatedStatSummaryList> response(obj, httpCode);
            return response;
        }

        Response<
            StatDetail
        >
        PokemonApi::
        statRetrieve(
            
            std::string id
            
        )
        {
            std::string url = basepath + "/api/v2/stat/{id}/"; //id 


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




            StatDetail obj(output_string);


            Response<StatDetail> response(obj, httpCode);
            return response;
        }

        Response<
            PaginatedTypeSummaryList
        >
        PokemonApi::
        typeList(
            
            int limit
            , 
            
            int offset
            , 
            
            std::string q
            
        )
        {
            std::string url = basepath + "/api/v2/type/"; //


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




            PaginatedTypeSummaryList obj(output_string);


            Response<PaginatedTypeSummaryList> response(obj, httpCode);
            return response;
        }

        Response<
            TypeDetail
        >
        PokemonApi::
        typeRetrieve(
            
            std::string id
            
        )
        {
            std::string url = basepath + "/api/v2/type/{id}/"; //id 


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




            TypeDetail obj(output_string);


            Response<TypeDetail> response(obj, httpCode);
            return response;
        }



