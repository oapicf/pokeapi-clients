

#include "PokemonDetail_past_types_inner.h"

using namespace Tiny;

PokemonDetail_past_types_inner::PokemonDetail_past_types_inner()
{
	generation = AbilityDetail_pokemon_inner_pokemon();
	types = std::list<PokemonDetail_types_inner>();
}

PokemonDetail_past_types_inner::PokemonDetail_past_types_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonDetail_past_types_inner::~PokemonDetail_past_types_inner()
{

}

void
PokemonDetail_past_types_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *generationKey = "generation";

    if(object.has_key(generationKey))
    {
        bourne::json value = object[generationKey];




        AbilityDetail_pokemon_inner_pokemon* obj = &generation;
		obj->fromJson(value.dump());

    }

    const char *typesKey = "types";

    if(object.has_key(typesKey))
    {
        bourne::json value = object[typesKey];


        std::list<PokemonDetail_types_inner> types_list;
        PokemonDetail_types_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            types_list.push_back(element);
        }
        types = types_list;


    }


}

bourne::json
PokemonDetail_past_types_inner::toJson()
{
    bourne::json object = bourne::json::object();






	object["generation"] = getGeneration().toJson();




    std::list<PokemonDetail_types_inner> types_list = getTypes();
    bourne::json types_arr = bourne::json::array();

    for(auto& var : types_list)
    {
        PokemonDetail_types_inner obj = var;
        types_arr.append(obj.toJson());
    }
    object["types"] = types_arr;




    return object;

}

AbilityDetail_pokemon_inner_pokemon
PokemonDetail_past_types_inner::getGeneration()
{
	return generation;
}

void
PokemonDetail_past_types_inner::setGeneration(AbilityDetail_pokemon_inner_pokemon generation)
{
	this->generation = generation;
}

std::list<PokemonDetail_types_inner>
PokemonDetail_past_types_inner::getTypes()
{
	return types;
}

void
PokemonDetail_past_types_inner::setTypes(std::list<PokemonDetail_types_inner> types)
{
	this->types = types;
}



