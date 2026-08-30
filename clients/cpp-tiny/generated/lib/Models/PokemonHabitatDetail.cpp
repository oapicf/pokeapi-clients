

#include "PokemonHabitatDetail.h"

using namespace Tiny;

PokemonHabitatDetail::PokemonHabitatDetail()
{
	id = int(0);
	name = std::string();
	names = std::list<PokemonHabitatName>();
	pokemon_species = std::list<PokemonSpeciesSummary>();
}

PokemonHabitatDetail::PokemonHabitatDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonHabitatDetail::~PokemonHabitatDetail()
{

}

void
PokemonHabitatDetail::fromJson(std::string jsonObj)
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

    const char *namesKey = "names";

    if(object.has_key(namesKey))
    {
        bourne::json value = object[namesKey];


        std::list<PokemonHabitatName> names_list;
        PokemonHabitatName element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            names_list.push_back(element);
        }
        names = names_list;


    }

    const char *pokemon_speciesKey = "pokemon_species";

    if(object.has_key(pokemon_speciesKey))
    {
        bourne::json value = object[pokemon_speciesKey];


        std::list<PokemonSpeciesSummary> pokemon_species_list;
        PokemonSpeciesSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            pokemon_species_list.push_back(element);
        }
        pokemon_species = pokemon_species_list;


    }


}

bourne::json
PokemonHabitatDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();





    std::list<PokemonHabitatName> names_list = getNames();
    bourne::json names_arr = bourne::json::array();

    for(auto& var : names_list)
    {
        PokemonHabitatName obj = var;
        names_arr.append(obj.toJson());
    }
    object["names"] = names_arr;






    std::list<PokemonSpeciesSummary> pokemon_species_list = getPokemonSpecies();
    bourne::json pokemon_species_arr = bourne::json::array();

    for(auto& var : pokemon_species_list)
    {
        PokemonSpeciesSummary obj = var;
        pokemon_species_arr.append(obj.toJson());
    }
    object["pokemon_species"] = pokemon_species_arr;




    return object;

}

int
PokemonHabitatDetail::getId()
{
	return id;
}

void
PokemonHabitatDetail::setId(int id)
{
	this->id = id;
}

std::string
PokemonHabitatDetail::getName()
{
	return name;
}

void
PokemonHabitatDetail::setName(std::string name)
{
	this->name = name;
}

std::list<PokemonHabitatName>
PokemonHabitatDetail::getNames()
{
	return names;
}

void
PokemonHabitatDetail::setNames(std::list<PokemonHabitatName> names)
{
	this->names = names;
}

std::list<PokemonSpeciesSummary>
PokemonHabitatDetail::getPokemonSpecies()
{
	return pokemon_species;
}

void
PokemonHabitatDetail::setPokemonSpecies(std::list<PokemonSpeciesSummary> pokemon_species)
{
	this->pokemon_species = pokemon_species;
}



