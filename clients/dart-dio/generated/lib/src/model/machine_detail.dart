//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/item_summary.dart';
import 'package:openapi/src/model/move_summary.dart';
import 'package:openapi/src/model/version_group_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'machine_detail.g.dart';

/// MachineDetail
///
/// Properties:
/// * [id] 
/// * [item] 
/// * [versionGroup] 
/// * [move] 
@BuiltValue()
abstract class MachineDetail implements Built<MachineDetail, MachineDetailBuilder> {
  @BuiltValueField(wireName: r'id')
  int get id;

  @BuiltValueField(wireName: r'item')
  ItemSummary get item;

  @BuiltValueField(wireName: r'version_group')
  VersionGroupSummary get versionGroup;

  @BuiltValueField(wireName: r'move')
  MoveSummary get move;

  MachineDetail._();

  factory MachineDetail([void updates(MachineDetailBuilder b)]) = _$MachineDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MachineDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MachineDetail> get serializer => _$MachineDetailSerializer();
}

class _$MachineDetailSerializer implements PrimitiveSerializer<MachineDetail> {
  @override
  final Iterable<Type> types = const [MachineDetail, _$MachineDetail];

  @override
  final String wireName = r'MachineDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MachineDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(int),
    );
    yield r'item';
    yield serializers.serialize(
      object.item,
      specifiedType: const FullType(ItemSummary),
    );
    yield r'version_group';
    yield serializers.serialize(
      object.versionGroup,
      specifiedType: const FullType(VersionGroupSummary),
    );
    yield r'move';
    yield serializers.serialize(
      object.move,
      specifiedType: const FullType(MoveSummary),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    MachineDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MachineDetailBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.id = valueDes;
          break;
        case r'item':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ItemSummary),
          ) as ItemSummary;
          result.item.replace(valueDes);
          break;
        case r'version_group':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(VersionGroupSummary),
          ) as VersionGroupSummary;
          result.versionGroup.replace(valueDes);
          break;
        case r'move':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MoveSummary),
          ) as MoveSummary;
          result.move.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  MachineDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MachineDetailBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

