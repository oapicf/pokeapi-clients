

#include "PaginatedVersionGroupSummaryList.h"

using namespace Tiny;

PaginatedVersionGroupSummaryList::PaginatedVersionGroupSummaryList()
{
	count = int(0);
	next = std::string();
	previous = std::string();
	results = std::list<VersionGroupSummary>();
}

PaginatedVersionGroupSummaryList::PaginatedVersionGroupSummaryList(std::string jsonString)
{
	this->fromJson(jsonString);
}

PaginatedVersionGroupSummaryList::~PaginatedVersionGroupSummaryList()
{

}

void
PaginatedVersionGroupSummaryList::fromJson(std::string jsonObj)
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


        std::list<VersionGroupSummary> results_list;
        VersionGroupSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            results_list.push_back(element);
        }
        results = results_list;


    }


}

bourne::json
PaginatedVersionGroupSummaryList::toJson()
{
    bourne::json object = bourne::json::object();





    object["count"] = getCount();






    object["next"] = getNext();






    object["previous"] = getPrevious();





    std::list<VersionGroupSummary> results_list = getResults();
    bourne::json results_arr = bourne::json::array();

    for(auto& var : results_list)
    {
        VersionGroupSummary obj = var;
        results_arr.append(obj.toJson());
    }
    object["results"] = results_arr;




    return object;

}

int
PaginatedVersionGroupSummaryList::getCount()
{
	return count;
}

void
PaginatedVersionGroupSummaryList::setCount(int count)
{
	this->count = count;
}

std::string
PaginatedVersionGroupSummaryList::getNext()
{
	return next;
}

void
PaginatedVersionGroupSummaryList::setNext(std::string next)
{
	this->next = next;
}

std::string
PaginatedVersionGroupSummaryList::getPrevious()
{
	return previous;
}

void
PaginatedVersionGroupSummaryList::setPrevious(std::string previous)
{
	this->previous = previous;
}

std::list<VersionGroupSummary>
PaginatedVersionGroupSummaryList::getResults()
{
	return results;
}

void
PaginatedVersionGroupSummaryList::setResults(std::list<VersionGroupSummary> results)
{
	this->results = results;
}



