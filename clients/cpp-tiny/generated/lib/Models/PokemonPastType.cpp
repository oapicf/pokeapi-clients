

#include "PokemonPastType.h"

using namespace Tiny;

PokemonPastType::PokemonPastType()
{
	generation = null;
	types = std::list<PokemonType>();
}

PokemonPastType::PokemonPastType(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonPastType::~PokemonPastType()
{

}

void
PokemonPastType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *generationKey = "generation";

    if(object.has_key(generationKey))
    {
        bourne::json value = object[generationKey];




        GenerationSummary* obj = &generation;
		obj->fromJson(value.dump());

    }

    const char *typesKey = "types";

    if(object.has_key(typesKey))
    {
        bourne::json value = object[typesKey];


        std::list<PokemonType> types_list;
        PokemonType element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            types_list.push_back(element);
        }
        types = types_list;


    }


}

bourne::json
PokemonPastType::toJson()
{
    bourne::json object = bourne::json::object();






	object["generation"] = getGeneration().toJson();




    std::list<PokemonType> types_list = getTypes();
    bourne::json types_arr = bourne::json::array();

    for(auto& var : types_list)
    {
        PokemonType obj = var;
        types_arr.append(obj.toJson());
    }
    object["types"] = types_arr;




    return object;

}

GenerationSummary
PokemonPastType::getGeneration()
{
	return generation;
}

void
PokemonPastType::setGeneration(GenerationSummary generation)
{
	this->generation = generation;
}

std::list<PokemonType>
PokemonPastType::getTypes()
{
	return types;
}

void
PokemonPastType::setTypes(std::list<PokemonType> types)
{
	this->types = types;
}



