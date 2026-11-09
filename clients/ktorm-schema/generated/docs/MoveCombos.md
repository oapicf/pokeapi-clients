
# Table `MoveCombos`
(mapped from: MoveCombos)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**normal** | normal | long NOT NULL |  | [**MoveComboUsage**](MoveComboUsage.md) | A detail of moves this move can be used before or after, granting additional appeal points in contests. |  [foreignkey]
**super** | super | long NOT NULL |  | [**MoveComboUsage**](MoveComboUsage.md) | A detail of moves this move can be used before or after, granting additional appeal points in super contests. |  [foreignkey]




