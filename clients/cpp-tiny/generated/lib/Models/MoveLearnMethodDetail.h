
/*
 * MoveLearnMethodDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_MoveLearnMethodDetail_H_
#define TINY_CPP_CLIENT_MoveLearnMethodDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AbilityDetail_pokemon_inner_pokemon.h"
#include "MoveLearnMethodDescription.h"
#include "MoveLearnMethodName.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class MoveLearnMethodDetail{
public:

    /*! \brief Constructor.
	 */
    MoveLearnMethodDetail();
    MoveLearnMethodDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MoveLearnMethodDetail();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	int getId();

	/*! \brief Set 
	 */
	void setId(int id);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string name);
	/*! \brief Get 
	 */
	std::list<MoveLearnMethodName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list<MoveLearnMethodName> names);
	/*! \brief Get 
	 */
	std::list<MoveLearnMethodDescription> getDescriptions();

	/*! \brief Set 
	 */
	void setDescriptions(std::list<MoveLearnMethodDescription> descriptions);
	/*! \brief Get 
	 */
	std::list<AbilityDetail_pokemon_inner_pokemon> getVersionGroups();

	/*! \brief Set 
	 */
	void setVersionGroups(std::list<AbilityDetail_pokemon_inner_pokemon> version_groups);


    private:
    int id{};
    std::string name{};
    std::list<MoveLearnMethodName> names;
    std::list<MoveLearnMethodDescription> descriptions;
    std::list<AbilityDetail_pokemon_inner_pokemon> version_groups;
};
}

#endif /* TINY_CPP_CLIENT_MoveLearnMethodDetail_H_ */
