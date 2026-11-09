
/*
 * PokeathlonStatDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokeathlonStatDetail_H_
#define TINY_CPP_CLIENT_PokeathlonStatDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "PokeathlonStatAffectingNatures.h"
#include "PokeathlonStatName.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokeathlonStatDetail{
public:

    /*! \brief Constructor.
	 */
    PokeathlonStatDetail();
    PokeathlonStatDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokeathlonStatDetail();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The identifier for this resource.
	 */
	int getId();

	/*! \brief Set The identifier for this resource.
	 */
	void setId(int id);
	/*! \brief Get The name for this resource.
	 */
	std::string getName();

	/*! \brief Set The name for this resource.
	 */
	void setName(std::string name);
	/*! \brief Get A detail of natures which affect this Pokéathlon stat positively or negatively.
	 */
	PokeathlonStatAffectingNatures getAffectingNatures();

	/*! \brief Set A detail of natures which affect this Pokéathlon stat positively or negatively.
	 */
	void setAffectingNatures(PokeathlonStatAffectingNatures affecting_natures);
	/*! \brief Get The name of this resource listed in different languages.
	 */
	std::list<PokeathlonStatName> getNames();

	/*! \brief Set The name of this resource listed in different languages.
	 */
	void setNames(std::list<PokeathlonStatName> names);


    private:
    int id{};
    std::string name{};
    PokeathlonStatAffectingNatures affecting_natures;
    std::list<PokeathlonStatName> names;
};
}

#endif /* TINY_CPP_CLIENT_PokeathlonStatDetail_H_ */
