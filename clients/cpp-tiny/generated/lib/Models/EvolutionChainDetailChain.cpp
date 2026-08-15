

#include "EvolutionChainDetail_chain.h"

using namespace Tiny;

EvolutionChainDetail_chain::EvolutionChainDetail_chain()
{
	evolution_details = std::list<AnyType>();
	evolves_to = std::list<EvolutionChainDetail_chain_evolves_to_inner>();
	is_baby = bool(false);
	species = AbilityDetail_pokemon_inner_pokemon();
}

EvolutionChainDetail_chain::EvolutionChainDetail_chain(std::string jsonString)
{
	this->fromJson(jsonString);
}

EvolutionChainDetail_chain::~EvolutionChainDetail_chain()
{

}

void
EvolutionChainDetail_chain::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *evolution_detailsKey = "evolution_details";

    if(object.has_key(evolution_detailsKey))
    {
        bourne::json value = object[evolution_detailsKey];


        std::list<AnyType> evolution_details_list;
        AnyType element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            evolution_details_list.push_back(element);
        }
        evolution_details = evolution_details_list;


    }

    const char *evolves_toKey = "evolves_to";

    if(object.has_key(evolves_toKey))
    {
        bourne::json value = object[evolves_toKey];


        std::list<EvolutionChainDetail_chain_evolves_to_inner> evolves_to_list;
        EvolutionChainDetail_chain_evolves_to_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            evolves_to_list.push_back(element);
        }
        evolves_to = evolves_to_list;


    }

    const char *is_babyKey = "is_baby";

    if(object.has_key(is_babyKey))
    {
        bourne::json value = object[is_babyKey];



        jsonToValue(&is_baby, value, "bool");


    }

    const char *speciesKey = "species";

    if(object.has_key(speciesKey))
    {
        bourne::json value = object[speciesKey];




        AbilityDetail_pokemon_inner_pokemon* obj = &species;
		obj->fromJson(value.dump());

    }


}

bourne::json
EvolutionChainDetail_chain::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<AnyType> evolution_details_list = getEvolutionDetails();
    bourne::json evolution_details_arr = bourne::json::array();

    for(auto& var : evolution_details_list)
    {
        AnyType obj = var;
        evolution_details_arr.append(obj.toJson());
    }
    object["evolution_details"] = evolution_details_arr;






    std::list<EvolutionChainDetail_chain_evolves_to_inner> evolves_to_list = getEvolvesTo();
    bourne::json evolves_to_arr = bourne::json::array();

    for(auto& var : evolves_to_list)
    {
        EvolutionChainDetail_chain_evolves_to_inner obj = var;
        evolves_to_arr.append(obj.toJson());
    }
    object["evolves_to"] = evolves_to_arr;







    object["is_baby"] = isIsBaby();







	object["species"] = getSpecies().toJson();


    return object;

}

std::list<AnyType>
EvolutionChainDetail_chain::getEvolutionDetails()
{
	return evolution_details;
}

void
EvolutionChainDetail_chain::setEvolutionDetails(std::list <AnyType> evolution_details)
{
	this->evolution_details = evolution_details;
}

std::list<EvolutionChainDetail_chain_evolves_to_inner>
EvolutionChainDetail_chain::getEvolvesTo()
{
	return evolves_to;
}

void
EvolutionChainDetail_chain::setEvolvesTo(std::list <EvolutionChainDetail_chain_evolves_to_inner> evolves_to)
{
	this->evolves_to = evolves_to;
}

bool
EvolutionChainDetail_chain::isIsBaby()
{
	return is_baby;
}

void
EvolutionChainDetail_chain::setIsBaby(bool  is_baby)
{
	this->is_baby = is_baby;
}

AbilityDetail_pokemon_inner_pokemon
EvolutionChainDetail_chain::getSpecies()
{
	return species;
}

void
EvolutionChainDetail_chain::setSpecies(AbilityDetail_pokemon_inner_pokemon  species)
{
	this->species = species;
}



