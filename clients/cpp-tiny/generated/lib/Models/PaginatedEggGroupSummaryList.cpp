

#include "PaginatedEggGroupSummaryList.h"

using namespace Tiny;

PaginatedEggGroupSummaryList::PaginatedEggGroupSummaryList()
{
	count = int(0);
	next = std::string();
	previous = std::string();
	results = std::list<EggGroupSummary>();
}

PaginatedEggGroupSummaryList::PaginatedEggGroupSummaryList(std::string jsonString)
{
	this->fromJson(jsonString);
}

PaginatedEggGroupSummaryList::~PaginatedEggGroupSummaryList()
{

}

void
PaginatedEggGroupSummaryList::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *countKey = "count";

    if(object.has_key(countKey))
    {
        bourne::json value = object[countKey];



        jsonToValue(&count, value, "int");


    }

    const char *nextKey = "next";

    if(object.has_key(nextKey))
    {
        bourne::json value = object[nextKey];



        jsonToValue(&next, value, "std::string");


    }

    const char *previousKey = "previous";

    if(object.has_key(previousKey))
    {
        bourne::json value = object[previousKey];



        jsonToValue(&previous, value, "std::string");


    }

    const char *resultsKey = "results";

    if(object.has_key(resultsKey))
    {
        bourne::json value = object[resultsKey];


        std::list<EggGroupSummary> results_list;
        EggGroupSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            results_list.push_back(element);
        }
        results = results_list;


    }


}

bourne::json
PaginatedEggGroupSummaryList::toJson()
{
    bourne::json object = bourne::json::object();





    object["count"] = getCount();






    object["next"] = getNext();






    object["previous"] = getPrevious();





    std::list<EggGroupSummary> results_list = getResults();
    bourne::json results_arr = bourne::json::array();

    for(auto& var : results_list)
    {
        EggGroupSummary obj = var;
        results_arr.append(obj.toJson());
    }
    object["results"] = results_arr;




    return object;

}

int
PaginatedEggGroupSummaryList::getCount()
{
	return count;
}

void
PaginatedEggGroupSummaryList::setCount(int  count)
{
	this->count = count;
}

std::string
PaginatedEggGroupSummaryList::getNext()
{
	return next;
}

void
PaginatedEggGroupSummaryList::setNext(std::string  next)
{
	this->next = next;
}

std::string
PaginatedEggGroupSummaryList::getPrevious()
{
	return previous;
}

void
PaginatedEggGroupSummaryList::setPrevious(std::string  previous)
{
	this->previous = previous;
}

std::list<EggGroupSummary>
PaginatedEggGroupSummaryList::getResults()
{
	return results;
}

void
PaginatedEggGroupSummaryList::setResults(std::list <EggGroupSummary> results)
{
	this->results = results;
}



