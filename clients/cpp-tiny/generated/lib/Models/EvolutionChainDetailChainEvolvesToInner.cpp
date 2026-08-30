

#include "EvolutionChainDetail_chain_evolves_to_inner.h"

using namespace Tiny;

EvolutionChainDetail_chain_evolves_to_inner::EvolutionChainDetail_chain_evolves_to_inner()
{
	evolution_details = std::list<EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner>();
	is_baby = bool(false);
	species = AbilityDetail_pokemon_inner_pokemon();
}

EvolutionChainDetail_chain_evolves_to_inner::EvolutionChainDetail_chain_evolves_to_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

EvolutionChainDetail_chain_evolves_to_inner::~EvolutionChainDetail_chain_evolves_to_inner()
{

}

void
EvolutionChainDetail_chain_evolves_to_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *evolution_detailsKey = "evolution_details";

    if(object.has_key(evolution_detailsKey))
    {
        bourne::json value = object[evolution_detailsKey];


        std::list<EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner> evolution_details_list;
        EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            evolution_details_list.push_back(element);
        }
        evolution_details = evolution_details_list;


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
EvolutionChainDetail_chain_evolves_to_inner::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner> evolution_details_list = getEvolutionDetails();
    bourne::json evolution_details_arr = bourne::json::array();

    for(auto& var : evolution_details_list)
    {
        EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner obj = var;
        evolution_details_arr.append(obj.toJson());
    }
    object["evolution_details"] = evolution_details_arr;







    object["is_baby"] = isIsBaby();







	object["species"] = getSpecies().toJson();


    return object;

}

std::list<EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner>
EvolutionChainDetail_chain_evolves_to_inner::getEvolutionDetails()
{
	return evolution_details;
}

void
EvolutionChainDetail_chain_evolves_to_inner::setEvolutionDetails(std::list<EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner> evolution_details)
{
	this->evolution_details = evolution_details;
}

bool
EvolutionChainDetail_chain_evolves_to_inner::isIsBaby()
{
	return is_baby;
}

void
EvolutionChainDetail_chain_evolves_to_inner::setIsBaby(bool is_baby)
{
	this->is_baby = is_baby;
}

AbilityDetail_pokemon_inner_pokemon
EvolutionChainDetail_chain_evolves_to_inner::getSpecies()
{
	return species;
}

void
EvolutionChainDetail_chain_evolves_to_inner::setSpecies(AbilityDetail_pokemon_inner_pokemon species)
{
	this->species = species;
}



