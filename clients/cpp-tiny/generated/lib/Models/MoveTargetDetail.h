
/*
 * MoveTargetDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_MoveTargetDetail_H_
#define TINY_CPP_CLIENT_MoveTargetDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MoveSummary.h"
#include "MoveTargetDescription.h"
#include "MoveTargetName.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class MoveTargetDetail{
public:

    /*! \brief Constructor.
	 */
    MoveTargetDetail();
    MoveTargetDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MoveTargetDetail();


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
	std::list<MoveTargetDescription> getDescriptions();

	/*! \brief Set The description of this resource listed in different languages.
	 */
	void setDescriptions(std::list<MoveTargetDescription> descriptions);
	/*! \brief Get A list of moves that that are directed at this target.
	 */
	std::list<MoveSummary> getMoves();

	/*! \brief Set A list of moves that that are directed at this target.
	 */
	void setMoves(std::list<MoveSummary> moves);
	/*! \brief Get The name of this resource listed in different languages.
	 */
	std::list<MoveTargetName> getNames();

	/*! \brief Set The name of this resource listed in different languages.
	 */
	void setNames(std::list<MoveTargetName> names);


    private:
    int id{};
    std::string name{};
    std::list<MoveTargetDescription> descriptions;
    std::list<MoveSummary> moves;
    std::list<MoveTargetName> names;
};
}

#endif /* TINY_CPP_CLIENT_MoveTargetDetail_H_ */
