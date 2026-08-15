//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/encounter_condition_name.dart';
import 'package:openapi/src/model/encounter_condition_value_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'encounter_condition_detail.g.dart';

/// EncounterConditionDetail
///
/// Properties:
/// * [id] 
/// * [name] 
/// * [values] 
/// * [names] 
@BuiltValue()
abstract class EncounterConditionDetail implements Built<EncounterConditionDetail, EncounterConditionDetailBuilder> {
  @BuiltValueField(wireName: r'id')
  int get id;

  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'values')
  BuiltList<EncounterConditionValueSummary> get values;

  @BuiltValueField(wireName: r'names')
  BuiltList<EncounterConditionName> get names;

  EncounterConditionDetail._();

  factory EncounterConditionDetail([void updates(EncounterConditionDetailBuilder b)]) = _$EncounterConditionDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(EncounterConditionDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<EncounterConditionDetail> get serializer => _$EncounterConditionDetailSerializer();
}

class _$EncounterConditionDetailSerializer implements PrimitiveSerializer<EncounterConditionDetail> {
  @override
  final Iterable<Type> types = const [EncounterConditionDetail, _$EncounterConditionDetail];

  @override
  final String wireName = r'EncounterConditionDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    EncounterConditionDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(int),
    );
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    yield r'values';
    yield serializers.serialize(
      object.values,
      specifiedType: const FullType(BuiltList, [FullType(EncounterConditionValueSummary)]),
    );
    yield r'names';
    yield serializers.serialize(
      object.names,
      specifiedType: const FullType(BuiltList, [FullType(EncounterConditionName)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    EncounterConditionDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required EncounterConditionDetailBuilder result,
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
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'values':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(EncounterConditionValueSummary)]),
          ) as BuiltList<EncounterConditionValueSummary>;
          result.values.replace(valueDes);
          break;
        case r'names':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(EncounterConditionName)]),
          ) as BuiltList<EncounterConditionName>;
          result.names.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  EncounterConditionDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = EncounterConditionDetailBuilder();
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

