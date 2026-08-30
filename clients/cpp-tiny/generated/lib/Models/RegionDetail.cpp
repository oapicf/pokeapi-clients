

#include "RegionDetail.h"

using namespace Tiny;

RegionDetail::RegionDetail()
{
	id = int(0);
	name = std::string();
	locations = std::list<LocationSummary>();
	main_generation = null;
	names = std::list<RegionName>();
	pokedexes = std::list<PokedexSummary>();
	version_groups = std::list<AbilityDetail_pokemon_inner_pokemon>();
}

RegionDetail::RegionDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

RegionDetail::~RegionDetail()
{

}

void
RegionDetail::fromJson(std::string jsonObj)
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

    const char *locationsKey = "locations";

    if(object.has_key(locationsKey))
    {
        bourne::json value = object[locationsKey];


        std::list<LocationSummary> locations_list;
        LocationSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            locations_list.push_back(element);
        }
        locations = locations_list;


    }

    const char *main_generationKey = "main_generation";

    if(object.has_key(main_generationKey))
    {
        bourne::json value = object[main_generationKey];




        GenerationSummary* obj = &main_generation;
		obj->fromJson(value.dump());

    }

    const char *namesKey = "names";

    if(object.has_key(namesKey))
    {
        bourne::json value = object[namesKey];


        std::list<RegionName> names_list;
        RegionName element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            names_list.push_back(element);
        }
        names = names_list;


    }

    const char *pokedexesKey = "pokedexes";

    if(object.has_key(pokedexesKey))
    {
        bourne::json value = object[pokedexesKey];


        std::list<PokedexSummary> pokedexes_list;
        PokedexSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            pokedexes_list.push_back(element);
        }
        pokedexes = pokedexes_list;


    }

    const char *version_groupsKey = "version_groups";

    if(object.has_key(version_groupsKey))
    {
        bourne::json value = object[version_groupsKey];


        std::list<AbilityDetail_pokemon_inner_pokemon> version_groups_list;
        AbilityDetail_pokemon_inner_pokemon element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            version_groups_list.push_back(element);
        }
        version_groups = version_groups_list;


    }


}

bourne::json
RegionDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();





    std::list<LocationSummary> locations_list = getLocations();
    bourne::json locations_arr = bourne::json::array();

    for(auto& var : locations_list)
    {
        LocationSummary obj = var;
        locations_arr.append(obj.toJson());
    }
    object["locations"] = locations_arr;








	object["main_generation"] = getMainGeneration().toJson();




    std::list<RegionName> names_list = getNames();
    bourne::json names_arr = bourne::json::array();

    for(auto& var : names_list)
    {
        RegionName obj = var;
        names_arr.append(obj.toJson());
    }
    object["names"] = names_arr;






    std::list<PokedexSummary> pokedexes_list = getPokedexes();
    bourne::json pokedexes_arr = bourne::json::array();

    for(auto& var : pokedexes_list)
    {
        PokedexSummary obj = var;
        pokedexes_arr.append(obj.toJson());
    }
    object["pokedexes"] = pokedexes_arr;






    std::list<AbilityDetail_pokemon_inner_pokemon> version_groups_list = getVersionGroups();
    bourne::json version_groups_arr = bourne::json::array();

    for(auto& var : version_groups_list)
    {
        AbilityDetail_pokemon_inner_pokemon obj = var;
        version_groups_arr.append(obj.toJson());
    }
    object["version_groups"] = version_groups_arr;




    return object;

}

int
RegionDetail::getId()
{
	return id;
}

void
RegionDetail::setId(int id)
{
	this->id = id;
}

std::string
RegionDetail::getName()
{
	return name;
}

void
RegionDetail::setName(std::string name)
{
	this->name = name;
}

std::list<LocationSummary>
RegionDetail::getLocations()
{
	return locations;
}

void
RegionDetail::setLocations(std::list<LocationSummary> locations)
{
	this->locations = locations;
}

GenerationSummary
RegionDetail::getMainGeneration()
{
	return main_generation;
}

void
RegionDetail::setMainGeneration(GenerationSummary main_generation)
{
	this->main_generation = main_generation;
}

std::list<RegionName>
RegionDetail::getNames()
{
	return names;
}

void
RegionDetail::setNames(std::list<RegionName> names)
{
	this->names = names;
}

std::list<PokedexSummary>
RegionDetail::getPokedexes()
{
	return pokedexes;
}

void
RegionDetail::setPokedexes(std::list<PokedexSummary> pokedexes)
{
	this->pokedexes = pokedexes;
}

std::list<AbilityDetail_pokemon_inner_pokemon>
RegionDetail::getVersionGroups()
{
	return version_groups;
}

void
RegionDetail::setVersionGroups(std::list<AbilityDetail_pokemon_inner_pokemon> version_groups)
{
	this->version_groups = version_groups;
}



