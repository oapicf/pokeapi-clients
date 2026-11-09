

#include "EvolutionChainLink.h"

using namespace Tiny;

EvolutionChainLink::EvolutionChainLink()
{
	is_baby = bool(false);
	species = null;
	evolution_details = std::list<PokemonEvolution>();
	evolves_to = std::list<EvolutionChainLink>();
}

EvolutionChainLink::EvolutionChainLink(std::string jsonString)
{
	this->fromJson(jsonString);
}

EvolutionChainLink::~EvolutionChainLink()
{

}

void
EvolutionChainLink::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

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




        PokemonSpeciesSummary* obj = &species;
		obj->fromJson(value.dump());

    }

    const char *evolution_detailsKey = "evolution_details";

    if(object.has_key(evolution_detailsKey))
    {
        bourne::json value = object[evolution_detailsKey];


        std::list<PokemonEvolution> evolution_details_list;
        PokemonEvolution element;
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


        std::list<EvolutionChainLink> evolves_to_list;
        EvolutionChainLink element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            evolves_to_list.push_back(element);
        }
        evolves_to = evolves_to_list;


    }


}

bourne::json
EvolutionChainLink::toJson()
{
    bourne::json object = bourne::json::object();





    object["is_baby"] = isIsBaby();







	object["species"] = getSpecies().toJson();




    std::list<PokemonEvolution> evolution_details_list = getEvolutionDetails();
    bourne::json evolution_details_arr = bourne::json::array();

    for(auto& var : evolution_details_list)
    {
        PokemonEvolution obj = var;
        evolution_details_arr.append(obj.toJson());
    }
    object["evolution_details"] = evolution_details_arr;






    std::list<EvolutionChainLink> evolves_to_list = getEvolvesTo();
    bourne::json evolves_to_arr = bourne::json::array();

    for(auto& var : evolves_to_list)
    {
        EvolutionChainLink obj = var;
        evolves_to_arr.append(obj.toJson());
    }
    object["evolves_to"] = evolves_to_arr;




    return object;

}

bool
EvolutionChainLink::isIsBaby()
{
	return is_baby;
}

void
EvolutionChainLink::setIsBaby(bool is_baby)
{
	this->is_baby = is_baby;
}

PokemonSpeciesSummary
EvolutionChainLink::getSpecies()
{
	return species;
}

void
EvolutionChainLink::setSpecies(PokemonSpeciesSummary species)
{
	this->species = species;
}

std::list<PokemonEvolution>
EvolutionChainLink::getEvolutionDetails()
{
	return evolution_details;
}

void
EvolutionChainLink::setEvolutionDetails(std::list<PokemonEvolution> evolution_details)
{
	this->evolution_details = evolution_details;
}

std::list<EvolutionChainLink>
EvolutionChainLink::getEvolvesTo()
{
	return evolves_to;
}

void
EvolutionChainLink::setEvolvesTo(std::list<EvolutionChainLink> evolves_to)
{
	this->evolves_to = evolves_to;
}



