

#include "GenderDetail.h"

using namespace Tiny;

GenderDetail::GenderDetail()
{
	id = int(0);
	name = std::string();
	pokemon_species_details = std::list<GenderPokemonSpecies>();
	required_for_evolution = std::list<PokemonSpeciesSummary>();
}

GenderDetail::GenderDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

GenderDetail::~GenderDetail()
{

}

void
GenderDetail::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "int");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *pokemon_species_detailsKey = "pokemon_species_details";

    if(object.has_key(pokemon_species_detailsKey))
    {
        bourne::json value = object[pokemon_species_detailsKey];


        std::list<GenderPokemonSpecies> pokemon_species_details_list;
        GenderPokemonSpecies element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            pokemon_species_details_list.push_back(element);
        }
        pokemon_species_details = pokemon_species_details_list;


    }

    const char *required_for_evolutionKey = "required_for_evolution";

    if(object.has_key(required_for_evolutionKey))
    {
        bourne::json value = object[required_for_evolutionKey];


        std::list<PokemonSpeciesSummary> required_for_evolution_list;
        PokemonSpeciesSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            required_for_evolution_list.push_back(element);
        }
        required_for_evolution = required_for_evolution_list;


    }


}

bourne::json
GenderDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();





    std::list<GenderPokemonSpecies> pokemon_species_details_list = getPokemonSpeciesDetails();
    bourne::json pokemon_species_details_arr = bourne::json::array();

    for(auto& var : pokemon_species_details_list)
    {
        GenderPokemonSpecies obj = var;
        pokemon_species_details_arr.append(obj.toJson());
    }
    object["pokemon_species_details"] = pokemon_species_details_arr;






    std::list<PokemonSpeciesSummary> required_for_evolution_list = getRequiredForEvolution();
    bourne::json required_for_evolution_arr = bourne::json::array();

    for(auto& var : required_for_evolution_list)
    {
        PokemonSpeciesSummary obj = var;
        required_for_evolution_arr.append(obj.toJson());
    }
    object["required_for_evolution"] = required_for_evolution_arr;




    return object;

}

int
GenderDetail::getId()
{
	return id;
}

void
GenderDetail::setId(int id)
{
	this->id = id;
}

std::string
GenderDetail::getName()
{
	return name;
}

void
GenderDetail::setName(std::string name)
{
	this->name = name;
}

std::list<GenderPokemonSpecies>
GenderDetail::getPokemonSpeciesDetails()
{
	return pokemon_species_details;
}

void
GenderDetail::setPokemonSpeciesDetails(std::list<GenderPokemonSpecies> pokemon_species_details)
{
	this->pokemon_species_details = pokemon_species_details;
}

std::list<PokemonSpeciesSummary>
GenderDetail::getRequiredForEvolution()
{
	return required_for_evolution;
}

void
GenderDetail::setRequiredForEvolution(std::list<PokemonSpeciesSummary> required_for_evolution)
{
	this->required_for_evolution = required_for_evolution;
}



