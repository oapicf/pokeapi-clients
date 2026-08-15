

#include "PaginatedVersionSummaryList.h"

using namespace Tiny;

PaginatedVersionSummaryList::PaginatedVersionSummaryList()
{
	count = int(0);
	next = std::string();
	previous = std::string();
	results = std::list<VersionSummary>();
}

PaginatedVersionSummaryList::PaginatedVersionSummaryList(std::string jsonString)
{
	this->fromJson(jsonString);
}

PaginatedVersionSummaryList::~PaginatedVersionSummaryList()
{

}

void
PaginatedVersionSummaryList::fromJson(std::string jsonObj)
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


        std::list<VersionSummary> results_list;
        VersionSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            results_list.push_back(element);
        }
        results = results_list;


    }


}

bourne::json
PaginatedVersionSummaryList::toJson()
{
    bourne::json object = bourne::json::object();





    object["count"] = getCount();






    object["next"] = getNext();






    object["previous"] = getPrevious();





    std::list<VersionSummary> results_list = getResults();
    bourne::json results_arr = bourne::json::array();

    for(auto& var : results_list)
    {
        VersionSummary obj = var;
        results_arr.append(obj.toJson());
    }
    object["results"] = results_arr;




    return object;

}

int
PaginatedVersionSummaryList::getCount()
{
	return count;
}

void
PaginatedVersionSummaryList::setCount(int  count)
{
	this->count = count;
}

std::string
PaginatedVersionSummaryList::getNext()
{
	return next;
}

void
PaginatedVersionSummaryList::setNext(std::string  next)
{
	this->next = next;
}

std::string
PaginatedVersionSummaryList::getPrevious()
{
	return previous;
}

void
PaginatedVersionSummaryList::setPrevious(std::string  previous)
{
	this->previous = previous;
}

std::list<VersionSummary>
PaginatedVersionSummaryList::getResults()
{
	return results;
}

void
PaginatedVersionSummaryList::setResults(std::list <VersionSummary> results)
{
	this->results = results;
}



