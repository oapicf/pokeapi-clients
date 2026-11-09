
/*
 * MoveBattleStyleDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_MoveBattleStyleDetail_H_
#define TINY_CPP_CLIENT_MoveBattleStyleDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MoveBattleStyleName.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class MoveBattleStyleDetail{
public:

    /*! \brief Constructor.
	 */
    MoveBattleStyleDetail();
    MoveBattleStyleDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MoveBattleStyleDetail();


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
	/*! \brief Get The name of this resource listed in different languages.
	 */
	std::list<MoveBattleStyleName> getNames();

	/*! \brief Set The name of this resource listed in different languages.
	 */
	void setNames(std::list<MoveBattleStyleName> names);


    private:
    int id{};
    std::string name{};
    std::list<MoveBattleStyleName> names;
};
}

#endif /* TINY_CPP_CLIENT_MoveBattleStyleDetail_H_ */
