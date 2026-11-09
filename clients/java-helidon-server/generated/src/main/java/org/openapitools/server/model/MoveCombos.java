package org.openapitools.server.model;

import org.openapitools.server.model.MoveComboUsage;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class MoveCombos   {

    private MoveComboUsage normal;
    private MoveComboUsage _super;

    /**
     * Default constructor.
     */
    public MoveCombos() {
    // JSON-B / Jackson
    }

    /**
     * Create MoveCombos.
     *
     * @param normal A detail of moves this move can be used before or after, granting additional appeal points in contests.
     * @param _super A detail of moves this move can be used before or after, granting additional appeal points in super contests.
     */
    public MoveCombos(
        MoveComboUsage normal, 
        MoveComboUsage _super
    ) {
        this.normal = normal;
        this._super = _super;
    }



    /**
     * A detail of moves this move can be used before or after, granting additional appeal points in contests.
     * @return normal
     */
    public MoveComboUsage getNormal() {
        return normal;
    }

    public void setNormal(MoveComboUsage normal) {
        this.normal = normal;
    }

    /**
     * A detail of moves this move can be used before or after, granting additional appeal points in super contests.
     * @return _super
     */
    public MoveComboUsage getSuper() {
        return _super;
    }

    public void setSuper(MoveComboUsage _super) {
        this._super = _super;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MoveCombos {\n");
        
        sb.append("    normal: ").append(toIndentedString(normal)).append("\n");
        sb.append("    _super: ").append(toIndentedString(_super)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

