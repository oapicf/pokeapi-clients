# MachineDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** | The identifier for this resource. | [readonly] [default to undefined]
**item** | [**ItemSummary**](ItemSummary.md) | The TM or HM item that corresponds to this machine. | [default to undefined]
**version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group that this machine applies to. | [default to undefined]
**move** | [**MoveSummary**](MoveSummary.md) | The move that is taught by this machine. | [default to undefined]

## Example

```typescript
import { MachineDetail } from './api';

const instance: MachineDetail = {
    id,
    item,
    version_group,
    move,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
