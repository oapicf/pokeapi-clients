

#include "EggGroupDetail.h"

using namespace Tiny;

EggGroupDetail::EggGroupDetail()
{
	id = int(0);
	name = std::string();
	names = std::list<EggGroupName>();
	pokemon_species = std::list<EggGroupDetail_pokemon_species_inner>();
}

EggGroupDetail::EggGroupDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

EggGroupDetail::~EggGroupDetail()
{

}

void
EggGroupDetail::fromJson(std::string jsonObj)
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


        std::list<EggGroupName> names_list;
        EggGroupName element;
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


        std::list<EggGroupDetail_pokemon_species_inner> pokemon_species_list;
        EggGroupDetail_pokemon_species_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            pokemon_species_list.push_back(element);
        }
        pokemon_species = pokemon_species_list;


    }


}

bourne::json
EggGroupDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();





    std::list<EggGroupName> names_list = getNames();
    bourne::json names_arr = bourne::json::array();

    for(auto& var : names_list)
    {
        EggGroupName obj = var;
        names_arr.append(obj.toJson());
    }
    object["names"] = names_arr;






    std::list<EggGroupDetail_pokemon_species_inner> pokemon_species_list = getPokemonSpecies();
    bourne::json pokemon_species_arr = bourne::json::array();

    for(auto& var : pokemon_species_list)
    {
        EggGroupDetail_pokemon_species_inner obj = var;
        pokemon_species_arr.append(obj.toJson());
    }
    object["pokemon_species"] = pokemon_species_arr;




    return object;

}

int
EggGroupDetail::getId()
{
	return id;
}

void
EggGroupDetail::setId(int id)
{
	this->id = id;
}

std::string
EggGroupDetail::getName()
{
	return name;
}

void
EggGroupDetail::setName(std::string name)
{
	this->name = name;
}

std::list<EggGroupName>
EggGroupDetail::getNames()
{
	return names;
}

void
EggGroupDetail::setNames(std::list<EggGroupName> names)
{
	this->names = names;
}

std::list<EggGroupDetail_pokemon_species_inner>
EggGroupDetail::getPokemonSpecies()
{
	return pokemon_species;
}

void
EggGroupDetail::setPokemonSpecies(std::list<EggGroupDetail_pokemon_species_inner> pokemon_species)
{
	this->pokemon_species = pokemon_species;
}



