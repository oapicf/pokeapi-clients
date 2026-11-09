
/*
 * MoveDamageClassDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_MoveDamageClassDetail_H_
#define TINY_CPP_CLIENT_MoveDamageClassDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MoveDamageClassDescription.h"
#include "MoveDamageClassName.h"
#include "MoveSummary.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class MoveDamageClassDetail{
public:

    /*! \brief Constructor.
	 */
    MoveDamageClassDetail();
    MoveDamageClassDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MoveDamageClassDetail();


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
	/*! \brief Get The description of this resource listed in different languages.
	 */
	std::list<MoveDamageClassDescription> getDescriptions();

	/*! \brief Set The description of this resource listed in different languages.
	 */
	void setDescriptions(std::list<MoveDamageClassDescription> descriptions);
	/*! \brief Get A list of moves that fall into this damage class.
	 */
	std::list<MoveSummary> getMoves();

	/*! \brief Set A list of moves that fall into this damage class.
	 */
	void setMoves(std::list<MoveSummary> moves);
	/*! \brief Get The name of this resource listed in different languages.
	 */
	std::list<MoveDamageClassName> getNames();

	/*! \brief Set The name of this resource listed in different languages.
	 */
	void setNames(std::list<MoveDamageClassName> names);


    private:
    int id{};
    std::string name{};
    std::list<MoveDamageClassDescription> descriptions;
    std::list<MoveSummary> moves;
    std::list<MoveDamageClassName> names;
};
}

#endif /* TINY_CPP_CLIENT_MoveDamageClassDetail_H_ */
