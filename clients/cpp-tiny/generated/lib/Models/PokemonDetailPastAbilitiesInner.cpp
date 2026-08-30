

#include "PokemonDetail_past_abilities_inner.h"

using namespace Tiny;

PokemonDetail_past_abilities_inner::PokemonDetail_past_abilities_inner()
{
	abilities = std::list<PokemonDetail_abilities_inner>();
	generation = AbilityDetail_pokemon_inner_pokemon();
}

PokemonDetail_past_abilities_inner::PokemonDetail_past_abilities_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonDetail_past_abilities_inner::~PokemonDetail_past_abilities_inner()
{

}

void
PokemonDetail_past_abilities_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *abilitiesKey = "abilities";

    if(object.has_key(abilitiesKey))
    {
        bourne::json value = object[abilitiesKey];


        std::list<PokemonDetail_abilities_inner> abilities_list;
        PokemonDetail_abilities_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            abilities_list.push_back(element);
        }
        abilities = abilities_list;


    }

    const char *generationKey = "generation";

    if(object.has_key(generationKey))
    {
        bourne::json value = object[generationKey];




        AbilityDetail_pokemon_inner_pokemon* obj = &generation;
		obj->fromJson(value.dump());

    }


}

bourne::json
PokemonDetail_past_abilities_inner::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<PokemonDetail_abilities_inner> abilities_list = getAbilities();
    bourne::json abilities_arr = bourne::json::array();

    for(auto& var : abilities_list)
    {
        PokemonDetail_abilities_inner obj = var;
        abilities_arr.append(obj.toJson());
    }
    object["abilities"] = abilities_arr;








	object["generation"] = getGeneration().toJson();


    return object;

}

std::list<PokemonDetail_abilities_inner>
PokemonDetail_past_abilities_inner::getAbilities()
{
	return abilities;
}

void
PokemonDetail_past_abilities_inner::setAbilities(std::list<PokemonDetail_abilities_inner> abilities)
{
	this->abilities = abilities;
}

AbilityDetail_pokemon_inner_pokemon
PokemonDetail_past_abilities_inner::getGeneration()
{
	return generation;
}

void
PokemonDetail_past_abilities_inner::setGeneration(AbilityDetail_pokemon_inner_pokemon generation)
{
	this->generation = generation;
}



