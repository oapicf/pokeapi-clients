

#include "PokemonPastAbility.h"

using namespace Tiny;

PokemonPastAbility::PokemonPastAbility()
{
	abilities = std::list<PokemonAbilityPast>();
	generation = null;
}

PokemonPastAbility::PokemonPastAbility(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonPastAbility::~PokemonPastAbility()
{

}

void
PokemonPastAbility::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *abilitiesKey = "abilities";

    if(object.has_key(abilitiesKey))
    {
        bourne::json value = object[abilitiesKey];


        std::list<PokemonAbilityPast> abilities_list;
        PokemonAbilityPast element;
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




        GenerationSummary* obj = &generation;
		obj->fromJson(value.dump());

    }


}

bourne::json
PokemonPastAbility::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<PokemonAbilityPast> abilities_list = getAbilities();
    bourne::json abilities_arr = bourne::json::array();

    for(auto& var : abilities_list)
    {
        PokemonAbilityPast obj = var;
        abilities_arr.append(obj.toJson());
    }
    object["abilities"] = abilities_arr;








	object["generation"] = getGeneration().toJson();


    return object;

}

std::list<PokemonAbilityPast>
PokemonPastAbility::getAbilities()
{
	return abilities;
}

void
PokemonPastAbility::setAbilities(std::list<PokemonAbilityPast> abilities)
{
	this->abilities = abilities;
}

GenerationSummary
PokemonPastAbility::getGeneration()
{
	return generation;
}

void
PokemonPastAbility::setGeneration(GenerationSummary generation)
{
	this->generation = generation;
}



