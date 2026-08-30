

#include "PokemonShapeDetail.h"

using namespace Tiny;

PokemonShapeDetail::PokemonShapeDetail()
{
	id = int(0);
	name = std::string();
	awesome_names = std::list<PokemonShapeDetail_awesome_names_inner>();
	names = std::list<PokemonShapeDetail_names_inner>();
	pokemon_species = std::list<PokemonSpeciesSummary>();
}

PokemonShapeDetail::PokemonShapeDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonShapeDetail::~PokemonShapeDetail()
{

}

void
PokemonShapeDetail::fromJson(std::string jsonObj)
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

    const char *awesome_namesKey = "awesome_names";

    if(object.has_key(awesome_namesKey))
    {
        bourne::json value = object[awesome_namesKey];


        std::list<PokemonShapeDetail_awesome_names_inner> awesome_names_list;
        PokemonShapeDetail_awesome_names_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            awesome_names_list.push_back(element);
        }
        awesome_names = awesome_names_list;


    }

    const char *namesKey = "names";

    if(object.has_key(namesKey))
    {
        bourne::json value = object[namesKey];


        std::list<PokemonShapeDetail_names_inner> names_list;
        PokemonShapeDetail_names_inner element;
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
PokemonShapeDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();





    std::list<PokemonShapeDetail_awesome_names_inner> awesome_names_list = getAwesomeNames();
    bourne::json awesome_names_arr = bourne::json::array();

    for(auto& var : awesome_names_list)
    {
        PokemonShapeDetail_awesome_names_inner obj = var;
        awesome_names_arr.append(obj.toJson());
    }
    object["awesome_names"] = awesome_names_arr;






    std::list<PokemonShapeDetail_names_inner> names_list = getNames();
    bourne::json names_arr = bourne::json::array();

    for(auto& var : names_list)
    {
        PokemonShapeDetail_names_inner obj = var;
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
PokemonShapeDetail::getId()
{
	return id;
}

void
PokemonShapeDetail::setId(int id)
{
	this->id = id;
}

std::string
PokemonShapeDetail::getName()
{
	return name;
}

void
PokemonShapeDetail::setName(std::string name)
{
	this->name = name;
}

std::list<PokemonShapeDetail_awesome_names_inner>
PokemonShapeDetail::getAwesomeNames()
{
	return awesome_names;
}

void
PokemonShapeDetail::setAwesomeNames(std::list<PokemonShapeDetail_awesome_names_inner> awesome_names)
{
	this->awesome_names = awesome_names;
}

std::list<PokemonShapeDetail_names_inner>
PokemonShapeDetail::getNames()
{
	return names;
}

void
PokemonShapeDetail::setNames(std::list<PokemonShapeDetail_names_inner> names)
{
	this->names = names;
}

std::list<PokemonSpeciesSummary>
PokemonShapeDetail::getPokemonSpecies()
{
	return pokemon_species;
}

void
PokemonShapeDetail::setPokemonSpecies(std::list<PokemonSpeciesSummary> pokemon_species)
{
	this->pokemon_species = pokemon_species;
}



