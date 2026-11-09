

#include "VersionGroupDetail.h"

using namespace Tiny;

VersionGroupDetail::VersionGroupDetail()
{
	id = int(0);
	name = std::string();
	order = int(0);
	generation = null;
	move_learn_methods = std::list<MoveLearnMethodSummary>();
	pokedexes = std::list<PokedexSummary>();
	regions = std::list<RegionSummary>();
	versions = std::list<VersionSummary>();
}

VersionGroupDetail::VersionGroupDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

VersionGroupDetail::~VersionGroupDetail()
{

}

void
VersionGroupDetail::fromJson(std::string jsonObj)
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

    const char *orderKey = "order";

    if(object.has_key(orderKey))
    {
        bourne::json value = object[orderKey];



        jsonToValue(&order, value, "int");


    }

    const char *generationKey = "generation";

    if(object.has_key(generationKey))
    {
        bourne::json value = object[generationKey];




        GenerationSummary* obj = &generation;
		obj->fromJson(value.dump());

    }

    const char *move_learn_methodsKey = "move_learn_methods";

    if(object.has_key(move_learn_methodsKey))
    {
        bourne::json value = object[move_learn_methodsKey];


        std::list<MoveLearnMethodSummary> move_learn_methods_list;
        MoveLearnMethodSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            move_learn_methods_list.push_back(element);
        }
        move_learn_methods = move_learn_methods_list;


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

    const char *regionsKey = "regions";

    if(object.has_key(regionsKey))
    {
        bourne::json value = object[regionsKey];


        std::list<RegionSummary> regions_list;
        RegionSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            regions_list.push_back(element);
        }
        regions = regions_list;


    }

    const char *versionsKey = "versions";

    if(object.has_key(versionsKey))
    {
        bourne::json value = object[versionsKey];


        std::list<VersionSummary> versions_list;
        VersionSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            versions_list.push_back(element);
        }
        versions = versions_list;


    }


}

bourne::json
VersionGroupDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();






    object["order"] = getOrder();







	object["generation"] = getGeneration().toJson();




    std::list<MoveLearnMethodSummary> move_learn_methods_list = getMoveLearnMethods();
    bourne::json move_learn_methods_arr = bourne::json::array();

    for(auto& var : move_learn_methods_list)
    {
        MoveLearnMethodSummary obj = var;
        move_learn_methods_arr.append(obj.toJson());
    }
    object["move_learn_methods"] = move_learn_methods_arr;






    std::list<PokedexSummary> pokedexes_list = getPokedexes();
    bourne::json pokedexes_arr = bourne::json::array();

    for(auto& var : pokedexes_list)
    {
        PokedexSummary obj = var;
        pokedexes_arr.append(obj.toJson());
    }
    object["pokedexes"] = pokedexes_arr;






    std::list<RegionSummary> regions_list = getRegions();
    bourne::json regions_arr = bourne::json::array();

    for(auto& var : regions_list)
    {
        RegionSummary obj = var;
        regions_arr.append(obj.toJson());
    }
    object["regions"] = regions_arr;






    std::list<VersionSummary> versions_list = getVersions();
    bourne::json versions_arr = bourne::json::array();

    for(auto& var : versions_list)
    {
        VersionSummary obj = var;
        versions_arr.append(obj.toJson());
    }
    object["versions"] = versions_arr;




    return object;

}

int
VersionGroupDetail::getId()
{
	return id;
}

void
VersionGroupDetail::setId(int id)
{
	this->id = id;
}

std::string
VersionGroupDetail::getName()
{
	return name;
}

void
VersionGroupDetail::setName(std::string name)
{
	this->name = name;
}

int
VersionGroupDetail::getOrder()
{
	return order;
}

void
VersionGroupDetail::setOrder(int order)
{
	this->order = order;
}

GenerationSummary
VersionGroupDetail::getGeneration()
{
	return generation;
}

void
VersionGroupDetail::setGeneration(GenerationSummary generation)
{
	this->generation = generation;
}

std::list<MoveLearnMethodSummary>
VersionGroupDetail::getMoveLearnMethods()
{
	return move_learn_methods;
}

void
VersionGroupDetail::setMoveLearnMethods(std::list<MoveLearnMethodSummary> move_learn_methods)
{
	this->move_learn_methods = move_learn_methods;
}

std::list<PokedexSummary>
VersionGroupDetail::getPokedexes()
{
	return pokedexes;
}

void
VersionGroupDetail::setPokedexes(std::list<PokedexSummary> pokedexes)
{
	this->pokedexes = pokedexes;
}

std::list<RegionSummary>
VersionGroupDetail::getRegions()
{
	return regions;
}

void
VersionGroupDetail::setRegions(std::list<RegionSummary> regions)
{
	this->regions = regions;
}

std::list<VersionSummary>
VersionGroupDetail::getVersions()
{
	return versions;
}

void
VersionGroupDetail::setVersions(std::list<VersionSummary> versions)
{
	this->versions = versions;
}



